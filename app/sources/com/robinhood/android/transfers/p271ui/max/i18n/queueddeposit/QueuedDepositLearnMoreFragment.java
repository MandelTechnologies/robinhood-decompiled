package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.FragmentResolverCompanion;
import com.robinhood.android.transfers.contracts.QueuedDepositLearnMore;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.QueuedDepositLearnMoreDuxo2;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: QueuedDepositLearnMoreFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\r\u0010\u0014\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0015R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/QueuedDepositLearnMoreFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/QueuedDepositLearnMoreDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/QueuedDepositLearnMoreDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "onAttach", "", "context", "Landroid/content/Context;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-transfers_externalRelease", "viewState", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/QueuedDepositLearnMoreState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class QueuedDepositLearnMoreFragment extends GenericComposeFragment implements AutoLoggableFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, QueuedDepositLearnMoreDuxo.class);

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.QueuedDepositLearnMoreFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return QueuedDepositLearnMoreFragment.eventScreen_delegate$lambda$0();
        }
    });

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(QueuedDepositLearnMoreFragment queuedDepositLearnMoreFragment, int i, Composer composer, int i2) {
        queuedDepositLearnMoreFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final QueuedDepositLearnMoreDuxo getDuxo() {
        return (QueuedDepositLearnMoreDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0() {
        return new Screen(Screen.Name.QUEUED_DEPOSIT_LEARN_MORE, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1310574694);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1310574694, i2, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.QueuedDepositLearnMoreFragment.ComposeContent (QueuedDepositLearnMoreFragment.kt:53)");
            }
            final QueuedDepositLearnMoreDuxo2 queuedDepositLearnMoreDuxo2ComposeContent$lambda$1 = ComposeContent$lambda$1(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (queuedDepositLearnMoreDuxo2ComposeContent$lambda$1 instanceof QueuedDepositLearnMoreDuxo2.Loading) {
                composerStartRestartGroup.startReplaceGroup(-2077772614);
                LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 3, composerStartRestartGroup, 3504, 1);
                composerStartRestartGroup.endReplaceGroup();
            } else if (queuedDepositLearnMoreDuxo2ComposeContent$lambda$1 instanceof QueuedDepositLearnMoreDuxo2.Loaded) {
                composerStartRestartGroup.startReplaceGroup(-2077463606);
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-393795634, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.QueuedDepositLearnMoreFragment.ComposeContent.1
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
                            ComposerKt.traceEventStart(-393795634, i3, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.QueuedDepositLearnMoreFragment.ComposeContent.<anonymous> (QueuedDepositLearnMoreFragment.kt:70)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.autoLogEvents$default(companion, (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), 0.0f, 1, null);
                        QueuedDepositLearnMoreDuxo2 queuedDepositLearnMoreDuxo2 = queuedDepositLearnMoreDuxo2ComposeContent$lambda$1;
                        QueuedDepositLearnMoreFragment queuedDepositLearnMoreFragment = this;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        ImmutableList<UIComponent<GenericAction>> content = ((QueuedDepositLearnMoreDuxo2.Loaded) queuedDepositLearnMoreDuxo2).getContent();
                        composer2.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(content, GenericAction.class, companion, null, null, HorizontalPadding.Default, arrangement.getTop(), companion2.getStart(), false, composer2, 0, 0);
                        composer2.endReplaceGroup();
                        Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer2, 0);
                        FragmentActivity fragmentActivityRequireActivity = queuedDepositLearnMoreFragment.requireActivity();
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(fragmentActivityRequireActivity);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new QueuedDepositLearnMoreFragment2(fragmentActivityRequireActivity);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue), StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer2, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.DISMISS, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null), 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer2, 0, 0), null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(queuedDepositLearnMoreDuxo2ComposeContent$lambda$1 instanceof QueuedDepositLearnMoreDuxo2.Error)) {
                    composerStartRestartGroup.startReplaceGroup(-1036856869);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-2075656833);
                ErrorScreenComposable.ErrorScreenComposable(null, null, 0, null, null, null, null, false, composerStartRestartGroup, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.QueuedDepositLearnMoreFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QueuedDepositLearnMoreFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final QueuedDepositLearnMoreDuxo2 ComposeContent$lambda$1(SnapshotState4<? extends QueuedDepositLearnMoreDuxo2> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: QueuedDepositLearnMoreFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/QueuedDepositLearnMoreFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverCompanion;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/QueuedDepositLearnMoreFragment;", "Lcom/robinhood/android/transfers/contracts/QueuedDepositLearnMore;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverCompanion<QueuedDepositLearnMoreFragment, QueuedDepositLearnMore> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(QueuedDepositLearnMore queuedDepositLearnMore) {
            return FragmentResolverCompanion.DefaultImpls.createFragment(this, queuedDepositLearnMore);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((QueuedDepositLearnMoreFragment) fragment);
        }

        public Void getArgs(QueuedDepositLearnMoreFragment queuedDepositLearnMoreFragment) {
            return FragmentResolverCompanion.DefaultImpls.getArgs(this, queuedDepositLearnMoreFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public QueuedDepositLearnMoreFragment newInstance() {
            return (QueuedDepositLearnMoreFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public QueuedDepositLearnMoreFragment newInstance(Void r1) {
            return (QueuedDepositLearnMoreFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
