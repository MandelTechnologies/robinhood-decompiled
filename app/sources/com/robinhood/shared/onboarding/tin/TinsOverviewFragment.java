package com.robinhood.shared.onboarding.tin;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.GenericSdFlowIntentKey;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.Tin;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.onboarding.contracts.TinsOverviewIntentKey;
import com.robinhood.shared.onboarding.tin.TinsOverviewFragment;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: TinsOverviewFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\r\u0010\u0015\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/tin/TinsOverviewFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "duxo", "Lcom/robinhood/shared/onboarding/tin/TinsOverviewDuxo;", "getDuxo", "()Lcom/robinhood/shared/onboarding/tin/TinsOverviewDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onBackPressed", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-tin_externalDebug", "viewState", "Lcom/robinhood/shared/onboarding/tin/TinsOverviewViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TinsOverviewFragment extends GenericComposeFragment {
    public AppType appType;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, TinsOverviewDuxo.class);
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(TinsOverviewFragment tinsOverviewFragment, int i, Composer composer, int i2) {
        tinsOverviewFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final TinsOverviewDuxo getDuxo() {
        return (TinsOverviewDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getAppType() == AppType.TRADER) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, MainActivityIntentKey.INSTANCE, null, false, 12, null);
            intentCreateIntent$default.setFlags(268468224);
            startActivity(intentCreateIntent$default);
            return true;
        }
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2014443877);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2014443877, i2, -1, "com.robinhood.shared.onboarding.tin.TinsOverviewFragment.ComposeContent (TinsOverviewFragment.kt:75)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(383285104, true, new C392581(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.tin.TinsOverviewFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TinsOverviewFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: TinsOverviewFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.onboarding.tin.TinsOverviewFragment$ComposeContent$1 */
    static final class C392581 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<TinsOverviewViewState> $viewState$delegate;

        C392581(SnapshotState4<TinsOverviewViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(383285104, i, -1, "com.robinhood.shared.onboarding.tin.TinsOverviewFragment.ComposeContent.<anonymous> (TinsOverviewFragment.kt:79)");
            }
            ImmutableList3<Tin> tins = TinsOverviewFragment.ComposeContent$lambda$1(this.$viewState$delegate).getTins();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(TinsOverviewFragment.this);
            final TinsOverviewFragment tinsOverviewFragment = TinsOverviewFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.onboarding.tin.TinsOverviewFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TinsOverviewFragment.C392581.invoke$lambda$1$lambda$0(tinsOverviewFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(TinsOverviewFragment.this);
            final TinsOverviewFragment tinsOverviewFragment2 = TinsOverviewFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.onboarding.tin.TinsOverviewFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TinsOverviewFragment.C392581.invoke$lambda$3$lambda$2(tinsOverviewFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(TinsOverviewFragment.this);
            final TinsOverviewFragment tinsOverviewFragment3 = TinsOverviewFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.onboarding.tin.TinsOverviewFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TinsOverviewFragment.C392581.invoke$lambda$5$lambda$4(tinsOverviewFragment3, (Tin) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function1 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(TinsOverviewFragment.this);
            final TinsOverviewFragment tinsOverviewFragment4 = TinsOverviewFragment.this;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.onboarding.tin.TinsOverviewFragment$ComposeContent$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TinsOverviewFragment.C392581.invoke$lambda$7$lambda$6(tinsOverviewFragment4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            TinsOverviewFragment5.TinsOverviewScaffold(tins, function0, function02, function1, (Function0) objRememberedValue4, null, composer, 0, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(TinsOverviewFragment tinsOverviewFragment) {
            tinsOverviewFragment.onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(TinsOverviewFragment tinsOverviewFragment) {
            Navigator navigator = tinsOverviewFragment.getNavigator();
            Context contextRequireContext = tinsOverviewFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Companion companion = TinsOverviewFragment.INSTANCE;
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GenericSdFlowIntentKey(((TinsOverviewIntentKey) companion.getArgs((Fragment) tinsOverviewFragment)).getEndpoint(), false, null, null, null, null, false, ((TinsOverviewIntentKey) companion.getArgs((Fragment) tinsOverviewFragment)).getCompletionCheckpoint(), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, null), null, false, null, null, 60, null);
            tinsOverviewFragment.requireActivity().finish();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(TinsOverviewFragment tinsOverviewFragment, Tin tin) {
            Intrinsics.checkNotNullParameter(tin, "tin");
            Navigator navigator = tinsOverviewFragment.getNavigator();
            Context contextRequireContext = tinsOverviewFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GenericSdFlowIntentKey(((TinsOverviewIntentKey) TinsOverviewFragment.INSTANCE.getArgs((Fragment) tinsOverviewFragment)).getOnboardingId() + "/adjust_tin", false, null, null, MapsKt.mapOf(Tuples4.m3642to(PlaceTypes.COUNTRY, tin.getCountryCode())), null, false, null, null, 430, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(TinsOverviewFragment tinsOverviewFragment) {
            Navigator navigator = tinsOverviewFragment.getNavigator();
            Context contextRequireContext = tinsOverviewFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GenericSdFlowIntentKey(((TinsOverviewIntentKey) TinsOverviewFragment.INSTANCE.getArgs((Fragment) tinsOverviewFragment)).getOnboardingId() + "/add_tin", false, null, null, null, null, false, null, null, 446, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TinsOverviewViewState ComposeContent$lambda$1(SnapshotState4<TinsOverviewViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: TinsOverviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/tin/TinsOverviewFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/onboarding/tin/TinsOverviewFragment;", "Lcom/robinhood/shared/onboarding/contracts/TinsOverviewIntentKey;", "<init>", "()V", "feature-tin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TinsOverviewFragment, TinsOverviewIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public TinsOverviewIntentKey getArgs(TinsOverviewFragment tinsOverviewFragment) {
            return (TinsOverviewIntentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, tinsOverviewFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TinsOverviewFragment newInstance(TinsOverviewIntentKey tinsOverviewIntentKey) {
            return (TinsOverviewFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, tinsOverviewIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TinsOverviewFragment tinsOverviewFragment, TinsOverviewIntentKey tinsOverviewIntentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, tinsOverviewFragment, tinsOverviewIntentKey);
        }
    }
}
