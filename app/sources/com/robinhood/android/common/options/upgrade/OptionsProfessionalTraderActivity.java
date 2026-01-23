package com.robinhood.android.common.options.upgrade;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.upgrade.OptionUpgradeProfessionalQuestionFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsProfessionalTraderActivity.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u0013H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/common/options/upgrade/OptionsProfessionalTraderActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/common/options/upgrade/OptionsProfessionalTraderDuxo;", "getDuxo", "()Lcom/robinhood/android/common/options/upgrade/OptionsProfessionalTraderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onProfessionalAnswered", "isProfessionalTrader", "", "question", "Lcom/robinhood/android/common/options/upgrade/OptionUpgradeProfessionalQuestionFragment$Question;", "setViewState", "state", "Lcom/robinhood/android/common/options/upgrade/OptionsProfessionalTraderViewState;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionsProfessionalTraderActivity extends BaseActivity implements OptionUpgradeProfessionalQuestionFragment.Callbacks, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionsProfessionalTraderActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionUpgradeProfessionalQuestionFragment.Question.values().length];
            try {
                iArr[OptionUpgradeProfessionalQuestionFragment.Question.ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionUpgradeProfessionalQuestionFragment.Question.TWO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionsProfessionalTraderActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, OptionsProfessionalTraderDuxo.class);
    }

    private final OptionsProfessionalTraderDuxo getDuxo() {
        return (OptionsProfessionalTraderDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, OptionUpgradeProfessionalQuestionFragment.INSTANCE.newInstance((Parcelable) new OptionUpgradeProfessionalQuestionFragment.Args(OptionUpgradeProfessionalQuestionFragment.Question.ONE, ((LegacyIntentKey.OptionsProfessionalTrader) INSTANCE.getExtras((Activity) this)).getSource(), false, null, 4, null)));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C114631(this));
    }

    /* compiled from: OptionsProfessionalTraderActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.upgrade.OptionsProfessionalTraderActivity$onStart$1 */
    /* synthetic */ class C114631 extends FunctionReferenceImpl implements Function1<OptionsProfessionalTraderViewState, Unit> {
        C114631(Object obj) {
            super(1, obj, OptionsProfessionalTraderActivity.class, "setViewState", "setViewState(Lcom/robinhood/android/common/options/upgrade/OptionsProfessionalTraderViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OptionsProfessionalTraderViewState optionsProfessionalTraderViewState) {
            invoke2(optionsProfessionalTraderViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OptionsProfessionalTraderViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionsProfessionalTraderActivity) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.options.upgrade.OptionUpgradeProfessionalQuestionFragment.Callbacks
    public void onProfessionalAnswered(boolean isProfessionalTrader, OptionUpgradeProfessionalQuestionFragment.Question question) {
        Intrinsics.checkNotNullParameter(question, "question");
        if (isProfessionalTrader) {
            getDuxo().submitProfessionalTraderStatus(true);
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[question.ordinal()];
        if (i == 1) {
            replaceFragment(OptionUpgradeProfessionalQuestionFragment.INSTANCE.newInstance((Parcelable) new OptionUpgradeProfessionalQuestionFragment.Args(OptionUpgradeProfessionalQuestionFragment.Question.TWO, ((LegacyIntentKey.OptionsProfessionalTrader) INSTANCE.getExtras((Activity) this)).getSource(), true, null)));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getDuxo().submitProfessionalTraderStatus(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(OptionsProfessionalTraderViewState state) {
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

    /* compiled from: OptionsProfessionalTraderActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/options/upgrade/OptionsProfessionalTraderActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/common/options/upgrade/OptionsProfessionalTraderActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$OptionsProfessionalTrader;", "<init>", "()V", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<OptionsProfessionalTraderActivity, LegacyIntentKey.OptionsProfessionalTrader> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.OptionsProfessionalTrader getExtras(OptionsProfessionalTraderActivity optionsProfessionalTraderActivity) {
            return (LegacyIntentKey.OptionsProfessionalTrader) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, optionsProfessionalTraderActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.OptionsProfessionalTrader optionsProfessionalTrader) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, optionsProfessionalTrader);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.OptionsProfessionalTrader optionsProfessionalTrader) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, optionsProfessionalTrader);
        }
    }
}
