package com.robinhood.android.odyssey.lib.compose;

import android.view.View;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.odyssey.lib.compose.utils.ApiSdFlexibleComponentUtils;
import com.robinhood.android.odyssey.lib.compose.utils.ApiSdTextComponentDataUtils;
import com.robinhood.android.odyssey.lib.utils.ViewsKt;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextIndividualComponent;
import com.robinhood.models.serverdriven.api.ApiThemedColor;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdText.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a!\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"SdText", "", "component", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextIndividualComponent;", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextIndividualComponent;Landroidx/compose/runtime/Composer;I)V", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextComponentData;", "layout", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Layout;", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextComponentData;Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Layout;Landroidx/compose/runtime/Composer;II)V", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.odyssey.lib.compose.SdTextKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SdText {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdText$lambda$0(ApiSdTextIndividualComponent apiSdTextIndividualComponent, int i, Composer composer, int i2) {
        SdText(apiSdTextIndividualComponent, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdText$lambda$10(ApiSdTextComponentData apiSdTextComponentData, ApiSdFlexibleComponent.Layout layout, int i, int i2, Composer composer, int i3) {
        SdText(apiSdTextComponentData, layout, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdText$lambda$9$lambda$1(ApiSdTextComponentData apiSdTextComponentData, ApiSdFlexibleComponent.Layout layout, int i, int i2, Composer composer, int i3) {
        SdText(apiSdTextComponentData, layout, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SdText(final ApiSdTextIndividualComponent component, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1390206557);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1390206557, i2, -1, "com.robinhood.android.odyssey.lib.compose.SdText (SdText.kt:29)");
            }
            SdText(component.getData(), component.getLayout(), composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.compose.SdTextKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SdText.SdText$lambda$0(component, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SdText(final ApiSdTextComponentData data, ApiSdFlexibleComponent.Layout layout, Composer composer, final int i, final int i2) {
        int i3;
        ApiSdFlexibleComponent.Layout layout2;
        Function0 function0;
        Composer composer2;
        final ApiSdFlexibleComponent.Layout layout3;
        ApiSdFlexibleComponent.Insets insets;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(334693958);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                layout2 = layout;
                i3 |= composerStartRestartGroup.changedInstance(layout2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                final ApiSdFlexibleComponent.Layout layout4 = i4 == 0 ? null : layout2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(334693958, i3, -1, "com.robinhood.android.odyssey.lib.compose.SdText (SdText.kt:40)");
                }
                if (!Intrinsics.areEqual(data.getIs_visible(), Boolean.FALSE)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.compose.SdTextKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SdText.SdText$lambda$9$lambda$1(data, layout4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                ApiThemedColor text_color = data.getText_color();
                ThemedColor dbModel = text_color != null ? text_color.toDbModel() : null;
                composerStartRestartGroup.startReplaceGroup(-481644394);
                Color composeColor = dbModel == null ? null : SduiColors2.toComposeColor(dbModel, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                ApiSdTextComponentData.TextAppearance style = data.getStyle();
                composerStartRestartGroup.startReplaceGroup(-481642991);
                TextStyle compose = style == null ? null : ApiSdTextComponentDataUtils.toCompose(style, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-481643177);
                if (compose == null) {
                    compose = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM();
                }
                TextStyle textStyle = compose;
                composerStartRestartGroup.endReplaceGroup();
                ApiSdTextComponentData.Alignment alignment = data.getAlignment();
                composerStartRestartGroup.startReplaceGroup(-481640495);
                TextAlign textAlignM7912boximpl = alignment == null ? null : TextAlign.m7912boximpl(ApiSdTextComponentDataUtils.toCompose(alignment, composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
                int value = textAlignM7912boximpl != null ? textAlignM7912boximpl.getValue() : TextAlign.INSTANCE.m7924getStarte0LSkKk();
                final SdBaseView.Callbacks callbacksRequireComponentCallbacks = ViewsKt.requireComponentCallbacks((View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView()));
                final ApiSdAction on_click = data.getOn_click();
                composerStartRestartGroup.startReplaceGroup(-481635840);
                if (on_click == null) {
                    function0 = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(callbacksRequireComponentCallbacks) | composerStartRestartGroup.changedInstance(data) | composerStartRestartGroup.changedInstance(on_click);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.odyssey.lib.compose.SdTextKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SdText.SdText$lambda$9$lambda$4$lambda$3$lambda$2(callbacksRequireComponentCallbacks, data, on_click);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function0 = (Function0) objRememberedValue;
                }
                composerStartRestartGroup.endReplaceGroup();
                PaddingValues compose2 = (layout4 == null || (insets = layout4.getInsets()) == null) ? null : ApiSdFlexibleComponentUtils.toCompose(insets);
                ApiSdFlexibleComponent.LayoutStrategy strategy = layout4 != null ? layout4.getStrategy() : null;
                String text = data.getText();
                composerStartRestartGroup.startReplaceGroup(-481620529);
                if (text == null) {
                    composer2 = composerStartRestartGroup;
                    layout3 = layout4;
                } else {
                    Modifier modifierFillMaxWidth$default = Modifier.INSTANCE;
                    if (strategy == ApiSdFlexibleComponent.LayoutStrategy.MATCH_PARENT) {
                        modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierFillMaxWidth$default, 0.0f, 1, null);
                    }
                    Modifier modifierM4893clickableXHw0xAI$default = modifierFillMaxWidth$default;
                    if (function0 != null) {
                        modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4893clickableXHw0xAI$default, false, null, null, function0, 7, null);
                    }
                    Modifier modifierPadding = modifierM4893clickableXHw0xAI$default;
                    if (compose2 != null) {
                        modifierPadding = PaddingKt.padding(modifierPadding, compose2);
                    }
                    composer2 = composerStartRestartGroup;
                    ApiSdFlexibleComponent.Layout layout5 = layout4;
                    Color color = composeColor;
                    layout3 = layout5;
                    BentoText2.m20747BentoText38GnDrw(text, modifierPadding, color, null, null, null, TextAlign.m7912boximpl(value), 0, false, 0, 0, null, 0, textStyle, composer2, 0, 0, 8120);
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                layout3 = layout2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.compose.SdTextKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SdText.SdText$lambda$10(data, layout3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        layout2 = layout;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!Intrinsics.areEqual(data.getIs_visible(), Boolean.FALSE)) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdText$lambda$9$lambda$4$lambda$3$lambda$2(SdBaseView.Callbacks callbacks, ApiSdTextComponentData apiSdTextComponentData, ApiSdAction apiSdAction) {
        callbacks.onComponentAction(apiSdTextComponentData.getId(), apiSdAction);
        return Unit.INSTANCE;
    }
}
