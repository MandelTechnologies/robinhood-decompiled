package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.loading;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TabKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;

/* compiled from: InvestingMonitorMainLoadingContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt$lambda$1372637439$1 */
/* loaded from: classes5.dex */
final class C26560x2cbd3c9e implements Function2<Composer, Integer, Unit> {
    public static final C26560x2cbd3c9e INSTANCE = new C26560x2cbd3c9e();

    C26560x2cbd3c9e() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1372637439, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt.lambda$1372637439.<anonymous> (InvestingMonitorMainLoadingContent.kt:68)");
        }
        composer2.startReplaceGroup(1849434622);
        Object objRememberedValue = composer2.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Random.Companion companion = Random.INSTANCE;
            objRememberedValue = CollectionsKt.listOf((Object[]) new C2002Dp[]{C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(companion.nextInt(50, 120))), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(companion.nextInt(50, 120))), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(companion.nextInt(50, 120))), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(companion.nextInt(50, 120)))});
            composer2.updateRememberedValue(objRememberedValue);
        }
        final List list = (List) objRememberedValue;
        composer2.endReplaceGroup();
        final int i2 = 0;
        while (i2 < 3) {
            boolean z = i2 == 0;
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt$lambda$1372637439$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            TabKt.m5981TabbogVsAg(z, (Function0) objRememberedValue2, null, false, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(956346370, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt$lambda$1372637439$1$1$2
                public final void invoke(Column5 Tab, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                    if ((i3 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(956346370, i3, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt.lambda$1372637439.<anonymous>.<anonymous>.<anonymous> (InvestingMonitorMainLoadingContent.kt:83)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme.getSpacing(composer3, i4).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer3, i4).m21593getSmallD9Ej5fM()), true, null, 2, null);
                    List<C2002Dp> list2 = list;
                    int i5 = i2;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierBentoPlaceholder$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw("...", SizeKt.m5174width3ABfNKs(companion2, list2.get(i5).getValue()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i4).getTextM(), composer3, 6, 0, 8188);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                    invoke(column5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer2, 54), composer2, 12586032, 116);
            i2++;
            composer2 = composer;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
