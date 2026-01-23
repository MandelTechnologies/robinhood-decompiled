package com.robinhood.android.investFlow.sdui;

import android.os.Parcelable;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiMarkdownText2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextButton2;
import com.robinhood.android.sdui.annotations.SduiComposable;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.models.serverdriven.experimental.api.InvestFlowCapsule;
import com.robinhood.models.serverdriven.experimental.api.InvestFlowThemedImageSource;
import com.robinhood.models.serverdriven.experimental.api.MarkdownText;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiInvestFlowCapsule.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"SduiInvestFlowCapsule", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/InvestFlowCapsule;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/InvestFlowCapsule;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-invest-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investFlow.sdui.SduiInvestFlowCapsuleKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SduiInvestFlowCapsule2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiInvestFlowCapsule$lambda$4(InvestFlowCapsule investFlowCapsule, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiInvestFlowCapsule(investFlowCapsule, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @SduiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiInvestFlowCapsule(final InvestFlowCapsule<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Function0<Unit> function0Handling;
        boolean zChanged;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-990732733);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-990732733, i3, -1, "com.robinhood.android.investFlow.sdui.SduiInvestFlowCapsule (SduiInvestFlowCapsule.kt:37)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                final boolean isDay = bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay();
                Parcelable action = component.getAction();
                composerStartRestartGroup.startReplaceGroup(1388591226);
                function0Handling = action != null ? null : SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), action);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifier4, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE));
                boolean z = function0Handling == null;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(function0Handling);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investFlow.sdui.SduiInvestFlowCapsuleKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SduiInvestFlowCapsule2.SduiInvestFlowCapsule$lambda$2$lambda$1(function0Handling);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5156height3ABfNKs, z, null, null, (Function0) objRememberedValue, 6, null);
                Color composeColor = SduiColors2.toComposeColor(component.getBackground_color(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1388600231);
                long jM21372getBg20d7_KjU = composeColor != null ? bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU() : composeColor.getValue();
                composerStartRestartGroup.endReplaceGroup();
                BorderStroke borderStrokeM4886BorderStrokecXLIe8U = Intrinsics.areEqual(component.getShow_border(), Boolean.TRUE) ? BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU()) : null;
                modifier3 = modifier4;
                CardKt.m5548CardFjzlyU(modifierM4893clickableXHw0xAI$default, null, jM21372getBg20d7_KjU, 0L, borderStrokeM4886BorderStrokecXLIe8U, C2002Dp.m7995constructorimpl(0), ComposableLambda3.rememberComposableLambda(747407014, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investFlow.sdui.SduiInvestFlowCapsuleKt.SduiInvestFlowCapsule.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        Composer composer3;
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(747407014, i6, -1, "com.robinhood.android.investFlow.sdui.SduiInvestFlowCapsule.<anonymous> (SduiInvestFlowCapsule.kt:53)");
                        }
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion.getCenterVertically();
                        boolean z2 = isDay;
                        InvestFlowCapsule<ActionT> investFlowCapsule = component;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion2);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        Modifier modifierWeight$default = Row5.weight$default(row6, companion2, 2.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        float f = 0;
                        SduiMarkdownText2.SduiMarkdownText(investFlowCapsule.getTitle(), PaddingKt.m5146paddingqDBjuR0$default(companion2, ((C2002Dp) composer2.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 10, null), null, 1, 1, composer2, 27648, 4);
                        MarkdownText subtitle = investFlowCapsule.getSubtitle();
                        composer2.startReplaceGroup(-1172481123);
                        if (subtitle == null) {
                            composer3 = composer2;
                        } else {
                            Spacer2.Spacer(PaddingKt.m5142padding3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21597getXxsmallD9Ej5fM()), composer2, 0);
                            composer3 = composer2;
                            SduiMarkdownText2.SduiMarkdownText(subtitle, PaddingKt.m5146paddingqDBjuR0$default(companion2, ((C2002Dp) composer2.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 10, null), null, 0, 0, composer3, 0, 28);
                        }
                        composer3.endReplaceGroup();
                        TextButton cta = investFlowCapsule.getCta();
                        composer3.startReplaceGroup(-1172467011);
                        if (cta != null) {
                            Spacer2.Spacer(PaddingKt.m5142padding3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21597getXxsmallD9Ej5fM()), composer3, 0);
                            SduiTextButton2.SduiTextButton(cta, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer3, 6, 1), composer3, 0, 0);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        InvestFlowThemedImageSource image = investFlowCapsule.getImage();
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg((z2 ? image.getLight() : image.getDark()).getUrl(), null, null, null, 0, null, composer2, 0, 62), "capsule image", Row5.weight$default(row6, SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null), companion.getCenterStart(), ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 27696, 96);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1769472, 10);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investFlow.sdui.SduiInvestFlowCapsuleKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiInvestFlowCapsule2.SduiInvestFlowCapsule$lambda$4(component, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            final boolean isDay2 = bentoTheme2.getColors(composerStartRestartGroup, i52).getIsDay();
            Parcelable action2 = component.getAction();
            composerStartRestartGroup.startReplaceGroup(1388591226);
            if (action2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(modifier4, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE));
            if (function0Handling == null) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(function0Handling);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.investFlow.sdui.SduiInvestFlowCapsuleKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SduiInvestFlowCapsule2.SduiInvestFlowCapsule$lambda$2$lambda$1(function0Handling);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierM5156height3ABfNKs2, z, null, null, (Function0) objRememberedValue, 6, null);
                Color composeColor2 = SduiColors2.toComposeColor(component.getBackground_color(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1388600231);
                if (composeColor2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (Intrinsics.areEqual(component.getShow_border(), Boolean.TRUE)) {
                }
                modifier3 = modifier4;
                CardKt.m5548CardFjzlyU(modifierM4893clickableXHw0xAI$default2, null, jM21372getBg20d7_KjU, 0L, borderStrokeM4886BorderStrokecXLIe8U, C2002Dp.m7995constructorimpl(0), ComposableLambda3.rememberComposableLambda(747407014, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investFlow.sdui.SduiInvestFlowCapsuleKt.SduiInvestFlowCapsule.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        Composer composer3;
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(747407014, i6, -1, "com.robinhood.android.investFlow.sdui.SduiInvestFlowCapsule.<anonymous> (SduiInvestFlowCapsule.kt:53)");
                        }
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion.getCenterVertically();
                        boolean z2 = isDay2;
                        InvestFlowCapsule<ActionT> investFlowCapsule = component;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion2);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        Modifier modifierWeight$default = Row5.weight$default(row6, companion2, 2.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        float f = 0;
                        SduiMarkdownText2.SduiMarkdownText(investFlowCapsule.getTitle(), PaddingKt.m5146paddingqDBjuR0$default(companion2, ((C2002Dp) composer2.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 10, null), null, 1, 1, composer2, 27648, 4);
                        MarkdownText subtitle = investFlowCapsule.getSubtitle();
                        composer2.startReplaceGroup(-1172481123);
                        if (subtitle == null) {
                            composer3 = composer2;
                        } else {
                            Spacer2.Spacer(PaddingKt.m5142padding3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21597getXxsmallD9Ej5fM()), composer2, 0);
                            composer3 = composer2;
                            SduiMarkdownText2.SduiMarkdownText(subtitle, PaddingKt.m5146paddingqDBjuR0$default(companion2, ((C2002Dp) composer2.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 10, null), null, 0, 0, composer3, 0, 28);
                        }
                        composer3.endReplaceGroup();
                        TextButton cta = investFlowCapsule.getCta();
                        composer3.startReplaceGroup(-1172467011);
                        if (cta != null) {
                            Spacer2.Spacer(PaddingKt.m5142padding3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21597getXxsmallD9Ej5fM()), composer3, 0);
                            SduiTextButton2.SduiTextButton(cta, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer3, 6, 1), composer3, 0, 0);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        InvestFlowThemedImageSource image = investFlowCapsule.getImage();
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg((z2 ? image.getLight() : image.getDark()).getUrl(), null, null, null, 0, null, composer2, 0, 62), "capsule image", Row5.weight$default(row6, SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null), companion.getCenterStart(), ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 27696, 96);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1769472, 10);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiInvestFlowCapsule$lambda$2$lambda$1(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
