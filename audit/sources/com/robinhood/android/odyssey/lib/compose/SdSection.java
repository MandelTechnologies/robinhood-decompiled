package com.robinhood.android.odyssey.lib.compose;

import android.view.View;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.odyssey.lib.utils.ViewsKt;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.util.extensions.CollectionsKt;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdCheckboxComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdSectionComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextIndividualComponent;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: SdSection.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"SdSection", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdSectionComponent$Data;", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdSectionComponent$Data;Landroidx/compose/runtime/Composer;I)V", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.odyssey.lib.compose.SdSectionKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SdSection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdSection$lambda$8(ApiSdSectionComponent.Data data, int i, Composer composer, int i2) {
        SdSection(data, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SdSection(final ApiSdSectionComponent.Data data, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-527872075);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i : i;
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-527872075, i2, -1, "com.robinhood.android.odyssey.lib.compose.SdSection (SdSection.kt:22)");
            }
            final SdBaseView.Callbacks callbacksRequireComponentCallbacks = ViewsKt.requireComponentCallbacks((View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView()));
            ImmutableList3<ApiSdComponent> persistentListOrEmpty = CollectionsKt.toPersistentListOrEmpty(data.getContent());
            ThemedColor background_color = data.getBackground_color();
            composerStartRestartGroup.startReplaceGroup(-478914235);
            Function0 function0 = null;
            Color composeColor = background_color == null ? null : SduiColors2.toComposeColor(background_color, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            final ApiSdAction on_click = data.getOn_click();
            composerStartRestartGroup.startReplaceGroup(-478912593);
            if (on_click != null) {
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(callbacksRequireComponentCallbacks) | composerStartRestartGroup.changedInstance(data) | composerStartRestartGroup.changedInstance(on_click);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.odyssey.lib.compose.SdSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SdSection.SdSection$lambda$7$lambda$2$lambda$1$lambda$0(callbacksRequireComponentCallbacks, data, on_click);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
            }
            Function0 function02 = function0;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierClip = Clip.clip(Modifier.INSTANCE, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(6)));
            if (function02 != null) {
                modifierClip = ClickableKt.m4893clickableXHw0xAI$default(modifierClip, false, null, null, function02, 7, null);
            }
            Modifier modifierM4872backgroundbw27NRU$default = modifierClip;
            if (composeColor != null) {
                modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM4872backgroundbw27NRU$default, composeColor.getValue(), null, 2, null);
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(303213879);
            for (ApiSdComponent apiSdComponent : persistentListOrEmpty) {
                if (apiSdComponent instanceof ApiSdTextIndividualComponent) {
                    composerStartRestartGroup.startReplaceGroup(-351370805);
                    SdText.SdText((ApiSdTextIndividualComponent) apiSdComponent, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (apiSdComponent instanceof ApiSdCheckboxComponent) {
                    composerStartRestartGroup.startReplaceGroup(-351368654);
                    SdCheckboxRow2.SdCheckboxRow((ApiSdCheckboxComponent) apiSdComponent, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1992525510);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.compose.SdSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SdSection.SdSection$lambda$8(data, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdSection$lambda$7$lambda$2$lambda$1$lambda$0(SdBaseView.Callbacks callbacks, ApiSdSectionComponent.Data data, ApiSdAction apiSdAction) {
        callbacks.onComponentAction(data.getId(), apiSdAction);
        return Unit.INSTANCE;
    }
}
