package com.robinhood.android.margin.p174ui.instant;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeRetirementSplashDuxo2;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeRetirementSplashFragment;
import com.robinhood.android.regiongate.InstantDepositRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: InstantUpgradeRetirementSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002*\u0001\u0018\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0002()B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\r\u0010\u001f\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\"H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashDuxo;", "getDuxo", "()Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "retirementOnboardingOverlay", "com/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashFragment$retirementOnboardingOverlay$2$1", "getRetirementOnboardingOverlay", "()Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashFragment$retirementOnboardingOverlay$2$1;", "retirementOnboardingOverlay$delegate", "onStart", "", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-margin_externalDebug", "viewState", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class InstantUpgradeRetirementSplashFragment extends GenericComposeFragment implements RegionGated {
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InstantUpgradeRetirementSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(InstantDepositRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, InstantUpgradeRetirementSplashDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof InstantUpgradeRetirementSplashFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: retirementOnboardingOverlay$delegate, reason: from kotlin metadata */
    private final Lazy retirementOnboardingOverlay = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashFragment$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InstantUpgradeRetirementSplashFragment.retirementOnboardingOverlay_delegate$lambda$0();
        }
    });

    /* compiled from: InstantUpgradeRetirementSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashFragment$Callbacks;", "", "onActivateClicked", "", "onNoThanksClicked", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onActivateClicked();

        void onNoThanksClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9(InstantUpgradeRetirementSplashFragment instantUpgradeRetirementSplashFragment, int i, Composer composer, int i2) {
        instantUpgradeRetirementSplashFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    private final InstantUpgradeRetirementSplashDuxo getDuxo() {
        return (InstantUpgradeRetirementSplashDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    private final InstantUpgradeRetirementSplashFragment3 getRetirementOnboardingOverlay() {
        return (InstantUpgradeRetirementSplashFragment3) this.retirementOnboardingOverlay.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstantUpgradeRetirementSplashFragment3 retirementOnboardingOverlay_delegate$lambda$0() {
        return new InstantUpgradeRetirementSplashFragment3();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getScarletManager().putOverlay(getRetirementOnboardingOverlay(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ScarletManager.removeOverlay$default(getScarletManager(), getRetirementOnboardingOverlay().getPriority(), null, 2, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(864966034);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(864966034, i2, -1, "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashFragment.ComposeContent (InstantUpgradeRetirementSplashFragment.kt:62)");
            }
            InstantUpgradeRetirementSplashDuxo2 instantUpgradeRetirementSplashDuxo2ComposeContent$lambda$1 = ComposeContent$lambda$1(RxJava2Adapter.subscribeAsState(getDuxo().getStates(), InstantUpgradeRetirementSplashDuxo2.Loading.INSTANCE, composerStartRestartGroup, 48));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InstantUpgradeRetirementSplashFragment2(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstantUpgradeRetirementSplashFragment.ComposeContent$lambda$4$lambda$3(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstantUpgradeRetirementSplashFragment.ComposeContent$lambda$6$lambda$5(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function02 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InstantUpgradeRetirementSplashFragment.ComposeContent$lambda$8$lambda$7(this.f$0, (Throwable) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            InstantUpgradeRetirementSplashComposable.InstantUpgradeRetirementSplashComposable(instantUpgradeRetirementSplashDuxo2ComposeContent$lambda$1, sduiActionHandler, null, function0, function02, (Function1) objRememberedValue4, composerStartRestartGroup, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstantUpgradeRetirementSplashFragment.ComposeContent$lambda$9(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final InstantUpgradeRetirementSplashDuxo2 ComposeContent$lambda$1(SnapshotState4<? extends InstantUpgradeRetirementSplashDuxo2> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(InstantUpgradeRetirementSplashFragment instantUpgradeRetirementSplashFragment) {
        instantUpgradeRetirementSplashFragment.getCallbacks().onActivateClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6$lambda$5(InstantUpgradeRetirementSplashFragment instantUpgradeRetirementSplashFragment) {
        instantUpgradeRetirementSplashFragment.getCallbacks().onNoThanksClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8$lambda$7(InstantUpgradeRetirementSplashFragment instantUpgradeRetirementSplashFragment, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        AbsErrorHandler.handleError$default(instantUpgradeRetirementSplashFragment.getActivityErrorHandler(), throwable, false, 2, null);
        return Unit.INSTANCE;
    }

    /* compiled from: InstantUpgradeRetirementSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashFragment;", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InstantUpgradeRetirementSplashFragment newInstance() {
            return new InstantUpgradeRetirementSplashFragment();
        }
    }
}
