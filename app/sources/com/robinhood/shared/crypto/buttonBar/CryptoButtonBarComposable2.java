package com.robinhood.shared.crypto.buttonBar;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.crypto.buttonBar.CryptoButtonBarViewState;
import com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposable;
import com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.DeepLinkAction;

/* compiled from: CryptoButtonBarComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarComposableKt$CryptoButtonBarComposable$1$3, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoButtonBarComposable2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ CryptoButtonBarArgs $args;
    final /* synthetic */ Context $context;
    final /* synthetic */ CryptoButtonBarDuxo $duxo;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ boolean $isExpanded;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ Function0<Unit> $onCollapse;
    final /* synthetic */ Function0<Unit> $onExpand;
    final /* synthetic */ Resources $resources;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ SnapshotState<Boolean> $showAccountSwitcherBottomSheet$delegate;
    final /* synthetic */ SnapshotState4<CryptoButtonBarViewState> $viewState$delegate;

    CryptoButtonBarComposable2(Resources resources, CoroutineScope coroutineScope, CryptoButtonBarArgs cryptoButtonBarArgs, EventLogger eventLogger, CryptoButtonBarDuxo cryptoButtonBarDuxo, Navigator navigator, Context context, Function0<Unit> function0, SnapshotState4<CryptoButtonBarViewState> snapshotState4, boolean z, Function0<Unit> function02, SnapshotState<Boolean> snapshotState) {
        this.$resources = resources;
        this.$scope = coroutineScope;
        this.$args = cryptoButtonBarArgs;
        this.$eventLogger = eventLogger;
        this.$duxo = cryptoButtonBarDuxo;
        this.$navigator = navigator;
        this.$context = context;
        this.$onCollapse = function0;
        this.$viewState$delegate = snapshotState4;
        this.$isExpanded = z;
        this.$onExpand = function02;
        this.$showAccountSwitcherBottomSheet$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2111707416, i, -1, "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarComposable.<anonymous>.<anonymous> (CryptoButtonBarComposable.kt:67)");
        }
        CryptoButtonBarViewState.ButtonBarType buttonBarType = CryptoButtonBarComposable.CryptoButtonBarComposable$lambda$0(this.$viewState$delegate).getButtonBarType();
        if (buttonBarType == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$resources) | composer.changedInstance(this.$scope) | composer.changed(this.$args) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$duxo) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(this.$onCollapse);
        final Resources resources = this.$resources;
        final CoroutineScope coroutineScope = this.$scope;
        final CryptoButtonBarArgs cryptoButtonBarArgs = this.$args;
        final EventLogger eventLogger = this.$eventLogger;
        final CryptoButtonBarDuxo cryptoButtonBarDuxo = this.$duxo;
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        final Function0<Unit> function0 = this.$onCollapse;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Function2 function2 = new Function2() { // from class: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarComposableKt$CryptoButtonBarComposable$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoButtonBarComposable2.invoke$lambda$1$lambda$0(resources, coroutineScope, cryptoButtonBarArgs, eventLogger, cryptoButtonBarDuxo, navigator, context, function0, (ExpandableButtonTrayState.ActionButton) obj, (GenericAction) obj2);
                }
            };
            composer.updateRememberedValue(function2);
            objRememberedValue = function2;
        }
        Function2 function22 = (Function2) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance2 = composer.changedInstance(this.$resources) | composer.changedInstance(this.$duxo) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(this.$onCollapse);
        final Resources resources2 = this.$resources;
        final CryptoButtonBarDuxo cryptoButtonBarDuxo2 = this.$duxo;
        final Navigator navigator2 = this.$navigator;
        final Context context2 = this.$context;
        final Function0<Unit> function02 = this.$onCollapse;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function2() { // from class: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarComposableKt$CryptoButtonBarComposable$1$3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(CryptoButtonBarComposable2.invoke$lambda$5$lambda$4(resources2, cryptoButtonBarDuxo2, navigator2, context2, function02, (ExpandableButtonTrayState.ActionButton) obj, (rh_server_driven_ui.p531v1.GenericAction) obj2));
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function2 function23 = (Function2) objRememberedValue2;
        composer.endReplaceGroup();
        boolean z = this.$isExpanded;
        Function0<Unit> function03 = this.$onExpand;
        Function0<Unit> function04 = this.$onCollapse;
        final SnapshotState<Boolean> snapshotState = this.$showAccountSwitcherBottomSheet$delegate;
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
        if (buttonBarType instanceof CryptoButtonBarViewState.ButtonBarType.Horizontal) {
            composer.startReplaceGroup(306291035);
            HorizontalButtonBar.HorizontalButtonBar((CryptoButtonBarViewState.ButtonBarType.Horizontal) buttonBarType, function23, function22, composer, 0);
            composer.endReplaceGroup();
            composer2 = composer;
        } else {
            if (!(buttonBarType instanceof CryptoButtonBarViewState.ButtonBarType.Vertical)) {
                composer.startReplaceGroup(-959952629);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(306629183);
            ExpandableButtonTrayState<GenericAction> state = ((CryptoButtonBarViewState.ButtonBarType.Vertical) buttonBarType).getState();
            composer.startReplaceGroup(5004770);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarComposableKt$CryptoButtonBarComposable$1$3$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoButtonBarComposable2.invoke$lambda$8$lambda$7$lambda$6(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            composer2 = composer;
            CryptoExpandableButtonTrayComposable.CryptoExpandableButtonTrayComposable(state, z, function23, function22, function03, function04, null, null, false, false, (Function0) objRememberedValue3, composer2, ExpandableButtonTrayState.$stable, 6, 960);
            composer2.endReplaceGroup();
        }
        composer2.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Resources resources, CoroutineScope coroutineScope, CryptoButtonBarArgs cryptoButtonBarArgs, EventLogger eventLogger, CryptoButtonBarDuxo cryptoButtonBarDuxo, Navigator navigator, Context context, Function0 function0, ExpandableButtonTrayState.ActionButton button, GenericAction action) {
        String label;
        String logging_identifier;
        Component component;
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z = button instanceof ExpandableButtonTrayState.ActionButton.CustomButton;
        if (z) {
            StringResource label2 = ((ExpandableButtonTrayState.ActionButton.CustomButton) button).getLabel();
            Intrinsics.checkNotNull(resources);
            label = label2.getText(resources).toString();
        } else if (button instanceof ExpandableButtonTrayState.ActionButton.IdlButton) {
            label = ((ExpandableButtonTrayState.ActionButton.IdlButton) button).getButton().getLabel();
        } else {
            if (!(button instanceof ExpandableButtonTrayState.ActionButton.SduiButton)) {
                throw new NoWhenBranchMatchedException();
            }
            label = ((ExpandableButtonTrayState.ActionButton.SduiButton) button).getButton().getLabel();
        }
        String str = label;
        if (z) {
            UserInteractionEventDescriptor eventDescriptor = ((ExpandableButtonTrayState.ActionButton.CustomButton) button).getEventDescriptor();
            logging_identifier = (eventDescriptor == null || (component = eventDescriptor.getComponent()) == null) ? null : component.getIdentifier();
        } else if (button instanceof ExpandableButtonTrayState.ActionButton.IdlButton) {
            logging_identifier = ((ExpandableButtonTrayState.ActionButton.IdlButton) button).getButton().getLogging_identifier();
        } else {
            if (!(button instanceof ExpandableButtonTrayState.ActionButton.SduiButton)) {
                throw new NoWhenBranchMatchedException();
            }
            logging_identifier = ((ExpandableButtonTrayState.ActionButton.SduiButton) button).getButton().getLogging_identifier();
        }
        String str2 = logging_identifier;
        if (action instanceof GenericAction.DeeplinkAction) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CryptoButtonBarComposable3(str2, cryptoButtonBarArgs, eventLogger, cryptoButtonBarDuxo, str, navigator, context, action, function0, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$5$lambda$4(Resources resources, CryptoButtonBarDuxo cryptoButtonBarDuxo, Navigator navigator, Context context, Function0 function0, ExpandableButtonTrayState.ActionButton button, rh_server_driven_ui.p531v1.GenericAction action) {
        String label;
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(action, "action");
        if (button instanceof ExpandableButtonTrayState.ActionButton.CustomButton) {
            StringResource label2 = ((ExpandableButtonTrayState.ActionButton.CustomButton) button).getLabel();
            Intrinsics.checkNotNull(resources);
            label = label2.getText(resources).toString();
        } else if (button instanceof ExpandableButtonTrayState.ActionButton.IdlButton) {
            label = ((ExpandableButtonTrayState.ActionButton.IdlButton) button).getButton().getLabel();
        } else {
            if (!(button instanceof ExpandableButtonTrayState.ActionButton.SduiButton)) {
                throw new NoWhenBranchMatchedException();
            }
            label = ((ExpandableButtonTrayState.ActionButton.SduiButton) button).getButton().getLabel();
        }
        DeepLinkAction deeplink = action.getDeeplink();
        if (deeplink == null) {
            return false;
        }
        cryptoButtonBarDuxo.updateLoading$lib_crypto_button_bar_externalDebug(label, true);
        boolean zHandleDeepLink$default = Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(deeplink.getUrl()), null, null, false, NavigationType.PRESENT, 28, null);
        cryptoButtonBarDuxo.updateLoading$lib_crypto_button_bar_externalDebug(label, false);
        function0.invoke();
        return zHandleDeepLink$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7$lambda$6(SnapshotState snapshotState) {
        CryptoButtonBarComposable.CryptoButtonBarComposable$lambda$3(snapshotState, true);
        return Unit.INSTANCE;
    }
}
