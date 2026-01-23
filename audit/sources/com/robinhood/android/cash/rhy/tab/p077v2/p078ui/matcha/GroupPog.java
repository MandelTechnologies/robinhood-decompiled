package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.matcha;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
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
import com.robinhood.compose.bento.component.BentoPogBackgroundOverride;
import com.robinhood.compose.bento.component.BentoPogContent;
import com.robinhood.compose.bento.component.BentoPogDefaults;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoPogState;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GroupPog.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"GroupPog", "", "modifier", "Landroidx/compose/ui/Modifier;", "size", "Lcom/robinhood/compose/bento/component/BentoPogSize;", "content", "", "Lcom/robinhood/compose/bento/component/BentoPogContent;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoPogSize;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.matcha.GroupPogKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class GroupPog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupPog$lambda$5(Modifier modifier, BentoPogSize bentoPogSize, List list, int i, int i2, Composer composer, int i3) {
        GroupPog(modifier, bentoPogSize, list, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void GroupPog(Modifier modifier, BentoPogSize bentoPogSize, final List<? extends BentoPogContent> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        BentoPogSize bentoPogSize2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(991941251);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(bentoPogSize == null ? -1 : bentoPogSize.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            bentoPogSize2 = bentoPogSize;
        } else {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            bentoPogSize2 = i5 != 0 ? BentoPogSize.Standard : bentoPogSize;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(991941251, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.matcha.GroupPog (GroupPog.kt:21)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion3, bentoPogSize2.getSizeDp());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenterStart(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            BentoPogBackgroundOverride.ColorOverride colorOverride = new BentoPogBackgroundOverride.ColorOverride(bentoTheme.getColors(composerStartRestartGroup, i6).m21372getBg20d7_KjU(), null);
            int size = content.size();
            if (size == 1) {
                composerStartRestartGroup.startReplaceGroup(1682082607);
                BentoPogKt.BentoPog(new BentoPogState(content.get(0), BentoPogDefaults.INSTANCE.getDefaultColors(composerStartRestartGroup, BentoPogDefaults.$stable), BentoPogSize.Standard, false, false, null, colorOverride, 56, null), null, composerStartRestartGroup, BentoPogState.$stable, 2);
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            } else if (size != 2) {
                composerStartRestartGroup.startReplaceGroup(1683637319);
                composerStartRestartGroup.startReplaceGroup(1993974125);
                List<? extends BentoPogContent> listPlus = content.size() >= 3 ? CollectionsKt.plus((Collection<? extends BentoPogContent.Text>) CollectionsKt.take(content, 2), new BentoPogContent.Text("+" + (content.size() - 2), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null)) : content;
                composerStartRestartGroup.endReplaceGroup();
                int i7 = 0;
                for (Object obj : listPlus) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    BentoPogSize bentoPogSize3 = BentoPogSize.Number;
                    BentoPogBackgroundOverride.ColorOverride colorOverride2 = colorOverride;
                    BentoPogKt.BentoPog(new BentoPogState((BentoPogContent) obj, BentoPogDefaults.INSTANCE.getDefaultColors(composerStartRestartGroup, BentoPogDefaults.$stable), bentoPogSize3, false, !(r9 instanceof BentoPogContent.RemoteImage), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU()), colorOverride2, 8, null), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(bentoPogSize3.getSizeDp() / 2) * i7), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, BentoPogState.$stable, 0);
                    i7 = i8;
                    colorOverride = colorOverride2;
                }
                composerStartRestartGroup.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            } else {
                composerStartRestartGroup.startReplaceGroup(1682512515);
                Modifier modifierAlign = boxScopeInstance.align(companion3, companion.getCenter());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                composerStartRestartGroup.startReplaceGroup(-177849519);
                int i9 = 0;
                for (Object obj2 : content) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    BentoPogSize bentoPogSize4 = BentoPogSize.Number;
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(bentoPogSize4.getSizeDp() / 2) * i9);
                    BentoPogKt.BentoPog(new BentoPogState((BentoPogContent) obj2, BentoPogDefaults.INSTANCE.getDefaultColors(composerStartRestartGroup, BentoPogDefaults.$stable), bentoPogSize4, false, !(r7 instanceof BentoPogContent.RemoteImage), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU()), colorOverride, 8, null), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, fM7995constructorimpl, fM7995constructorimpl, 0.0f, 0.0f, 12, null), composerStartRestartGroup, BentoPogState.$stable, 0);
                    i9 = i10;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                Unit unit3 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            final BentoPogSize bentoPogSize5 = bentoPogSize2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.matcha.GroupPogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return GroupPog.GroupPog$lambda$5(modifier4, bentoPogSize5, content, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }
}
