package com.robinhood.android.onboarding.p205ui.postusercreation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.databinding.ActivityRdsLoadingBinding;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.OnboardingFlowPathType;
import com.robinhood.android.onboarding.contracts.PostUserCreationShimIntentKey;
import com.robinhood.android.onboarding.contracts.SdOnboardingIntentKey;
import com.robinhood.android.onboarding.p205ui.postusercreation.PostUserCreationShimViewState2;
import com.robinhood.android.rhyonboarding.contracts.RhyUpgradeKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PostUserCreationShimActivity.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0015H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "duxo", "Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimDuxo;", "getDuxo", "()Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "bindings", "Lcom/robinhood/android/common/ui/databinding/ActivityRdsLoadingBinding;", "getBindings", "()Lcom/robinhood/android/common/ui/databinding/ActivityRdsLoadingBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenSource", "", "getScreenSource", "()Ljava/lang/String;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "shouldPromptForLockscreen", "", "bindViewState", "state", "Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimViewState;", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PostUserCreationShimActivity extends BaseActivity {

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PostUserCreationShimActivity.class, "bindings", "getBindings()Lcom/robinhood/android/common/ui/databinding/ActivityRdsLoadingBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return false;
    }

    public PostUserCreationShimActivity() {
        super(C11839R.layout.activity_rds_loading);
        this.duxo = OldDuxos.oldDuxo(this, PostUserCreationShimDuxo.class);
        this.bindings = ViewBinding5.viewBinding(this, PostUserCreationShimActivity2.INSTANCE);
    }

    private final PostUserCreationShimDuxo getDuxo() {
        return (PostUserCreationShimDuxo) this.duxo.getValue();
    }

    private final ActivityRdsLoadingBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityRdsLoadingBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return ((PostUserCreationShimIntentKey) INSTANCE.getExtras((Activity) this)).getSource();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        if (((PostUserCreationShimIntentKey) INSTANCE.getExtras((Activity) this)).getForceDarkTheme()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        ShimmerLoadingView root = getBindings().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(root, InsetSides.INSTANCE.m26684getVerticalXedK2Rk());
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        Observable observableTakeUntil = ObservablesAndroid.observeOnMainThread(getDuxo().getStates()).takeUntil((Predicate) new Predicate() { // from class: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimActivity.onStart.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(PostUserCreationShimViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getIsFinalState();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTakeUntil, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C228902(this));
    }

    /* compiled from: PostUserCreationShimActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimActivity$onStart$2 */
    /* synthetic */ class C228902 extends FunctionReferenceImpl implements Function1<PostUserCreationShimViewState, Unit> {
        C228902(Object obj) {
            super(1, obj, PostUserCreationShimActivity.class, "bindViewState", "bindViewState(Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PostUserCreationShimViewState postUserCreationShimViewState) throws Throwable {
            invoke2(postUserCreationShimViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PostUserCreationShimViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PostUserCreationShimActivity) this.receiver).bindViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(PostUserCreationShimViewState state) throws Throwable {
        Throwable thConsume;
        if (state.getIsFinalState()) {
            PostUserCreationShimViewState2 onboardingArgs = state.getOnboardingArgs();
            Intrinsics.checkNotNull(onboardingArgs);
            if (onboardingArgs instanceof PostUserCreationShimViewState2.RhyUpgrade) {
                PostUserCreationShimViewState2.RhyUpgrade rhyUpgrade = (PostUserCreationShimViewState2.RhyUpgrade) onboardingArgs;
                Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new RhyUpgradeKey(rhyUpgrade.getExitDeeplinkOverride(), rhyUpgrade.getQueryParameters()), null, false, null, null, 60, null);
            } else {
                if (!(onboardingArgs instanceof PostUserCreationShimViewState2.SdOnboarding)) {
                    throw new NoWhenBranchMatchedException();
                }
                Navigator navigator = getNavigator();
                PostUserCreationShimViewState2.SdOnboarding sdOnboarding = (PostUserCreationShimViewState2.SdOnboarding) onboardingArgs;
                OnboardingFlowPathType flowPathType = sdOnboarding.getFlowPathType();
                Companion companion = INSTANCE;
                String source = ((PostUserCreationShimIntentKey) companion.getExtras((Activity) this)).getSource();
                Uri exitDeeplinkOverride = ((PostUserCreationShimIntentKey) companion.getExtras((Activity) this)).getExitDeeplinkOverride();
                if (exitDeeplinkOverride == null) {
                    exitDeeplinkOverride = sdOnboarding.getExitDeeplinkOverride();
                }
                Navigator.DefaultImpls.startActivity$default(navigator, this, new SdOnboardingIntentKey(flowPathType, source, exitDeeplinkOverride, sdOnboarding.getEntryPointIdentifier(), ((PostUserCreationShimIntentKey) companion.getExtras((Activity) this)).getForceDarkTheme()), null, false, null, null, 60, null);
            }
            finish();
            return;
        }
        UiEvent<Throwable> error = state.getError();
        if (error == null || (thConsume = error.consume()) == null) {
            return;
        }
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, thConsume, true, false, 0, null, 56, null);
    }

    /* compiled from: PostUserCreationShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimActivity;", "Lcom/robinhood/android/onboarding/contracts/PostUserCreationShimIntentKey;", "<init>", "()V", "getIntentWithExtras", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "extras", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<PostUserCreationShimActivity, PostUserCreationShimIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public PostUserCreationShimIntentKey getExtras(PostUserCreationShimActivity postUserCreationShimActivity) {
            return (PostUserCreationShimIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, postUserCreationShimActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, PostUserCreationShimIntentKey postUserCreationShimIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, postUserCreationShimIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, PostUserCreationShimIntentKey extras) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intent intentAddFlags = IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, extras).addFlags(67108864);
            Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
            return intentAddFlags;
        }
    }
}
