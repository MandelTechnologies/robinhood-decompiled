package com.robinhood.android.transfers.p271ui.max.i18n.composable;

import android.content.Context;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.p271ui.p272v2.TransferSummaryState;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TransferEditScreen.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a`\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"TransferEditScreen", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/transfers/ui/max/i18n/composable/TransferEditScreenData;", "onContinueClick", "Lkotlin/Function0;", "processKeyEvent", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "Lkotlin/ParameterName;", "name", "keyEvent", "", "transferSummaryState", "Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/transfers/ui/max/i18n/composable/TransferEditScreenData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;Lcom/robinhood/android/navigation/Navigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WithdrawableDisclosureTag", "", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.composable.TransferEditScreenKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferEditScreen2 {
    public static final String WithdrawableDisclosureTag = "withdrawable_disclosure";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferEditScreen$lambda$4(TransferEditScreenData transferEditScreenData, Function0 function0, Function1 function1, TransferSummaryState transferSummaryState, Navigator navigator, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TransferEditScreen(transferEditScreenData, function0, function1, transferSummaryState, navigator, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TransferEditScreen(final TransferEditScreenData data, final Function0<Unit> onContinueClick, final Function1<? super KeyEvent, Boolean> processKeyEvent, final TransferSummaryState transferSummaryState, final Navigator navigator, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i5;
        int i6;
        Modifier modifier3;
        int i7;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Intrinsics.checkNotNullParameter(processKeyEvent, "processKeyEvent");
        Intrinsics.checkNotNullParameter(transferSummaryState, "transferSummaryState");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Composer composerStartRestartGroup = composer.startRestartGroup(525760523);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(processKeyEvent) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(transferSummaryState) : composerStartRestartGroup.changedInstance(transferSummaryState) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i3;
            if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(525760523, i4, -1, "com.robinhood.android.transfers.ui.max.i18n.composable.TransferEditScreen (TransferEditScreen.kt:44)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (!(transferSummaryState instanceof TransferSummaryState.Success)) {
                    composerStartRestartGroup.startReplaceGroup(-1189495897);
                    GenericActionHandlerKt.GenericActionHandler(null, false, null, navigator, ComposableLambda3.rememberComposableLambda(36418287, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.TransferEditScreenKt$TransferEditScreen$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i9) {
                            if ((i9 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(36418287, i9, -1, "com.robinhood.android.transfers.ui.max.i18n.composable.TransferEditScreen.<anonymous>.<anonymous> (TransferEditScreen.kt:53)");
                            }
                            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, TransferEditScreen2.WithdrawableDisclosureTag);
                            ImmutableList3 persistentList = extensions2.toPersistentList(((TransferSummaryState.Success) transferSummaryState).getEditStateDisclosure());
                            composer2.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierTestTag, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 384, 0);
                            composer2.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 7168) | 24576, 7);
                    composerStartRestartGroup.endReplaceGroup();
                    i5 = i4;
                    modifier3 = modifier5;
                    i6 = 1;
                    i7 = 0;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1780749902);
                    i5 = i4;
                    i6 = 1;
                    modifier3 = modifier5;
                    i7 = 0;
                    BentoText2.m20747BentoText38GnDrw("", ModifiersKt.isInvisible(Modifier.INSTANCE, true), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), composerStartRestartGroup, 6, 0, 8188);
                    composerStartRestartGroup.endReplaceGroup();
                }
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, i7);
                boolean reviewEnabled = data.getReviewEnabled();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                int i9 = i6;
                BentoButtonKt.m20586BentoButtonEikTQX8(onContinueClick, strStringResource, PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), null, null, reviewEnabled, false, null, null, null, null, false, null, composerStartRestartGroup, (i5 >> 3) & 14, 0, 8152);
                composerStartRestartGroup = composerStartRestartGroup;
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                composerStartRestartGroup.startReplaceGroup(-1189450387);
                if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    AndroidView_androidKt.AndroidView(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.TransferEditScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TransferEditScreen2.TransferEditScreen$lambda$3$lambda$1(objectRef, processKeyEvent, (Context) obj);
                        }
                    }, SizeKt.fillMaxWidth$default(companion2, 0.0f, i9, null), null, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.TransferEditScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TransferEditScreen2.TransferEditScreen$lambda$3$lambda$2(objectRef, (RdsNumpadView) obj);
                        }
                    }, null, composerStartRestartGroup, 48, 20);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.TransferEditScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TransferEditScreen2.TransferEditScreen$lambda$4(data, onContinueClick, processKeyEvent, transferSummaryState, navigator, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        i4 = i3;
        if ((74899 & i4) == 74898) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (!(transferSummaryState instanceof TransferSummaryState.Success)) {
                }
                String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, i7);
                boolean reviewEnabled2 = data.getReviewEnabled();
                Modifier.Companion companion22 = Modifier.INSTANCE;
                int i92 = i6;
                BentoButtonKt.m20586BentoButtonEikTQX8(onContinueClick, strStringResource2, PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(companion22, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), null, null, reviewEnabled2, false, null, null, null, null, false, null, composerStartRestartGroup, (i5 >> 3) & 14, 0, 8152);
                composerStartRestartGroup = composerStartRestartGroup;
                final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                composerStartRestartGroup.startReplaceGroup(-1189450387);
                if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, io.reactivex.disposables.Disposable] */
    public static final RdsNumpadView TransferEditScreen$lambda$3$lambda$1(Ref.ObjectRef objectRef, final Function1 function1, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        RdsNumpadView rdsNumpadView = new RdsNumpadView(scarletContextWrapper, null);
        objectRef.element = rdsNumpadView.getKeyEvents().subscribe(new Consumer() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.TransferEditScreenKt$TransferEditScreen$1$2$1
            @Override // io.reactivex.functions.Consumer
            public final void accept(KeyEvent keyEvent) {
                Function1<KeyEvent, Boolean> function12 = function1;
                Intrinsics.checkNotNull(keyEvent);
                function12.invoke(keyEvent);
            }
        });
        return rdsNumpadView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferEditScreen$lambda$3$lambda$2(Ref.ObjectRef objectRef, RdsNumpadView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Disposable disposable = (Disposable) objectRef.element;
        if (disposable != null) {
            disposable.dispose();
        }
        return Unit.INSTANCE;
    }
}
