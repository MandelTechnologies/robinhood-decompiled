package com.robinhood.android.portfolio.positionsDisplayOptions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.portfolio.contracts.PositionsDisplayOptionsKey;
import com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsBottomSheet;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: PositionsDisplayOptionsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positionsDisplayOptions/PositionsDisplayOptionsFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PositionsDisplayOptionsFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeBottomSheetDialogFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(PositionsDisplayOptionsFragment positionsDisplayOptionsFragment, int i, Composer composer, int i2) {
        positionsDisplayOptionsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: PositionsDisplayOptionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positionsDisplayOptions/PositionsDisplayOptionsFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/portfolio/positionsDisplayOptions/PositionsDisplayOptionsFragment;", "Lcom/robinhood/android/portfolio/contracts/PositionsDisplayOptionsKey;", "<init>", "()V", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<PositionsDisplayOptionsFragment, PositionsDisplayOptionsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public PositionsDisplayOptionsFragment createDialogFragment(PositionsDisplayOptionsKey positionsDisplayOptionsKey) {
            return (PositionsDisplayOptionsFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, positionsDisplayOptionsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PositionsDisplayOptionsKey getArgs(PositionsDisplayOptionsFragment positionsDisplayOptionsFragment) {
            return (PositionsDisplayOptionsKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, positionsDisplayOptionsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PositionsDisplayOptionsFragment newInstance(PositionsDisplayOptionsKey positionsDisplayOptionsKey) {
            return (PositionsDisplayOptionsFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, positionsDisplayOptionsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PositionsDisplayOptionsFragment positionsDisplayOptionsFragment, PositionsDisplayOptionsKey positionsDisplayOptionsKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, positionsDisplayOptionsFragment, positionsDisplayOptionsKey);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2075065131);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2075065131, i2, -1, "com.robinhood.android.portfolio.positionsDisplayOptions.PositionsDisplayOptionsFragment.ComposeContent (PositionsDisplayOptionsFragment.kt:16)");
            }
            PositionsDisplayOptionsKey positionsDisplayOptionsKey = (PositionsDisplayOptionsKey) INSTANCE.getArgs((Fragment) this);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(this));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new PositionsDisplayOptionsFragment2(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            PositionsDisplayOptionsBottomSheet.PositionsDisplayOptionsBottomSheetContent(positionsDisplayOptionsKey, null, null, null, (Function0) ((KFunction) objRememberedValue), composerStartRestartGroup, 0, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.positionsDisplayOptions.PositionsDisplayOptionsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PositionsDisplayOptionsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
