package com.robinhood.android.internalassettransfers.history;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.assettransfers.contracts.InternalAssetTransferHistory;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryEvent;
import com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferAssetListFragmentKey;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransferHistoryFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u000e\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0010R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012²\u0006\u0012\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDuxo;", "getDuxo", "()Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-internal-asset-transfers_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryEvent;", "viewState", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternalAssetTransferHistoryFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, InternalAssetTransferHistoryDuxo.class);
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(InternalAssetTransferHistoryFragment internalAssetTransferHistoryFragment, int i, Composer composer, int i2) {
        internalAssetTransferHistoryFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternalAssetTransferHistoryDuxo getDuxo() {
        return (InternalAssetTransferHistoryDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<InternalAssetTransferHistoryEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(480079840);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(480079840, i2, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryFragment.ComposeContent (InternalAssetTransferHistoryFragment.kt:28)");
            }
            final Event<InternalAssetTransferHistoryEvent> eventComposeContent$lambda$0 = ComposeContent$lambda$0(SnapshotStateKt.collectAsState(getDuxo().getEventFlow(), null, composerStartRestartGroup, 0, 1));
            if (eventComposeContent$lambda$0 != null && (eventComposeContent$lambda$0.getData() instanceof InternalAssetTransferHistoryEvent.NavigateToAssetList) && (eventConsumerInvoke = eventComposeContent$lambda$0.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$0, new Function1() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15425invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15425invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        InternalAssetTransferHistoryEvent.NavigateToAssetList navigateToAssetList = (InternalAssetTransferHistoryEvent.NavigateToAssetList) eventComposeContent$lambda$0.getData();
                        Navigator navigator = this.getNavigator();
                        Context contextRequireContext = this.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new InternalAssetTransferAssetListFragmentKey(navigateToAssetList.getEligibleAssets(), null, true, 2, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
                    }
                });
            }
            final SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.INTERNAL_ASSET_TRANSFER_DETAILS, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1087074443, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryFragment.ComposeContent.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1087074443, i3, -1, "com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryFragment.ComposeContent.<anonymous> (InternalAssetTransferHistoryFragment.kt:48)");
                    }
                    InternalAssetTransferHistoryViewState internalAssetTransferHistoryViewStateComposeContent$lambda$2 = InternalAssetTransferHistoryFragment.ComposeContent$lambda$2(snapshotState4CollectAsState);
                    final InternalAssetTransferHistoryFragment internalAssetTransferHistoryFragment = this;
                    InternalAssetTransferHistory5.InternalAssetTransferHistory(internalAssetTransferHistoryViewStateComposeContent$lambda$2, new InternalAssetTransferHistory4() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryFragment.ComposeContent.2.1
                        @Override // com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory4
                        public void onNavigationBackClick() {
                            internalAssetTransferHistoryFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                        }

                        @Override // com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory4
                        public void onViewAssetListButtonClick() {
                            internalAssetTransferHistoryFragment.getDuxo().showAssetList();
                        }

                        @Override // com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory4
                        public void onCancelRequestButtonClick() {
                            internalAssetTransferHistoryFragment.getDuxo().showDialog();
                        }

                        @Override // com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory4
                        public void onDialogDismiss() {
                            internalAssetTransferHistoryFragment.getDuxo().dismissDialog();
                        }

                        @Override // com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory4
                        public void onTryAgainClick() {
                            internalAssetTransferHistoryFragment.getDuxo().retry();
                        }

                        @Override // com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory4
                        public void onDialogPositiveClick() {
                            internalAssetTransferHistoryFragment.getDuxo().cancelRequest();
                        }

                        @Override // com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistory4
                        public void onContactSupportButtonClick() {
                            Navigator navigator = internalAssetTransferHistoryFragment.getNavigator();
                            ContactSupportFragmentKey.TriageFlow triageFlow = new ContactSupportFragmentKey.TriageFlow(null, "87", null, null, null, 29, null);
                            Context contextRequireContext = internalAssetTransferHistoryFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, triageFlow, false, false, false, false, null, false, null, null, 1020, null);
                        }
                    }, ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null), composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferHistoryFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InternalAssetTransferHistoryFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryFragment;", "Lcom/robinhood/android/assettransfers/contracts/InternalAssetTransferHistory;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InternalAssetTransferHistoryFragment, InternalAssetTransferHistory>, FragmentResolver<InternalAssetTransferHistory> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InternalAssetTransferHistory getArgs(InternalAssetTransferHistoryFragment internalAssetTransferHistoryFragment) {
            return (InternalAssetTransferHistory) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, internalAssetTransferHistoryFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InternalAssetTransferHistoryFragment newInstance(InternalAssetTransferHistory internalAssetTransferHistory) {
            return (InternalAssetTransferHistoryFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, internalAssetTransferHistory);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InternalAssetTransferHistoryFragment internalAssetTransferHistoryFragment, InternalAssetTransferHistory internalAssetTransferHistory) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, internalAssetTransferHistoryFragment, internalAssetTransferHistory);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(InternalAssetTransferHistory key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return InternalAssetTransferHistoryFragment.INSTANCE.newInstance((Parcelable) new InternalAssetTransferHistory(key.getAssetTransferUuid()));
        }
    }

    private static final Event<InternalAssetTransferHistoryEvent> ComposeContent$lambda$0(SnapshotState4<Event<InternalAssetTransferHistoryEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalAssetTransferHistoryViewState ComposeContent$lambda$2(SnapshotState4<? extends InternalAssetTransferHistoryViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
