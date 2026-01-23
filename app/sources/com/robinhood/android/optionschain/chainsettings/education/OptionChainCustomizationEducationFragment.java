package com.robinhood.android.optionschain.chainsettings.education;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.options.contracts.OptionChainCustomizationEducationLaunchMode;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.p320db.EducationItem;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionChainCustomizationEducationFragment.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationDuxo;", "getDuxo", "()Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-options-chain_externalDebug", "viewState", "Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainCustomizationEducationFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, OptionChainCustomizationEducationDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(OptionChainCustomizationEducationFragment optionChainCustomizationEducationFragment, int i, Composer composer, int i2) {
        optionChainCustomizationEducationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final OptionChainCustomizationEducationDuxo getDuxo() {
        return (OptionChainCustomizationEducationDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(488789592);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(488789592, i2, -1, "com.robinhood.android.optionschain.chainsettings.education.OptionChainCustomizationEducationFragment.ComposeContent (OptionChainCustomizationEducationFragment.kt:19)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Integer selectedCategoryIndex = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSelectedCategoryIndex();
            ImmutableList<String> educationCategories = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEducationCategories();
            ImmutableList<EducationItem> educationItems = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEducationItems();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.education.OptionChainCustomizationEducationFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainCustomizationEducationFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.education.OptionChainCustomizationEducationFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainCustomizationEducationFragment.ComposeContent$lambda$4$lambda$3(this.f$0, ((Integer) obj).intValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            OptionChainCustomizationEducationComposable.OptionChainCustomizationEducation(selectedCategoryIndex, educationCategories, educationItems, function0, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.education.OptionChainCustomizationEducationFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainCustomizationEducationFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(OptionChainCustomizationEducationFragment optionChainCustomizationEducationFragment) {
        Navigator navigator = optionChainCustomizationEducationFragment.getNavigator();
        Context contextRequireContext = optionChainCustomizationEducationFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String string2 = optionChainCustomizationEducationFragment.getString(C24135R.string.option_chain_customization_education_help_center_url);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(OptionChainCustomizationEducationFragment optionChainCustomizationEducationFragment, int i) {
        optionChainCustomizationEducationFragment.getDuxo().updateSelectedCategoryIndex(i);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionChainCustomizationEducationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationFragment;", "Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode;", "<init>", "()V", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OptionChainCustomizationEducationFragment, OptionChainCustomizationEducationLaunchMode> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(OptionChainCustomizationEducationLaunchMode optionChainCustomizationEducationLaunchMode) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, optionChainCustomizationEducationLaunchMode);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OptionChainCustomizationEducationLaunchMode getArgs(OptionChainCustomizationEducationFragment optionChainCustomizationEducationFragment) {
            return (OptionChainCustomizationEducationLaunchMode) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionChainCustomizationEducationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionChainCustomizationEducationFragment newInstance(OptionChainCustomizationEducationLaunchMode optionChainCustomizationEducationLaunchMode) {
            return (OptionChainCustomizationEducationFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, optionChainCustomizationEducationLaunchMode);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionChainCustomizationEducationFragment optionChainCustomizationEducationFragment, OptionChainCustomizationEducationLaunchMode optionChainCustomizationEducationLaunchMode) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionChainCustomizationEducationFragment, optionChainCustomizationEducationLaunchMode);
        }
    }

    private static final OptionChainCustomizationEducationViewState ComposeContent$lambda$0(SnapshotState4<OptionChainCustomizationEducationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
