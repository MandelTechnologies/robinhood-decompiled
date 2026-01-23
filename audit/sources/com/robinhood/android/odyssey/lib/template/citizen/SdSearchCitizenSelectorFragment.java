package com.robinhood.android.odyssey.lib.template.citizen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.fragment.app.Fragment2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.odyssey.lib.template.SdSearchInputNewFragment;
import com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorFragment;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: SdSearchCitizenSelectorFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\r\u0010\u0012\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorDuxo;", "getDuxo", "()Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-lib-odyssey_externalDebug", "viewState", "Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdSearchCitizenSelectorFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, SdSearchCitizenSelectorDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(SdSearchCitizenSelectorFragment sdSearchCitizenSelectorFragment, int i, Composer composer, int i2) {
        sdSearchCitizenSelectorFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SdSearchCitizenSelectorDuxo getDuxo() {
        return (SdSearchCitizenSelectorDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        setDraggable(false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1529611006);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1529611006, i2, -1, "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorFragment.ComposeContent (SdSearchCitizenSelectorFragment.kt:31)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-725359799, true, new C227101(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SdSearchCitizenSelectorFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SdSearchCitizenSelectorFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorFragment$ComposeContent$1 */
    static final class C227101 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<SdSearchCitizenSelectorViewState> $viewState$delegate;

        C227101(SnapshotState4<SdSearchCitizenSelectorViewState> snapshotState4) {
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
                ComposerKt.traceEventStart(-725359799, i, -1, "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorFragment.ComposeContent.<anonymous> (SdSearchCitizenSelectorFragment.kt:35)");
            }
            String title = SdSearchCitizenSelectorFragment.ComposeContent$lambda$0(this.$viewState$delegate).getTitle();
            String placeholder = SdSearchCitizenSelectorFragment.ComposeContent$lambda$0(this.$viewState$delegate).getPlaceholder();
            ApiSdOption selectedOption = SdSearchCitizenSelectorFragment.ComposeContent$lambda$0(this.$viewState$delegate).getSelectedOption();
            ImmutableList3<ApiSdOption> selectableOptions = SdSearchCitizenSelectorFragment.ComposeContent$lambda$0(this.$viewState$delegate).getSelectableOptions();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(SdSearchCitizenSelectorFragment.this);
            final SdSearchCitizenSelectorFragment sdSearchCitizenSelectorFragment = SdSearchCitizenSelectorFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SdSearchCitizenSelectorFragment.C227101.invoke$lambda$1$lambda$0(sdSearchCitizenSelectorFragment, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(SdSearchCitizenSelectorFragment.this);
            final SdSearchCitizenSelectorFragment sdSearchCitizenSelectorFragment2 = SdSearchCitizenSelectorFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SdSearchCitizenSelectorFragment.C227101.invoke$lambda$3$lambda$2(sdSearchCitizenSelectorFragment2, (ApiSdOption) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(SdSearchCitizenSelectorFragment.this);
            final SdSearchCitizenSelectorFragment sdSearchCitizenSelectorFragment3 = SdSearchCitizenSelectorFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SdSearchCitizenSelectorFragment.C227101.invoke$lambda$5$lambda$4(sdSearchCitizenSelectorFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance4 = composer.changedInstance(SdSearchCitizenSelectorFragment.this) | composer.changed(this.$viewState$delegate);
            final SdSearchCitizenSelectorFragment sdSearchCitizenSelectorFragment4 = SdSearchCitizenSelectorFragment.this;
            final SnapshotState4<SdSearchCitizenSelectorViewState> snapshotState4 = this.$viewState$delegate;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorFragment$ComposeContent$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SdSearchCitizenSelectorFragment.C227101.invoke$lambda$7$lambda$6(sdSearchCitizenSelectorFragment4, snapshotState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            SdSearchCitizenSelectorComposable.SdSearchCitizenSelectorComposable(title, placeholder, selectedOption, selectableOptions, function1, function12, function0, (Function0) objRememberedValue4, null, composer, 0, 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SdSearchCitizenSelectorFragment sdSearchCitizenSelectorFragment, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            sdSearchCitizenSelectorFragment.getDuxo().onSearch(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(SdSearchCitizenSelectorFragment sdSearchCitizenSelectorFragment, ApiSdOption it) {
            Intrinsics.checkNotNullParameter(it, "it");
            sdSearchCitizenSelectorFragment.getDuxo().onSelectChange(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(SdSearchCitizenSelectorFragment sdSearchCitizenSelectorFragment) {
            sdSearchCitizenSelectorFragment.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(SdSearchCitizenSelectorFragment sdSearchCitizenSelectorFragment, SnapshotState4 snapshotState4) {
            ApiSdOption selectedOption = SdSearchCitizenSelectorFragment.ComposeContent$lambda$0(snapshotState4).getSelectedOption();
            Fragment2.setFragmentResult(sdSearchCitizenSelectorFragment, SdSearchInputNewFragment.SD_SEARCH_CITIZEN_REQUEST_KEY, Bundle2.bundleOf(Tuples4.m3642to(SdSearchInputNewFragment.SD_SEARCH_CITIZEN_BUNDLE_KEY, selectedOption != null ? selectedOption.getDisplay_label() : null)));
            sdSearchCitizenSelectorFragment.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: SdSearchCitizenSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorFragment;", "Lcom/robinhood/android/odyssey/lib/template/citizen/SdSearchCitizenSelectorFragmentKey;", "<init>", "()V", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<SdSearchCitizenSelectorFragment, SdSearchCitizenSelectorFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public SdSearchCitizenSelectorFragment createDialogFragment(SdSearchCitizenSelectorFragmentKey sdSearchCitizenSelectorFragmentKey) {
            return (SdSearchCitizenSelectorFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, sdSearchCitizenSelectorFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SdSearchCitizenSelectorFragmentKey getArgs(SdSearchCitizenSelectorFragment sdSearchCitizenSelectorFragment) {
            return (SdSearchCitizenSelectorFragmentKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, sdSearchCitizenSelectorFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SdSearchCitizenSelectorFragment newInstance(SdSearchCitizenSelectorFragmentKey sdSearchCitizenSelectorFragmentKey) {
            return (SdSearchCitizenSelectorFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, sdSearchCitizenSelectorFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SdSearchCitizenSelectorFragment sdSearchCitizenSelectorFragment, SdSearchCitizenSelectorFragmentKey sdSearchCitizenSelectorFragmentKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, sdSearchCitizenSelectorFragment, sdSearchCitizenSelectorFragmentKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdSearchCitizenSelectorViewState ComposeContent$lambda$0(SnapshotState4<SdSearchCitizenSelectorViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
