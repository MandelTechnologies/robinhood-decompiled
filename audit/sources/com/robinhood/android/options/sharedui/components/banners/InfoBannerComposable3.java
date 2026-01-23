package com.robinhood.android.options.sharedui.components.banners;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.options.sharedui.components.banners.InfoBannerComposable;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InfoBannerComposable.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ab\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aE\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"Landroidx/compose/ui/unit/Dp;", "cornerRadius", "Lcom/robinhood/android/options/sharedui/components/banners/BannerBackground;", "background", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "Lkotlin/Function0;", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", "InfoBannerComposable-AxmokPg", "(FLcom/robinhood/android/options/sharedui/components/banners/BannerBackground;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/runtime/Composer;II)V", "InfoBannerComposable", "", "text", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "Lcom/robinhood/android/options/sharedui/components/banners/Source;", "source", "OptionsLevel3EntryPointTagComposable-uDo3WH8", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;JLcom/robinhood/android/options/sharedui/components/banners/Source;Landroidx/compose/runtime/Composer;II)V", "OptionsLevel3EntryPointTagComposable", "lib-options-shared-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.sharedui.components.banners.InfoBannerComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class InfoBannerComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoBannerComposable_AxmokPg$lambda$2(float f, InfoBannerComposable infoBannerComposable, PaddingValues paddingValues, Function3 function3, Function0 function0, Modifier modifier, Alignment alignment, int i, int i2, Composer composer, int i3) {
        m17014InfoBannerComposableAxmokPg(f, infoBannerComposable, paddingValues, function3, function0, modifier, alignment, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsLevel3EntryPointTagComposable_uDo3WH8$lambda$5(String str, Modifier modifier, Function0 function0, long j, InfoBannerComposable5 infoBannerComposable5, int i, int i2, Composer composer, int i3) {
        m17015OptionsLevel3EntryPointTagComposableuDo3WH8(str, modifier, function0, j, infoBannerComposable5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019b  */
    /* renamed from: InfoBannerComposable-AxmokPg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17014InfoBannerComposableAxmokPg(float f, final InfoBannerComposable background, final PaddingValues contentPadding, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, final Function0<Unit> onClick, Modifier modifier, Alignment alignment, Composer composer, final int i, final int i2) {
        float f2;
        int i3;
        Modifier modifier2;
        int i4;
        Alignment alignment2;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Alignment alignment3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1177969329);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(background) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(contentPadding) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    alignment2 = alignment;
                    i3 |= composerStartRestartGroup.changed(alignment2) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    Alignment center = i4 == 0 ? Alignment.INSTANCE.getCenter() : alignment2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1177969329, i3, -1, "com.robinhood.android.options.sharedui.components.banners.InfoBannerComposable (InfoBannerComposable.kt:44)");
                    }
                    Modifier modifierBackground$default = Background3.background$default(Clip.clip(modifier4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f2)), background.toBrush(), null, 0.0f, 6, null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Alignment alignment4 = center;
                    Modifier modifier5 = modifier4;
                    int i6 = i3;
                    Modifier modifierPadding = PaddingKt.padding(ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifierBackground$default, (InteractionSource3) objRememberedValue, null, false, null, null, onClick, 28, null), null, true, false, false, true, false, null, 109, null), contentPadding);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment4, false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    alignment3 = alignment4;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    alignment3 = alignment2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final float f3 = f2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.sharedui.components.banners.InfoBannerComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InfoBannerComposable3.InfoBannerComposable_AxmokPg$lambda$2(f3, background, contentPadding, content, onClick, modifier3, alignment3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            alignment2 = alignment;
            if ((599187 & i3) != 599186) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierBackground$default2 = Background3.background$default(Clip.clip(modifier4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f2)), background.toBrush(), null, 0.0f, 6, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Alignment alignment42 = center;
                Modifier modifier52 = modifier4;
                int i62 = i3;
                Modifier modifierPadding2 = PaddingKt.padding(ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifierBackground$default2, (InteractionSource3) objRememberedValue, null, false, null, null, onClick, 28, null), null, true, false, false, true, false, null, 109, null), contentPadding);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment42, false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i62 >> 6) & 112) | 6));
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    alignment3 = alignment42;
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        alignment2 = alignment;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0160  */
    /* renamed from: OptionsLevel3EntryPointTagComposable-uDo3WH8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17015OptionsLevel3EntryPointTagComposableuDo3WH8(final String text, Modifier modifier, Function0<Unit> function0, long j, InfoBannerComposable5 infoBannerComposable5, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        long jM21373getBg30d7_KjU;
        int i5;
        Modifier modifier3;
        InfoBannerComposable5 infoBannerComposable52;
        final InfoBannerComposable5 infoBannerComposable53;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1175392735);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        jM21373getBg30d7_KjU = j;
                        int i7 = composerStartRestartGroup.changed(jM21373getBg30d7_KjU) ? 2048 : 1024;
                        i3 |= i7;
                    } else {
                        jM21373getBg30d7_KjU = j;
                    }
                    i3 |= i7;
                } else {
                    jM21373getBg30d7_KjU = j;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(infoBannerComposable5 == null ? -1 : infoBannerComposable5.ordinal()) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.sharedui.components.banners.InfoBannerComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function02 = (Function0) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU();
                        }
                        if (i5 == 0) {
                            infoBannerComposable52 = InfoBannerComposable5.OPTION_SETTINGS_SECTION;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1175392735, i3, -1, "com.robinhood.android.options.sharedui.components.banners.OptionsLevel3EntryPointTagComposable (InfoBannerComposable.kt:103)");
                        }
                        final Modifier modifier4 = modifier3;
                        final Function0<Unit> function03 = function02;
                        final long j2 = jM21373getBg30d7_KjU;
                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, infoBannerComposable52.getScreen(), null, null, infoBannerComposable52.getComponent(), null, 45, null), ComposableLambda3.rememberComposableLambda(-647462260, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.sharedui.components.banners.InfoBannerComposableKt$OptionsLevel3EntryPointTagComposable$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i8) {
                                if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-647462260, i8, -1, "com.robinhood.android.options.sharedui.components.banners.OptionsLevel3EntryPointTagComposable.<anonymous> (InfoBannerComposable.kt:111)");
                                }
                                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(100);
                                InfoBannerComposable.LinearGradient linearGradient = new InfoBannerComposable.LinearGradient(CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(j2)), Tuples4.m3642to(Float.valueOf(0.6f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(j2, 0.3f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(j2))}), null, 2, null);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i9 = BentoTheme.$stable;
                                PaddingValues paddingValuesM5136PaddingValuesYgX7TsA = PaddingKt.m5136PaddingValuesYgX7TsA(bentoTheme.getSpacing(composer2, i9).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i9).m21595getXsmallD9Ej5fM());
                                final String str = text;
                                InfoBannerComposable3.m17014InfoBannerComposableAxmokPg(fM7995constructorimpl, linearGradient, paddingValuesM5136PaddingValuesYgX7TsA, ComposableLambda3.rememberComposableLambda(1690331198, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.sharedui.components.banners.InfoBannerComposableKt$OptionsLevel3EntryPointTagComposable$2.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                        invoke(boxScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BoxScope InfoBannerComposable, Composer composer3, int i10) {
                                        Intrinsics.checkNotNullParameter(InfoBannerComposable, "$this$InfoBannerComposable");
                                        if ((i10 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1690331198, i10, -1, "com.robinhood.android.options.sharedui.components.banners.OptionsLevel3EntryPointTagComposable.<anonymous>.<anonymous> (InfoBannerComposable.kt:125)");
                                        }
                                        TextStyle textS = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextS();
                                        BentoText2.m20747BentoText38GnDrw(str, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer3, 24576, 0, 8174);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), function03, modifier4, null, composer2, 3078, 64);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        infoBannerComposable53 = infoBannerComposable52;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        modifier3 = modifier2;
                    }
                    infoBannerComposable52 = infoBannerComposable5;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Modifier modifier42 = modifier3;
                    final Function0<Unit> function032 = function02;
                    final long j22 = jM21373getBg30d7_KjU;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, infoBannerComposable52.getScreen(), null, null, infoBannerComposable52.getComponent(), null, 45, null), ComposableLambda3.rememberComposableLambda(-647462260, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.sharedui.components.banners.InfoBannerComposableKt$OptionsLevel3EntryPointTagComposable$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-647462260, i8, -1, "com.robinhood.android.options.sharedui.components.banners.OptionsLevel3EntryPointTagComposable.<anonymous> (InfoBannerComposable.kt:111)");
                            }
                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(100);
                            InfoBannerComposable.LinearGradient linearGradient = new InfoBannerComposable.LinearGradient(CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(j22)), Tuples4.m3642to(Float.valueOf(0.6f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(j22, 0.3f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(j22))}), null, 2, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            PaddingValues paddingValuesM5136PaddingValuesYgX7TsA = PaddingKt.m5136PaddingValuesYgX7TsA(bentoTheme.getSpacing(composer2, i9).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i9).m21595getXsmallD9Ej5fM());
                            final String str = text;
                            InfoBannerComposable3.m17014InfoBannerComposableAxmokPg(fM7995constructorimpl, linearGradient, paddingValuesM5136PaddingValuesYgX7TsA, ComposableLambda3.rememberComposableLambda(1690331198, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.sharedui.components.banners.InfoBannerComposableKt$OptionsLevel3EntryPointTagComposable$2.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                    invoke(boxScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxScope InfoBannerComposable, Composer composer3, int i10) {
                                    Intrinsics.checkNotNullParameter(InfoBannerComposable, "$this$InfoBannerComposable");
                                    if ((i10 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1690331198, i10, -1, "com.robinhood.android.options.sharedui.components.banners.OptionsLevel3EntryPointTagComposable.<anonymous>.<anonymous> (InfoBannerComposable.kt:125)");
                                    }
                                    TextStyle textS = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextS();
                                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer3, 24576, 0, 8174);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), function032, modifier42, null, composer2, 3078, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    infoBannerComposable53 = infoBannerComposable52;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    infoBannerComposable53 = infoBannerComposable5;
                    modifier3 = modifier2;
                }
                final Function0<Unit> function04 = function02;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier3;
                    final long j3 = jM21373getBg30d7_KjU;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.sharedui.components.banners.InfoBannerComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InfoBannerComposable3.OptionsLevel3EntryPointTagComposable_uDo3WH8$lambda$5(text, modifier5, function04, j3, infoBannerComposable53, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function02 = function0;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if (i5 == 0) {
                        infoBannerComposable52 = infoBannerComposable5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Modifier modifier422 = modifier3;
                    final Function0<Unit> function0322 = function02;
                    final long j222 = jM21373getBg30d7_KjU;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, infoBannerComposable52.getScreen(), null, null, infoBannerComposable52.getComponent(), null, 45, null), ComposableLambda3.rememberComposableLambda(-647462260, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.sharedui.components.banners.InfoBannerComposableKt$OptionsLevel3EntryPointTagComposable$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-647462260, i8, -1, "com.robinhood.android.options.sharedui.components.banners.OptionsLevel3EntryPointTagComposable.<anonymous> (InfoBannerComposable.kt:111)");
                            }
                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(100);
                            InfoBannerComposable.LinearGradient linearGradient = new InfoBannerComposable.LinearGradient(CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(j222)), Tuples4.m3642to(Float.valueOf(0.6f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(j222, 0.3f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(j222))}), null, 2, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            PaddingValues paddingValuesM5136PaddingValuesYgX7TsA = PaddingKt.m5136PaddingValuesYgX7TsA(bentoTheme.getSpacing(composer2, i9).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i9).m21595getXsmallD9Ej5fM());
                            final String str = text;
                            InfoBannerComposable3.m17014InfoBannerComposableAxmokPg(fM7995constructorimpl, linearGradient, paddingValuesM5136PaddingValuesYgX7TsA, ComposableLambda3.rememberComposableLambda(1690331198, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.sharedui.components.banners.InfoBannerComposableKt$OptionsLevel3EntryPointTagComposable$2.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                    invoke(boxScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxScope InfoBannerComposable, Composer composer3, int i10) {
                                    Intrinsics.checkNotNullParameter(InfoBannerComposable, "$this$InfoBannerComposable");
                                    if ((i10 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1690331198, i10, -1, "com.robinhood.android.options.sharedui.components.banners.OptionsLevel3EntryPointTagComposable.<anonymous>.<anonymous> (InfoBannerComposable.kt:125)");
                                    }
                                    TextStyle textS = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextS();
                                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer3, 24576, 0, 8174);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), function0322, modifier422, null, composer2, 3078, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    infoBannerComposable53 = infoBannerComposable52;
                }
            }
            final Function0 function042 = function02;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        final Function0 function0422 = function02;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
