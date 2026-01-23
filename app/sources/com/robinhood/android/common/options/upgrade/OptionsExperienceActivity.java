package com.robinhood.android.common.options.upgrade;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.upgrade.OptionUpgradeExperienceQuestionFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsExperienceActivity.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\t\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/options/upgrade/OptionsExperienceActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/options/upgrade/OptionUpgradeExperienceQuestionFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/common/options/upgrade/OptionsExperienceDuxo;", "getDuxo", "()Lcom/robinhood/android/common/options/upgrade/OptionsExperienceDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onExperienceAnswered", "optionInvestmentExperience", "", "setViewState", "state", "Lcom/robinhood/android/common/options/upgrade/OptionsExperienceViewState;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionsExperienceActivity extends BaseActivity implements OptionUpgradeExperienceQuestionFragment.Callbacks, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionsExperienceActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, OptionsExperienceDuxo.class);
    }

    private final OptionsExperienceDuxo getDuxo() {
        return (OptionsExperienceDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, OptionUpgradeExperienceQuestionFragment.INSTANCE.newInstance((Parcelable) new OptionUpgradeExperienceQuestionFragment.Args("", false, null)));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C114621(this));
    }

    /* compiled from: OptionsExperienceActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.upgrade.OptionsExperienceActivity$onStart$1 */
    /* synthetic */ class C114621 extends FunctionReferenceImpl implements Function1<OptionsExperienceViewState, Unit> {
        C114621(Object obj) {
            super(1, obj, OptionsExperienceActivity.class, "setViewState", "setViewState(Lcom/robinhood/android/common/options/upgrade/OptionsExperienceViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OptionsExperienceViewState optionsExperienceViewState) {
            invoke2(optionsExperienceViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OptionsExperienceViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionsExperienceActivity) this.receiver).setViewState(p0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.common.options.upgrade.OptionUpgradeExperienceQuestionFragment.Callbacks
    public void onExperienceAnswered(String optionInvestmentExperience) {
        Intrinsics.checkNotNullParameter(optionInvestmentExperience, "optionInvestmentExperience");
        getDuxo().submitOptionsExperience(optionInvestmentExperience);
        setFragment(C11048R.id.fragment_container, ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(ShimmerLoaderType.Boxes.INSTANCE, null, 2, 0 == true ? 1 : 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(OptionsExperienceViewState state) {
        Throwable thConsume;
        UiEvent<Unit> onSubmitFinished = state.getOnSubmitFinished();
        if ((onSubmitFinished != null ? onSubmitFinished.consume() : null) != null) {
            finish();
        }
        UiEvent<Throwable> error = state.getError();
        if (error == null || (thConsume = error.consume()) == null) {
            return;
        }
        AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null);
    }

    /* compiled from: OptionsExperienceActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/options/upgrade/OptionsExperienceActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$OptionsExperience;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.OptionsExperience> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.OptionsExperience key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            return new Intent(context, (Class<?>) OptionsExperienceActivity.class);
        }
    }
}
