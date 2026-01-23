package com.robinhood.android.pathfinder.corepages.documentrequestslist;

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
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.DocumentUpload;
import com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p355ui.pathfinder.contexts.DocumentRequest;
import com.robinhood.shared.support.contracts.pathfinder.DocumentRequestListFragmentKey;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DocumentRequestsListFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0011\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0013R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDuxo;", "getDuxo", "()Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "launchActivity", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "documentRequests", "", "Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequest;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-pathfinder-core-pages_externalDebug", "state", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class DocumentRequestsListFragment extends GenericComposeFragment {
    private List<DocumentRequest> documentRequests;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, DocumentRequestsListDuxo.class);
    private final ActivityResultLauncher<Intent> launchActivity;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(DocumentRequestsListFragment documentRequestsListFragment, int i, Composer composer, int i2) {
        documentRequestsListFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public DocumentRequestsListFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListFragment$launchActivity$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getResultCode() == -1) {
                    this.this$0.getDuxo().setActiveDocumentSubmitted(this.this$0.documentRequests);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.launchActivity = activityResultLauncherRegisterForActivityResult;
        this.documentRequests = CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocumentRequestsListDuxo getDuxo() {
        return (DocumentRequestsListDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-142778292);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-142778292, i2, -1, "com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListFragment.ComposeContent (DocumentRequestsListFragment.kt:32)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            this.documentRequests = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDocumentRequests();
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1279370657, true, new C253021(snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocumentRequestsListFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: DocumentRequestsListFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListFragment$ComposeContent$1 */
    static final class C253021 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<DocumentRequestsListViewState> $state$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C253021(SnapshotState4<? extends DocumentRequestsListViewState> snapshotState4) {
            this.$state$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(1279370657, i, -1, "com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListFragment.ComposeContent.<anonymous> (DocumentRequestsListFragment.kt:37)");
            }
            DocumentRequestsListViewState documentRequestsListViewStateComposeContent$lambda$0 = DocumentRequestsListFragment.ComposeContent$lambda$0(this.$state$delegate);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(DocumentRequestsListFragment.this);
            final DocumentRequestsListFragment documentRequestsListFragment = DocumentRequestsListFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DocumentRequestsListFragment.C253021.invoke$lambda$1$lambda$0(documentRequestsListFragment, (DocumentRequest) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(DocumentRequestsListFragment.this) | composer.changed(this.$state$delegate);
            final DocumentRequestsListFragment documentRequestsListFragment2 = DocumentRequestsListFragment.this;
            final SnapshotState4<DocumentRequestsListViewState> snapshotState4 = this.$state$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DocumentRequestsListFragment.C253021.invoke$lambda$3$lambda$2(documentRequestsListFragment2, snapshotState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composer.changedInstance(DocumentRequestsListFragment.this) | composer.changed(this.$state$delegate);
            final DocumentRequestsListFragment documentRequestsListFragment3 = DocumentRequestsListFragment.this;
            final SnapshotState4<DocumentRequestsListViewState> snapshotState42 = this.$state$delegate;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DocumentRequestsListFragment.C253021.invoke$lambda$5$lambda$4(documentRequestsListFragment3, snapshotState42);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            DocumentRequestsListComposable4.DocumentRequestsListComposable(documentRequestsListViewStateComposeContent$lambda$0, function1, function0, (Function0) objRememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(DocumentRequestsListFragment documentRequestsListFragment, DocumentRequest documentRequest) {
            Intrinsics.checkNotNullParameter(documentRequest, "documentRequest");
            documentRequestsListFragment.getDuxo().updateActiveDocumentRequest(documentRequest);
            Navigator navigator = documentRequestsListFragment.getNavigator();
            Context contextRequireContext = documentRequestsListFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            documentRequestsListFragment.launchActivity.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new DocumentUpload(CollectionsKt.listOf(DocumentRequestsListFragment3.toIdentiDocumentRequest(documentRequest)), false, false, null, false, null, false, null, false, 510, null), false, false, false, null, false, true, false, false, false, null, false, 8052, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(DocumentRequestsListFragment documentRequestsListFragment, SnapshotState4 snapshotState4) {
            documentRequestsListFragment.getDuxo().m2364x84795383(DocumentRequestsListFragment.ComposeContent$lambda$0(snapshotState4).getDocumentRequests());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(DocumentRequestsListFragment documentRequestsListFragment, SnapshotState4 snapshotState4) {
            documentRequestsListFragment.getDuxo().m2364x84795383(DocumentRequestsListFragment.ComposeContent$lambda$0(snapshotState4).getDocumentRequests());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: DocumentRequestsListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListFragment;", "Lcom/robinhood/shared/support/contracts/pathfinder/DocumentRequestListFragmentKey;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<DocumentRequestsListFragment, DocumentRequestListFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(DocumentRequestListFragmentKey documentRequestListFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, documentRequestListFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DocumentRequestListFragmentKey getArgs(DocumentRequestsListFragment documentRequestsListFragment) {
            return (DocumentRequestListFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, documentRequestsListFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DocumentRequestsListFragment newInstance(DocumentRequestListFragmentKey documentRequestListFragmentKey) {
            return (DocumentRequestsListFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, documentRequestListFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DocumentRequestsListFragment documentRequestsListFragment, DocumentRequestListFragmentKey documentRequestListFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, documentRequestsListFragment, documentRequestListFragmentKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentRequestsListViewState ComposeContent$lambda$0(SnapshotState4<? extends DocumentRequestsListViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
