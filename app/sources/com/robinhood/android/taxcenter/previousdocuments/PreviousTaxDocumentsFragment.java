package com.robinhood.android.taxcenter.previousdocuments;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.taxcenter.BaseTaxComposeFragment;
import com.robinhood.android.taxcenter.C29236R;
import com.robinhood.android.taxcenter.previousdocuments.YearSelectorBottomSheetFragment;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PreviousTaxDocumentsFragment.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsFragment;", "Lcom/robinhood/android/taxcenter/BaseTaxComposeFragment;", "Lcom/robinhood/android/taxcenter/previousdocuments/YearSelectorBottomSheetFragment$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsDuxo;", "getDuxo", "()Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "AppBarTitle", "", "(Landroidx/compose/runtime/Composer;I)V", "TaxCenterContent", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "onYearSelected", "year", "", "Companion", "feature-tax-center_externalDebug", "viewState", "Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PreviousTaxDocumentsFragment extends BaseTaxComposeFragment implements YearSelectorBottomSheetFragment.Callbacks {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, PreviousTaxDocumentsDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarTitle$lambda$0(PreviousTaxDocumentsFragment previousTaxDocumentsFragment, int i, Composer composer, int i2) {
        previousTaxDocumentsFragment.AppBarTitle(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxCenterContent$lambda$4(PreviousTaxDocumentsFragment previousTaxDocumentsFragment, PaddingValues paddingValues, LazyListState lazyListState, int i, Composer composer, int i2) {
        previousTaxDocumentsFragment.TaxCenterContent(paddingValues, lazyListState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final PreviousTaxDocumentsDuxo getDuxo() {
        return (PreviousTaxDocumentsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.taxcenter.BaseTaxComposeFragment
    public void AppBarTitle(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-932950409);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-932950409, i, -1, "com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsFragment.AppBarTitle (PreviousTaxDocumentsFragment.kt:22)");
            }
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C29236R.string.previous_documents_title, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviousTaxDocumentsFragment.AppBarTitle$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.taxcenter.BaseTaxComposeFragment
    public void TaxCenterContent(PaddingValues paddingValues, LazyListState listState, Composer composer, final int i) {
        int i2;
        final PaddingValues paddingValues2;
        final LazyListState lazyListState;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(listState, "listState");
        Composer composerStartRestartGroup = composer.startRestartGroup(302943298);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(listState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(302943298, i2, -1, "com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsFragment.TaxCenterContent (PreviousTaxDocumentsFragment.kt:27)");
            }
            PreviousTaxDocumentsViewState previousTaxDocumentsViewStateTaxCenterContent$lambda$1 = TaxCenterContent$lambda$1(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PreviousTaxDocumentsFragment.TaxCenterContent$lambda$3$lambda$2(this.f$0, (String) obj, (List) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            paddingValues2 = paddingValues;
            lazyListState = listState;
            PreviousTaxDocumentsComposable3.PreviousTaxDocumentsComposable(previousTaxDocumentsViewStateTaxCenterContent$lambda$1, paddingValues2, lazyListState, (Function2) objRememberedValue, composerStartRestartGroup, (i2 << 3) & 1008);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            paddingValues2 = paddingValues;
            lazyListState = listState;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviousTaxDocumentsFragment.TaxCenterContent$lambda$4(this.f$0, paddingValues2, lazyListState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxCenterContent$lambda$3$lambda$2(PreviousTaxDocumentsFragment previousTaxDocumentsFragment, String activeYear, List yearList) {
        Intrinsics.checkNotNullParameter(activeYear, "activeYear");
        Intrinsics.checkNotNullParameter(yearList, "yearList");
        YearSelectorBottomSheetFragment yearSelectorBottomSheetFragment = (YearSelectorBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(YearSelectorBottomSheetFragment.INSTANCE, new YearSelectorBottomSheetFragment.Args(activeYear, yearList), previousTaxDocumentsFragment, 0, 4, null);
        FragmentManager parentFragmentManager = previousTaxDocumentsFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        yearSelectorBottomSheetFragment.show(parentFragmentManager, "tax_year_selector");
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.taxcenter.previousdocuments.YearSelectorBottomSheetFragment.Callbacks
    public void onYearSelected(String year) {
        Intrinsics.checkNotNullParameter(year, "year");
        getDuxo().onYearSelected(year);
    }

    /* compiled from: PreviousTaxDocumentsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PreviousTaxDocuments;", "<init>", "()V", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PreviousTaxDocumentsFragment, LegacyFragmentKey.PreviousTaxDocuments> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.PreviousTaxDocuments previousTaxDocuments) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, previousTaxDocuments);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.PreviousTaxDocuments getArgs(PreviousTaxDocumentsFragment previousTaxDocumentsFragment) {
            return (LegacyFragmentKey.PreviousTaxDocuments) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, previousTaxDocumentsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PreviousTaxDocumentsFragment newInstance(LegacyFragmentKey.PreviousTaxDocuments previousTaxDocuments) {
            return (PreviousTaxDocumentsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, previousTaxDocuments);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PreviousTaxDocumentsFragment previousTaxDocumentsFragment, LegacyFragmentKey.PreviousTaxDocuments previousTaxDocuments) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, previousTaxDocumentsFragment, previousTaxDocuments);
        }
    }

    private static final PreviousTaxDocumentsViewState TaxCenterContent$lambda$1(SnapshotState4<? extends PreviousTaxDocumentsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
