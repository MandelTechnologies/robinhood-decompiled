package com.robinhood.android.chart.equityadvancedchart.popups;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.p011ui.window.AndroidPopup_androidKt;
import androidx.compose.p011ui.window.PopupProperties;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.chart.equityadvancedchart.EquityOrderCheckAlert;
import com.robinhood.android.chart.equityadvancedchart.popups.EquityOrderCheckPopup;
import com.robinhood.android.equity.ordercheck.p122ui.EquityOrderChecksAlertView;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityOrderCheckPopup.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"EquityOrderCheckPopup", "", "orderChecksAlert", "Lcom/robinhood/android/chart/equityadvancedchart/EquityOrderCheckAlert;", "onDismissRequest", "Lkotlin/Function0;", "handleEquityOrderCheckAction", "Lkotlin/Function2;", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/chart/equityadvancedchart/EquityOrderCheckAlert;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-equity-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.equityadvancedchart.popups.EquityOrderCheckPopupKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class EquityOrderCheckPopup {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityOrderCheckPopup$lambda$2(EquityOrderCheckAlert equityOrderCheckAlert, Function0 function0, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityOrderCheckPopup(equityOrderCheckAlert, function0, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityOrderCheckPopup(final EquityOrderCheckAlert orderChecksAlert, final Function0<Unit> onDismissRequest, final Function2<? super EquityOrderCheckAlert, ? super ServerDrivenButton, Unit> handleEquityOrderCheckAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(orderChecksAlert, "orderChecksAlert");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(handleEquityOrderCheckAction, "handleEquityOrderCheckAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1998617338);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(orderChecksAlert) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(handleEquityOrderCheckAction) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1998617338, i3, -1, "com.robinhood.android.chart.equityadvancedchart.popups.EquityOrderCheckPopup (EquityOrderCheckPopup.kt:27)");
                }
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(-820869965);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                int iMo5010roundToPx0680j_4 = density.mo5010roundToPx0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM());
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-820867404);
                int iMo5010roundToPx0680j_42 = density.mo5010roundToPx0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                AndroidPopup_androidKt.m8111PopupK5zGePQ(null, 0L, null, new PopupProperties(false, false, false, false, 11, (DefaultConstructorMarker) null), ComposableLambda3.rememberComposableLambda(-234304279, true, new C109571(modifier5, iMo5010roundToPx0680j_4, iMo5010roundToPx0680j_42, orderChecksAlert.getOrderCheckAlert(), handleEquityOrderCheckAction, orderChecksAlert, onDismissRequest), composerStartRestartGroup, 54), composerStartRestartGroup, 27648, 7);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.equityadvancedchart.popups.EquityOrderCheckPopupKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityOrderCheckPopup.EquityOrderCheckPopup$lambda$2(orderChecksAlert, onDismissRequest, handleEquityOrderCheckAction, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(-820869965);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            int iMo5010roundToPx0680j_43 = density2.mo5010roundToPx0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM());
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-820867404);
            int iMo5010roundToPx0680j_422 = density2.mo5010roundToPx0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM());
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier52 = modifier4;
            AndroidPopup_androidKt.m8111PopupK5zGePQ(null, 0L, null, new PopupProperties(false, false, false, false, 11, (DefaultConstructorMarker) null), ComposableLambda3.rememberComposableLambda(-234304279, true, new C109571(modifier52, iMo5010roundToPx0680j_43, iMo5010roundToPx0680j_422, orderChecksAlert.getOrderCheckAlert(), handleEquityOrderCheckAction, orderChecksAlert, onDismissRequest), composerStartRestartGroup, 54), composerStartRestartGroup, 27648, 7);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: EquityOrderCheckPopup.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.popups.EquityOrderCheckPopupKt$EquityOrderCheckPopup$1 */
    static final class C109571 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<EquityOrderCheckAlert, ServerDrivenButton, Unit> $handleEquityOrderCheckAction;
        final /* synthetic */ int $horizontalPadding;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onDismissRequest;
        final /* synthetic */ EquityOrderCheckAlert $orderChecksAlert;
        final /* synthetic */ int $verticalPadding;
        final /* synthetic */ VisibleEquityOrderChecksAlert $visibleAlert;

        /* JADX WARN: Multi-variable type inference failed */
        C109571(Modifier modifier, int i, int i2, VisibleEquityOrderChecksAlert visibleEquityOrderChecksAlert, Function2<? super EquityOrderCheckAlert, ? super ServerDrivenButton, Unit> function2, EquityOrderCheckAlert equityOrderCheckAlert, Function0<Unit> function0) {
            this.$modifier = modifier;
            this.$horizontalPadding = i;
            this.$verticalPadding = i2;
            this.$visibleAlert = visibleEquityOrderChecksAlert;
            this.$handleEquityOrderCheckAction = function2;
            this.$orderChecksAlert = equityOrderCheckAlert;
            this.$onDismissRequest = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EquityOrderChecksAlertView invoke$lambda$5$lambda$2$lambda$1(int i, int i2, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            EquityOrderChecksAlertView equityOrderChecksAlertView = new EquityOrderChecksAlertView(context, null, 2, null);
            ViewsKt.setPadding(equityOrderChecksAlertView, i, i2);
            equityOrderChecksAlertView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return equityOrderChecksAlertView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(VisibleEquityOrderChecksAlert visibleEquityOrderChecksAlert, final Function2 function2, final EquityOrderCheckAlert equityOrderCheckAlert, final Function0 function0, EquityOrderChecksAlertView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.bind(visibleEquityOrderChecksAlert, new EquityOrderChecksAlertView.Callbacks() { // from class: com.robinhood.android.chart.equityadvancedchart.popups.EquityOrderCheckPopupKt$EquityOrderCheckPopup$1$1$2$1$1
                @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
                public boolean onActionClicked(ServerDrivenButton button) {
                    Intrinsics.checkNotNullParameter(button, "button");
                    function2.invoke(equityOrderCheckAlert, button);
                    function0.invoke();
                    return true;
                }
            });
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-234304279, i, -1, "com.robinhood.android.chart.equityadvancedchart.popups.EquityOrderCheckPopup.<anonymous> (EquityOrderCheckPopup.kt:33)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer, i2).m21464getScrimColor0d7_KjU(), null, 2, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            final int i3 = this.$horizontalPadding;
            final int i4 = this.$verticalPadding;
            final VisibleEquityOrderChecksAlert visibleEquityOrderChecksAlert = this.$visibleAlert;
            final Function2<EquityOrderCheckAlert, ServerDrivenButton, Unit> function2 = this.$handleEquityOrderCheckAction;
            final EquityOrderCheckAlert equityOrderCheckAlert = this.$orderChecksAlert;
            final Function0<Unit> function0 = this.$onDismissRequest;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composer, i2).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()));
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(i3) | composer.changed(i4);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.equityadvancedchart.popups.EquityOrderCheckPopupKt$EquityOrderCheckPopup$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EquityOrderCheckPopup.C109571.invoke$lambda$5$lambda$2$lambda$1(i3, i4, (Context) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(visibleEquityOrderChecksAlert) | composer.changed(function2) | composer.changedInstance(equityOrderCheckAlert) | composer.changed(function0);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.equityadvancedchart.popups.EquityOrderCheckPopupKt$EquityOrderCheckPopup$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EquityOrderCheckPopup.C109571.invoke$lambda$5$lambda$4$lambda$3(visibleEquityOrderChecksAlert, function2, equityOrderCheckAlert, function0, (EquityOrderChecksAlertView) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function1, modifierM4871backgroundbw27NRU, (Function1) objRememberedValue2, composer, 0, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
