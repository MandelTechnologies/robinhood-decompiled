package com.robinhood.android.securitycenter.p251ui.data;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.p251ui.data.ManageDataFragment;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: ManageDataFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"ManageDataComposable", "", "callbacks", "Lcom/robinhood/android/securitycenter/ui/data/ManageDataFragment$Callbacks;", "viewState", "Lcom/robinhood/android/securitycenter/ui/data/ManageDataViewState;", "(Lcom/robinhood/android/securitycenter/ui/data/ManageDataFragment$Callbacks;Lcom/robinhood/android/securitycenter/ui/data/ManageDataViewState;Landroidx/compose/runtime/Composer;I)V", "feature-security-center_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.data.ManageDataFragmentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ManageDataFragment2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManageDataComposable$lambda$0(ManageDataFragment.Callbacks callbacks, ManageDataViewState manageDataViewState, int i, Composer composer, int i2) {
        ManageDataComposable(callbacks, manageDataViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ManageDataComposable(final ManageDataFragment.Callbacks callbacks, final ManageDataViewState viewState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(2038038419);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(viewState) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2038038419, i2, -1, "com.robinhood.android.securitycenter.ui.data.ManageDataComposable (ManageDataFragment.kt:62)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2025794078, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.securitycenter.ui.data.ManageDataFragmentKt.ManageDataComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    int i4;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2025794078, i3, -1, "com.robinhood.android.securitycenter.ui.data.ManageDataComposable.<anonymous> (ManageDataFragment.kt:64)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    ManageDataViewState manageDataViewState = viewState;
                    ManageDataFragment.Callbacks callbacks2 = callbacks;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C28186R.string.security_center_manage_data, composer2, 0), PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getDisplayCapsuleMedium(), composer2, 0, 0, 8188);
                    composer2.startReplaceGroup(-1437926521);
                    if (manageDataViewState.getShouldShowGdprSetting()) {
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(callbacks2);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new ManageDataFragment3(callbacks2);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        i4 = 0;
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, StringResources_androidKt.stringResource(C28186R.string.security_center_app_privacy_settings, composer2, 0), (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, (Function0) ((KFunction) objRememberedValue), composer2, BentoBaseRowState.$stable << 3, 61);
                    } else {
                        i4 = 0;
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer2.changedInstance(callbacks2);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new ManageDataFragment4(callbacks2);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    int i6 = BentoBaseRowState.$stable;
                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, StringResources_androidKt.stringResource(C28186R.string.security_center_data_access, composer2, i4), (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, (Function0) ((KFunction) objRememberedValue2), composer2, i6 << 3, 61);
                    composer2.startReplaceGroup(-1437908145);
                    if (manageDataViewState.getInCcpaRegionGate()) {
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer2.changedInstance(callbacks2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new ManageDataFragment5(callbacks2);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, StringResources_androidKt.stringResource(C28186R.string.security_center_data_deletion, composer2, i4), (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, (Function0) ((KFunction) objRememberedValue3), composer2, i6 << 3, 61);
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composer2.changedInstance(callbacks2);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new ManageDataFragment6(callbacks2);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceGroup();
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, StringResources_androidKt.stringResource(C28186R.string.security_center_data_sharing, composer2, i4), (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, (Function0) ((KFunction) objRememberedValue4), composer2, i6 << 3, 61);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.data.ManageDataFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManageDataFragment2.ManageDataComposable$lambda$0(callbacks, viewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
