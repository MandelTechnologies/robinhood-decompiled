package com.robinhood.android.cash.flat.cashback.p071ui.bottomsheet;

import android.os.Parcelable;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.cash.flat.cashback.C10067R;
import com.robinhood.android.cash.flat.cashback.p071ui.bottomsheet.FlatCashbackUpsellBottomSheetFragment;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackViewState;
import com.robinhood.android.cash.flat.cashback.p071ui.common.FlatCashbackLoadableComposable;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.contracts.FlatCashbackOnboardingContract;
import com.robinhood.android.rhyrewards.p246ui.MerchantRewardsOfferDetailsBottomSheet;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.librobinhood.data.prefs.HasVisitedFlatCashbackUpsellPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: FlatCashbackUpsellBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001!B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\r\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0019J\t\u0010\u001a\u001a\u00020\u001bH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\"²\u0006\u0010\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/bottomsheet/FlatCashbackUpsellBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "hasVisitedFlatCashbackUpsellPref", "Lcom/robinhood/prefs/BooleanPreference;", "getHasVisitedFlatCashbackUpsellPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasVisitedFlatCashbackUpsellPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/cash/flat/cashback/ui/bottomsheet/FlatCashbackUpsellBottomSheetDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/flat/cashback/ui/bottomsheet/FlatCashbackUpsellBottomSheetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onStart", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-flat-cashback_externalDebug", "viewState", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState;", "Lcom/robinhood/android/cash/flat/cashback/ui/bottomsheet/FlatCashbackUpsellBottomSheetViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FlatCashbackUpsellBottomSheetFragment extends GenericComposeBottomSheetDialogFragment implements RegionGated, AutoLoggableFragment {

    @HasVisitedFlatCashbackUpsellPref
    public BooleanPreference hasVisitedFlatCashbackUpsellPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    private final Screen eventScreen = new Screen(null, null, getScreenName(), null, 11, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, FlatCashbackUpsellBottomSheetDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(FlatCashbackUpsellBottomSheetFragment flatCashbackUpsellBottomSheetFragment, int i, Composer composer, int i2) {
        flatCashbackUpsellBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public final BooleanPreference getHasVisitedFlatCashbackUpsellPref() {
        BooleanPreference booleanPreference = this.hasVisitedFlatCashbackUpsellPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasVisitedFlatCashbackUpsellPref");
        return null;
    }

    public final void setHasVisitedFlatCashbackUpsellPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasVisitedFlatCashbackUpsellPref = booleanPreference;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    private final FlatCashbackUpsellBottomSheetDuxo getDuxo() {
        return (FlatCashbackUpsellBottomSheetDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getHasVisitedFlatCashbackUpsellPref().set(true);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-479313665);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-479313665, i2, -1, "com.robinhood.android.cash.flat.cashback.ui.bottomsheet.FlatCashbackUpsellBottomSheetFragment.ComposeContent (FlatCashbackUpsellBottomSheetFragment.kt:42)");
            }
            BaseFlatCashbackViewState<FlatCashbackUpsellBottomSheetViewState> baseFlatCashbackViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.flat.cashback.ui.bottomsheet.FlatCashbackUpsellBottomSheetFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FlatCashbackUpsellBottomSheetFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            FlatCashbackLoadableComposable.FlatCashbackLoadableComposable(baseFlatCashbackViewStateComposeContent$lambda$0, (Function0) objRememberedValue, SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(C10067R.dimen.half_sheet_placeholder_height, composerStartRestartGroup, 0)), ComposableLambda3.rememberComposableLambda(-391871033, true, new C101012(), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.flat.cashback.ui.bottomsheet.FlatCashbackUpsellBottomSheetFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FlatCashbackUpsellBottomSheetFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(FlatCashbackUpsellBottomSheetFragment flatCashbackUpsellBottomSheetFragment) {
        flatCashbackUpsellBottomSheetFragment.getDuxo().reload();
        return Unit.INSTANCE;
    }

    /* compiled from: FlatCashbackUpsellBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.flat.cashback.ui.bottomsheet.FlatCashbackUpsellBottomSheetFragment$ComposeContent$2 */
    static final class C101012 implements Function3<FlatCashbackUpsellBottomSheetViewState, Composer, Integer, Unit> {
        C101012() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(FlatCashbackUpsellBottomSheetViewState flatCashbackUpsellBottomSheetViewState, Composer composer, Integer num) {
            invoke(flatCashbackUpsellBottomSheetViewState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final FlatCashbackUpsellBottomSheetViewState loadedViewState, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(loadedViewState, "loadedViewState");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-391871033, i, -1, "com.robinhood.android.cash.flat.cashback.ui.bottomsheet.FlatCashbackUpsellBottomSheetFragment.ComposeContent.<anonymous> (FlatCashbackUpsellBottomSheetFragment.kt:50)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(FlatCashbackUpsellBottomSheetFragment.this);
            final FlatCashbackUpsellBottomSheetFragment flatCashbackUpsellBottomSheetFragment = FlatCashbackUpsellBottomSheetFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.flat.cashback.ui.bottomsheet.FlatCashbackUpsellBottomSheetFragment$ComposeContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FlatCashbackUpsellBottomSheetFragment.C101012.invoke$lambda$1$lambda$0(flatCashbackUpsellBottomSheetFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(FlatCashbackUpsellBottomSheetFragment.this);
            final FlatCashbackUpsellBottomSheetFragment flatCashbackUpsellBottomSheetFragment2 = FlatCashbackUpsellBottomSheetFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cash.flat.cashback.ui.bottomsheet.FlatCashbackUpsellBottomSheetFragment$ComposeContent$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FlatCashbackUpsellBottomSheetFragment.C101012.invoke$lambda$3$lambda$2(flatCashbackUpsellBottomSheetFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composer.changedInstance(loadedViewState) | composer.changedInstance(FlatCashbackUpsellBottomSheetFragment.this);
            final FlatCashbackUpsellBottomSheetFragment flatCashbackUpsellBottomSheetFragment3 = FlatCashbackUpsellBottomSheetFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.cash.flat.cashback.ui.bottomsheet.FlatCashbackUpsellBottomSheetFragment$ComposeContent$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FlatCashbackUpsellBottomSheetFragment.C101012.invoke$lambda$5$lambda$4(loadedViewState, flatCashbackUpsellBottomSheetFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function03 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            FlatCashbackUpsellBottomSheetFragment flatCashbackUpsellBottomSheetFragment4 = FlatCashbackUpsellBottomSheetFragment.this;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(flatCashbackUpsellBottomSheetFragment4);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new FlatCashbackUpsellBottomSheetFragment2(flatCashbackUpsellBottomSheetFragment4);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            FlatCashbackUpsellBottomSheetComposable.FlatCashbackUpsellBottomSheetComposable(function0, function02, function03, (Function0) ((KFunction) objRememberedValue4), loadedViewState, composer, (i << 12) & 57344);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(FlatCashbackUpsellBottomSheetFragment flatCashbackUpsellBottomSheetFragment) {
            flatCashbackUpsellBottomSheetFragment.dismiss();
            Navigator navigator = flatCashbackUpsellBottomSheetFragment.getNavigator();
            android.content.Context contextRequireContext = flatCashbackUpsellBottomSheetFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new FlatCashbackOnboardingContract.Key(FlatCashbackOnboardingContract.EntryPoint.DIRECT_DEPOSIT), false, false, false, null, false, null, false, false, null, null, 4084, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(FlatCashbackUpsellBottomSheetFragment flatCashbackUpsellBottomSheetFragment) {
            flatCashbackUpsellBottomSheetFragment.dismiss();
            Navigator navigator = flatCashbackUpsellBottomSheetFragment.getNavigator();
            android.content.Context contextRequireContext = flatCashbackUpsellBottomSheetFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new FlatCashbackOnboardingContract.Key(FlatCashbackOnboardingContract.EntryPoint.RECURRING_ACH_DEPOSIT), false, false, false, null, false, null, false, false, null, null, 4084, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(FlatCashbackUpsellBottomSheetViewState flatCashbackUpsellBottomSheetViewState, FlatCashbackUpsellBottomSheetFragment flatCashbackUpsellBottomSheetFragment) {
            MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet = (MerchantRewardsOfferDetailsBottomSheet) MerchantRewardsOfferDetailsBottomSheet.INSTANCE.newInstance((Parcelable) new MerchantRewardsOfferDetailsBottomSheet.Args(flatCashbackUpsellBottomSheetViewState.getMerchantOffer(), false, 2, null));
            FragmentManager childFragmentManager = flatCashbackUpsellBottomSheetFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            merchantRewardsOfferDetailsBottomSheet.show(childFragmentManager, "MerchantRewardsOfferDetailsBottomSheetDialogFragment");
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FlatCashbackUpsellBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/bottomsheet/FlatCashbackUpsellBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/cash/flat/cashback/ui/bottomsheet/FlatCashbackUpsellBottomSheetFragment;", "Lcom/robinhood/android/rhy/contracts/FlatCashbackOnboardingContract$DialogKey;", "<init>", "()V", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<FlatCashbackUpsellBottomSheetFragment, FlatCashbackOnboardingContract.DialogKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public FlatCashbackUpsellBottomSheetFragment createDialogFragment(FlatCashbackOnboardingContract.DialogKey dialogKey) {
            return (FlatCashbackUpsellBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, dialogKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public FlatCashbackOnboardingContract.DialogKey getArgs(FlatCashbackUpsellBottomSheetFragment flatCashbackUpsellBottomSheetFragment) {
            return (FlatCashbackOnboardingContract.DialogKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, flatCashbackUpsellBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public FlatCashbackUpsellBottomSheetFragment newInstance(FlatCashbackOnboardingContract.DialogKey dialogKey) {
            return (FlatCashbackUpsellBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, dialogKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(FlatCashbackUpsellBottomSheetFragment flatCashbackUpsellBottomSheetFragment, FlatCashbackOnboardingContract.DialogKey dialogKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, flatCashbackUpsellBottomSheetFragment, dialogKey);
        }
    }

    private static final BaseFlatCashbackViewState<FlatCashbackUpsellBottomSheetViewState> ComposeContent$lambda$0(SnapshotState4<? extends BaseFlatCashbackViewState<FlatCashbackUpsellBottomSheetViewState>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
