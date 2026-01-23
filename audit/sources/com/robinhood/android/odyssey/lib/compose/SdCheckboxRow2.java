package com.robinhood.android.odyssey.lib.compose;

import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.Toggleable2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.utils.ViewsKt;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseIndividualComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdCheckboxComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdCheckboxComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextSubComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SdCheckboxRow.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"SdCheckboxRow", "", "component", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxComponent;", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxComponent;Landroidx/compose/runtime/Composer;I)V", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxComponentData;", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxComponentData;Landroidx/compose/runtime/Composer;I)V", "feature-lib-odyssey_externalDebug", "rememberedData", "checked", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.odyssey.lib.compose.SdCheckboxRowKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SdCheckboxRow2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdCheckboxRow$lambda$0(ApiSdCheckboxComponent apiSdCheckboxComponent, int i, Composer composer, int i2) {
        SdCheckboxRow(apiSdCheckboxComponent, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdCheckboxRow$lambda$17$lambda$5(ApiSdCheckboxComponentData apiSdCheckboxComponentData, int i, Composer composer, int i2) {
        SdCheckboxRow(apiSdCheckboxComponentData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdCheckboxRow$lambda$18(ApiSdCheckboxComponentData apiSdCheckboxComponentData, int i, Composer composer, int i2) {
        SdCheckboxRow(apiSdCheckboxComponentData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SdCheckboxRow(final ApiSdCheckboxComponent component, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(566256784);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(566256784, i2, -1, "com.robinhood.android.odyssey.lib.compose.SdCheckboxRow (SdCheckboxRow.kt:37)");
            }
            SdCheckboxRow(component.getData(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.compose.SdCheckboxRowKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SdCheckboxRow2.SdCheckboxRow$lambda$0(component, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SdCheckboxRow(final ApiSdCheckboxComponentData data, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1613034618);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1613034618, i2, -1, "com.robinhood.android.odyssey.lib.compose.SdCheckboxRow (SdCheckboxRow.kt:44)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(data);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.odyssey.lib.compose.SdCheckboxRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SdCheckboxRow2.SdCheckboxRow$lambda$2$lambda$1(data);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
            final ApiSdCheckboxComponentData apiSdCheckboxComponentDataSdCheckboxRow$lambda$3 = SdCheckboxRow$lambda$3(snapshotState);
            if (Intrinsics.areEqual(apiSdCheckboxComponentDataSdCheckboxRow$lambda$3.getIs_visible(), Boolean.FALSE)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.compose.SdCheckboxRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SdCheckboxRow2.SdCheckboxRow$lambda$17$lambda$5(data, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(apiSdCheckboxComponentDataSdCheckboxRow$lambda$3);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.odyssey.lib.compose.SdCheckboxRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SdCheckboxRow2.SdCheckboxRow$lambda$17$lambda$7$lambda$6(apiSdCheckboxComponentDataSdCheckboxRow$lambda$3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
            String id = apiSdCheckboxComponentDataSdCheckboxRow$lambda$3.getId();
            composerStartRestartGroup.startReplaceGroup(356939524);
            if (id != null) {
                Set<String> setRequireComponentIds = ViewsKt.requireComponentIds((View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView()));
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(setRequireComponentIds) | composerStartRestartGroup.changed(id);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new SdCheckboxRow3(setRequireComponentIds, id, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
                SnapshotStateMap<String, ApiSdBaseIndividualComponentData> snapshotStateMapRequireDataChangeMap = ViewsKt.requireDataChangeMap((View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView()));
                ApiSdBaseIndividualComponentData apiSdBaseIndividualComponentData = snapshotStateMapRequireDataChangeMap.get(id);
                if (apiSdBaseIndividualComponentData instanceof ApiSdCheckboxComponentData) {
                    snapshotState.setValue((ApiSdCheckboxComponentData) MergePropertiesValues.mergePropertiesValues(SdCheckboxRow$lambda$3(snapshotState), Reflection.getOrCreateKotlinClass(ApiSdCheckboxComponentData.class), apiSdBaseIndividualComponentData));
                    ApiSdTypedValue.ApiSdBoolean typed_default_value_object = SdCheckboxRow$lambda$3(snapshotState).getTyped_default_value_object();
                    SdCheckboxRow$lambda$17$lambda$9(snapshotState2, typed_default_value_object != null ? typed_default_value_object.getValue() : false);
                    snapshotStateMapRequireDataChangeMap.remove(id);
                }
                ViewsKt.requireOnSubmitValueMap((View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView())).put(id, new ApiSdTypedValue.ApiSdBoolean(SdCheckboxRow$lambda$17$lambda$8(snapshotState2)));
            }
            composerStartRestartGroup.endReplaceGroup();
            final SdBaseView.Callbacks callbacksRequireComponentCallbacks = ViewsKt.requireComponentCallbacks((View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView()));
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean zSdCheckboxRow$lambda$17$lambda$8 = SdCheckboxRow$lambda$17$lambda$8(snapshotState2);
            Role roleM7472boximpl = Role.m7472boximpl(Role.INSTANCE.m7481getCheckboxo7Vup1c());
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(apiSdCheckboxComponentDataSdCheckboxRow$lambda$3) | composerStartRestartGroup.changedInstance(callbacksRequireComponentCallbacks) | composerStartRestartGroup.changed(snapshotState2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.odyssey.lib.compose.SdCheckboxRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SdCheckboxRow2.SdCheckboxRow$lambda$17$lambda$14$lambda$13(apiSdCheckboxComponentDataSdCheckboxRow$lambda$3, callbacksRequireComponentCallbacks, snapshotState2, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5320toggleableXHw0xAI$default = Toggleable2.m5320toggleableXHw0xAI$default(companion, zSdCheckboxRow$lambda$17$lambda$8, false, roleM7472boximpl, (Function1) objRememberedValue4, 2, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(modifierM5320toggleableXHw0xAI$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, SdCheckboxRow$lambda$17$lambda$8(snapshotState2), false, null, null, composerStartRestartGroup, 24576, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            ApiSdTextSubComponent display_label = apiSdCheckboxComponentDataSdCheckboxRow$lambda$3.getDisplay_label();
            composerStartRestartGroup.startReplaceGroup(1385693399);
            if (display_label != null) {
                SdText.SdText(display_label.getData(), null, composerStartRestartGroup, 0, 2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.compose.SdCheckboxRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SdCheckboxRow2.SdCheckboxRow$lambda$18(data, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState SdCheckboxRow$lambda$2$lambda$1(ApiSdCheckboxComponentData apiSdCheckboxComponentData) {
        return SnapshotState3.mutableStateOf$default(apiSdCheckboxComponentData, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState SdCheckboxRow$lambda$17$lambda$7$lambda$6(ApiSdCheckboxComponentData apiSdCheckboxComponentData) {
        ApiSdTypedValue.ApiSdBoolean typed_default_value_object = apiSdCheckboxComponentData.getTyped_default_value_object();
        return SnapshotState3.mutableStateOf$default(Boolean.valueOf(typed_default_value_object != null ? typed_default_value_object.getValue() : false), null, 2, null);
    }

    private static final void SdCheckboxRow$lambda$17$lambda$9(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdCheckboxRow$lambda$17$lambda$14$lambda$13(ApiSdCheckboxComponentData apiSdCheckboxComponentData, SdBaseView.Callbacks callbacks, SnapshotState snapshotState, boolean z) {
        ApiSdAction on_check = z ? apiSdCheckboxComponentData.getOn_check() : apiSdCheckboxComponentData.getOn_uncheck();
        if (on_check != null) {
            callbacks.onComponentAction(apiSdCheckboxComponentData.getId(), on_check);
        }
        SdCheckboxRow$lambda$17$lambda$9(snapshotState, z);
        return Unit.INSTANCE;
    }

    private static final boolean SdCheckboxRow$lambda$17$lambda$8(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final ApiSdCheckboxComponentData SdCheckboxRow$lambda$3(SnapshotState<ApiSdCheckboxComponentData> snapshotState) {
        return snapshotState.getValue();
    }
}
