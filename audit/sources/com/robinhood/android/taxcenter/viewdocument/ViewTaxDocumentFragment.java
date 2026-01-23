package com.robinhood.android.taxcenter.viewdocument;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.taxcenter.BaseTaxComposeFragment;
import com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentFragment;
import com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentViewState;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.documents.contracts.DocumentDownloadKey;
import com.robinhood.shared.documents.contracts.DocumentDownloadLaunchMode;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ViewTaxDocumentFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentFragment;", "Lcom/robinhood/android/taxcenter/BaseTaxComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentDuxo;", "getDuxo", "()Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "TaxCenterContent", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-tax-center_externalDebug", "viewState", "Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ViewTaxDocumentFragment extends BaseTaxComposeFragment implements AutoLoggableFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, ViewTaxDocumentDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxCenterContent$lambda$1(ViewTaxDocumentFragment viewTaxDocumentFragment, PaddingValues paddingValues, LazyListState lazyListState, int i, Composer composer, int i2) {
        viewTaxDocumentFragment.TaxCenterContent(paddingValues, lazyListState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(null, null, "TaxDocumentPresenter", null, 11, null);
    }

    private final ViewTaxDocumentDuxo getDuxo() {
        return (ViewTaxDocumentDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.taxcenter.BaseTaxComposeFragment
    public void TaxCenterContent(final PaddingValues paddingValues, final LazyListState listState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(listState, "listState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1408748933);
        if ((i & 384) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1408748933, i2, -1, "com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentFragment.TaxCenterContent (ViewTaxDocumentFragment.kt:32)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-15675910, true, new C292771(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ViewTaxDocumentFragment.TaxCenterContent$lambda$1(this.f$0, paddingValues, listState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ViewTaxDocumentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentFragment$TaxCenterContent$1 */
    static final class C292771 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<ViewTaxDocumentViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C292771(SnapshotState4<? extends ViewTaxDocumentViewState> snapshotState4) {
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
                ComposerKt.traceEventStart(-15675910, i, -1, "com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentFragment.TaxCenterContent.<anonymous> (ViewTaxDocumentFragment.kt:40)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            final ViewTaxDocumentViewState viewTaxDocumentViewStateTaxCenterContent$lambda$0 = ViewTaxDocumentFragment.TaxCenterContent$lambda$0(this.$viewState$delegate);
            if (Intrinsics.areEqual(viewTaxDocumentViewStateTaxCenterContent$lambda$0, ViewTaxDocumentViewState.Loading.INSTANCE)) {
                composer.startReplaceGroup(2115328009);
                LocalShowPlaceholder.Loadable(true, null, null, ViewTaxDocumentFragment2.INSTANCE.getLambda$804838658$feature_tax_center_externalDebug(), composer, 3078, 6);
                composer.endReplaceGroup();
            } else {
                if (!(viewTaxDocumentViewStateTaxCenterContent$lambda$0 instanceof ViewTaxDocumentViewState.Ready)) {
                    composer.startReplaceGroup(2115326942);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(2115344846);
                String filename = ((ViewTaxDocumentViewState.Ready) viewTaxDocumentViewStateTaxCenterContent$lambda$0).getFilename();
                composer.startReplaceGroup(-1224400529);
                boolean zChanged = composer.changed(viewTaxDocumentViewStateTaxCenterContent$lambda$0) | composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(current) | composer.changedInstance(ViewTaxDocumentFragment.this);
                final ViewTaxDocumentFragment viewTaxDocumentFragment = ViewTaxDocumentFragment.this;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentFragment$TaxCenterContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ViewTaxDocumentFragment.C292771.invoke$lambda$1$lambda$0(viewTaxDocumentViewStateTaxCenterContent$lambda$0, userInteractionEventDescriptor, current, viewTaxDocumentFragment);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1224400529);
                boolean zChanged2 = composer.changed(viewTaxDocumentViewStateTaxCenterContent$lambda$0) | composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(current) | composer.changedInstance(ViewTaxDocumentFragment.this);
                final ViewTaxDocumentFragment viewTaxDocumentFragment2 = ViewTaxDocumentFragment.this;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentFragment$TaxCenterContent$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ViewTaxDocumentFragment.C292771.invoke$lambda$3$lambda$2(viewTaxDocumentViewStateTaxCenterContent$lambda$0, userInteractionEventDescriptor, current, viewTaxDocumentFragment2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                DocumentDownloadComposable4.DocumentDownloadComposable(filename, function0, (Function0) objRememberedValue2, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(ViewTaxDocumentViewState viewTaxDocumentViewState, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, ViewTaxDocumentFragment viewTaxDocumentFragment) {
            ViewTaxDocumentViewState.Ready ready = (ViewTaxDocumentViewState.Ready) viewTaxDocumentViewState;
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, "open-tax-document-" + ready.getFiletype(), null, 4, null), null, null, false, 57, null);
            Navigator.DefaultImpls.startActivity$default(viewTaxDocumentFragment.getNavigator(), viewTaxDocumentFragment.requireBaseActivity(), new DocumentDownloadKey(ready.getDocument(), DocumentDownloadLaunchMode.OPEN, ready.getFilename(), false, 8, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(ViewTaxDocumentViewState viewTaxDocumentViewState, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, ViewTaxDocumentFragment viewTaxDocumentFragment) {
            ViewTaxDocumentViewState.Ready ready = (ViewTaxDocumentViewState.Ready) viewTaxDocumentViewState;
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, "export-tax-document-" + ready.getFiletype(), null, 4, null), null, null, false, 57, null);
            Navigator.DefaultImpls.startActivity$default(viewTaxDocumentFragment.getNavigator(), viewTaxDocumentFragment.requireBaseActivity(), new DocumentDownloadKey(ready.getDocument(), DocumentDownloadLaunchMode.SHARE, ready.getFilename(), false, 8, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewTaxDocumentViewState TaxCenterContent$lambda$0(SnapshotState4<? extends ViewTaxDocumentViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: ViewTaxDocumentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ViewTaxDocument;", "<init>", "()V", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ViewTaxDocumentFragment, LegacyFragmentKey.ViewTaxDocument> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.ViewTaxDocument viewTaxDocument) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, viewTaxDocument);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.ViewTaxDocument getArgs(ViewTaxDocumentFragment viewTaxDocumentFragment) {
            return (LegacyFragmentKey.ViewTaxDocument) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, viewTaxDocumentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ViewTaxDocumentFragment newInstance(LegacyFragmentKey.ViewTaxDocument viewTaxDocument) {
            return (ViewTaxDocumentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, viewTaxDocument);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ViewTaxDocumentFragment viewTaxDocumentFragment, LegacyFragmentKey.ViewTaxDocument viewTaxDocument) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, viewTaxDocumentFragment, viewTaxDocument);
        }
    }
}
