package com.robinhood.android.supportchat.thread.compose;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.supportchat.thread.compose.CxChatSuggestedResponse;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p355ui.p356v2.ChatbotSuggestedResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CxChatSuggestedResponse.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aI\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/models/ui/v2/ChatbotSuggestedResponse;", "suggestedResponse", "", "enabled", "isLoading", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "CxChatSuggestedResponse", "(Lcom/robinhood/models/ui/v2/ChatbotSuggestedResponse;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function2;", "Lcom/robinhood/android/supportchat/thread/compose/State;", "Lcom/robinhood/android/supportchat/thread/compose/ChatbotChip$StatefulColors;", "content", "BentoChipSurface", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "pressed", "feature-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatSuggestedResponseKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CxChatSuggestedResponse3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoChipSurface$lambda$3(boolean z, Function0 function0, Modifier modifier, Function4 function4, int i, int i2, Composer composer, int i3) {
        BentoChipSurface(z, function0, modifier, function4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatSuggestedResponse$lambda$0(ChatbotSuggestedResponse chatbotSuggestedResponse, boolean z, boolean z2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CxChatSuggestedResponse(chatbotSuggestedResponse, z, z2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CxChatSuggestedResponse(final ChatbotSuggestedResponse suggestedResponse, final boolean z, final boolean z2, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(suggestedResponse, "suggestedResponse");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1594079161);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(suggestedResponse) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1594079161, i3, -1, "com.robinhood.android.supportchat.thread.compose.CxChatSuggestedResponse (CxChatSuggestedResponse.kt:39)");
            }
            BentoChipSurface(z, onClick, TestTag3.testTag(modifier3, "SuggestedResponseChip"), ComposableLambda3.rememberComposableLambda(576559213, true, new Function4<CxChatSuggestedResponse4, CxChatSuggestedResponse.StatefulColors, Composer, Integer, Unit>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatSuggestedResponseKt.CxChatSuggestedResponse.1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(CxChatSuggestedResponse4 cxChatSuggestedResponse4, CxChatSuggestedResponse.StatefulColors statefulColors, Composer composer2, Integer num) {
                    invoke(cxChatSuggestedResponse4, statefulColors, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(CxChatSuggestedResponse4 state, CxChatSuggestedResponse.StatefulColors colors, Composer composer2, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(colors, "colors");
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (composer2.changed(state.ordinal()) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i5 & 48) == 0) {
                        i6 |= composer2.changed(colors) ? 32 : 16;
                    }
                    if ((i6 & 147) == 146 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(576559213, i6, -1, "com.robinhood.android.supportchat.thread.compose.CxChatSuggestedResponse.<anonymous> (CxChatSuggestedResponse.kt:45)");
                    }
                    boolean z3 = z2;
                    float f = z3 ? 0.0f : 1.0f;
                    ChatbotSuggestedResponse chatbotSuggestedResponse = suggestedResponse;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(chatbotSuggestedResponse.getText(), Alpha.alpha(TestTag3.testTag(companion, "SuggestedResponseContent"), f), Color.m6701boximpl(colors.foregroundColor(state, composer2, i6 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE).getValue().getValue()), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 0, 0, 8184);
                    composer2.startReplaceGroup(-927209871);
                    if (z3) {
                        BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(boxScopeInstance.align(TestTag3.testTag(companion, "SuggestedResponseProgressBar"), companion2.getCenter()), BentoProgressIndicator3.f5153XS, 0L, composer2, 48, 4);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072 | ((i3 >> 6) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatSuggestedResponseKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CxChatSuggestedResponse3.CxChatSuggestedResponse$lambda$0(suggestedResponse, z, z2, onClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void BentoChipSurface(final boolean z, final Function0<Unit> function0, Modifier modifier, final Function4<? super CxChatSuggestedResponse4, ? super CxChatSuggestedResponse.StatefulColors, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        CxChatSuggestedResponse4 cxChatSuggestedResponse4;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1920675901);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1920675901, i3, -1, "com.robinhood.android.supportchat.thread.compose.BentoChipSurface (CxChatSuggestedResponse.kt:74)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSource2.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState4<Boolean> snapshotState4CollectIsPressedAsState = PressInteraction2.collectIsPressedAsState((InteractionSource3) objRememberedValue, composerStartRestartGroup, 6);
            if (!z) {
                cxChatSuggestedResponse4 = CxChatSuggestedResponse4.Disabled;
            } else {
                cxChatSuggestedResponse4 = BentoChipSurface$lambda$2(snapshotState4CollectIsPressedAsState) ? CxChatSuggestedResponse4.Pressed : CxChatSuggestedResponse4.Default;
            }
            final CxChatSuggestedResponse4 cxChatSuggestedResponse42 = cxChatSuggestedResponse4;
            modifier2 = modifier3;
            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(710039643, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatSuggestedResponseKt.BentoChipSurface.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(710039643, i5, -1, "com.robinhood.android.supportchat.thread.compose.BentoChipSurface.<anonymous> (CxChatSuggestedResponse.kt:84)");
                    }
                    ProvidedValue<C2002Dp> providedValueProvides = InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(C2002Dp.m7993boximpl(C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM()));
                    final CxChatSuggestedResponse4 cxChatSuggestedResponse43 = cxChatSuggestedResponse42;
                    final Function0<Unit> function02 = function0;
                    final Modifier modifier4 = modifier2;
                    final boolean z2 = z;
                    final Function4<CxChatSuggestedResponse4, CxChatSuggestedResponse.StatefulColors, Composer, Integer, Unit> function42 = function4;
                    CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-708780773, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatSuggestedResponseKt.BentoChipSurface.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-708780773, i6, -1, "com.robinhood.android.supportchat.thread.compose.BentoChipSurface.<anonymous>.<anonymous> (CxChatSuggestedResponse.kt:85)");
                            }
                            CxChatSuggestedResponse2 cxChatSuggestedResponse2 = CxChatSuggestedResponse2.INSTANCE;
                            final CxChatSuggestedResponse.StatefulColors colors = cxChatSuggestedResponse2.getColors(composer3, 6);
                            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(cxChatSuggestedResponse2.m19157getShapeRadiusD9Ej5fM());
                            long value = colors.backgroundColor(cxChatSuggestedResponse43, composer3, 0).getValue().getValue();
                            BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(cxChatSuggestedResponse2.m19154getOutlinedBorderSizeD9Ej5fM(), colors.outlineColor(cxChatSuggestedResponse43, composer3, 0).getValue().getValue());
                            Function0<Unit> function03 = function02;
                            Modifier modifier5 = modifier4;
                            boolean z3 = z2;
                            final Function4<CxChatSuggestedResponse4, CxChatSuggestedResponse.StatefulColors, Composer, Integer, Unit> function43 = function42;
                            final CxChatSuggestedResponse4 cxChatSuggestedResponse44 = cxChatSuggestedResponse43;
                            SurfaceKt.m5969Surfaceo_FOJdg(function03, modifier5, z3, roundedCornerShapeM5327RoundedCornerShape0680j_4, value, 0L, 0.0f, 0.0f, borderStrokeM4886BorderStrokecXLIe8U, null, ComposableLambda3.rememberComposableLambda(-1981449114, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatSuggestedResponseKt.BentoChipSurface.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i7) {
                                    if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1981449114, i7, -1, "com.robinhood.android.supportchat.thread.compose.BentoChipSurface.<anonymous>.<anonymous>.<anonymous> (CxChatSuggestedResponse.kt:97)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    CxChatSuggestedResponse2 cxChatSuggestedResponse22 = CxChatSuggestedResponse2.INSTANCE;
                                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, cxChatSuggestedResponse22.m19155getPaddingHorizontalD9Ej5fM(), cxChatSuggestedResponse22.m19156getPaddingVerticalD9Ej5fM());
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function4<CxChatSuggestedResponse4, CxChatSuggestedResponse.StatefulColors, Composer, Integer, Unit> function44 = function43;
                                    CxChatSuggestedResponse4 cxChatSuggestedResponse45 = cxChatSuggestedResponse44;
                                    CxChatSuggestedResponse.StatefulColors statefulColors = colors;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5143paddingVpY3zN4);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    function44.invoke(cxChatSuggestedResponse45, statefulColors, composer4, 0);
                                    composer4.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 0, 6, 736);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, ProvidedValue.$stable | 48);
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
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatSuggestedResponseKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CxChatSuggestedResponse3.BentoChipSurface$lambda$3(z, function0, modifier2, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean BentoChipSurface$lambda$2(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }
}
