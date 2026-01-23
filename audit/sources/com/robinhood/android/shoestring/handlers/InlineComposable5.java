package com.robinhood.android.shoestring.handlers;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.PlaceholderVerticalAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.shoestring.ShoeString;
import com.robinhood.android.shoestring.StringsKt;
import com.robinhood.android.shoestring.TagHandlers2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InlineComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aO\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001aG\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"", "tagText", "Landroidx/compose/ui/unit/Dp;", "width", "height", "altText", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "alignment", "Lkotlin/Function1;", "", "composable", "Lcom/robinhood/android/shoestring/handlers/InlineComposable;", "inlineComposable-9_Cy5b0", "(Ljava/lang/String;FFLjava/lang/String;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/android/shoestring/handlers/InlineComposable;", "inlineComposable", "size", "inlineComposable-XiT_tcQ", "(Ljava/lang/String;FLjava/lang/String;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/android/shoestring/handlers/InlineComposable;", "PreviewInlineComposable", "(Landroidx/compose/runtime/Composer;I)V", "lib-shoestring_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.shoestring.handlers.InlineComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InlineComposable5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewInlineComposable$lambda$3(int i, Composer composer, int i2) {
        PreviewInlineComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: inlineComposable-9_Cy5b0, reason: not valid java name */
    public static final InlineComposable m18930inlineComposable9_Cy5b0(String tagText, float f, float f2, String str, int i, Function3<? super String, ? super Composer, ? super Integer, Unit> composable, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        Intrinsics.checkNotNullParameter(composable, "composable");
        composer.startReplaceGroup(-2055690663);
        String str2 = (i3 & 8) != 0 ? tagText : str;
        int iM7577getCenterJ6kI3mc = (i3 & 16) != 0 ? PlaceholderVerticalAlign.INSTANCE.m7577getCenterJ6kI3mc() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2055690663, i2, -1, "com.robinhood.android.shoestring.handlers.inlineComposable (InlineComposable.kt:37)");
        }
        InlineComposable inlineComposable = new InlineComposable(tagText, new Placeholder(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5018toSp0xMU5do(f), ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5018toSp0xMU5do(f2), iM7577getCenterJ6kI3mc, null), str2, composable);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return inlineComposable;
    }

    /* renamed from: inlineComposable-XiT_tcQ, reason: not valid java name */
    public static final InlineComposable m18931inlineComposableXiT_tcQ(String tagText, float f, String str, int i, Function3<? super String, ? super Composer, ? super Integer, Unit> composable, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        Intrinsics.checkNotNullParameter(composable, "composable");
        composer.startReplaceGroup(-637294009);
        String str2 = (i3 & 4) != 0 ? tagText : str;
        if ((i3 & 8) != 0) {
            i = PlaceholderVerticalAlign.INSTANCE.m7577getCenterJ6kI3mc();
        }
        int i4 = i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-637294009, i2, -1, "com.robinhood.android.shoestring.handlers.inlineComposable (InlineComposable.kt:55)");
        }
        int i5 = i2 << 3;
        InlineComposable inlineComposableM18930inlineComposable9_Cy5b0 = m18930inlineComposable9_Cy5b0(tagText, f, f, str2, i4, composable, composer, (i2 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return inlineComposableM18930inlineComposable9_Cy5b0;
    }

    public static final void PreviewInlineComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2065059635);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2065059635, i, -1, "com.robinhood.android.shoestring.handlers.PreviewInlineComposable (InlineComposable.kt:81)");
            }
            float f = 20;
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(f);
            InlineComposable2 inlineComposable2 = InlineComposable2.INSTANCE;
            ShoeString shoeString = StringsKt.toShoeString("This has an {{first/}} inline icon or {{second/}} two", TagHandlers2.plus(m18931inlineComposableXiT_tcQ("first", fM7995constructorimpl, null, 0, inlineComposable2.m18928getLambda$2036505310$lib_shoestring_externalDebug(), composerStartRestartGroup, 24630, 12), m18931inlineComposableXiT_tcQ("second", C2002Dp.m7995constructorimpl(f), null, 0, inlineComposable2.m18929getLambda$722247118$lib_shoestring_externalDebug(), composerStartRestartGroup, 24630, 12)), composerStartRestartGroup, 6);
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m6727getWhite0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m5666TextIbK3jfQ(shoeString.getAnnotatedString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, shoeString.getInlineContent(), null, null, composerStartRestartGroup, 0, 0, 229374);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.shoestring.handlers.InlineComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InlineComposable5.PreviewInlineComposable$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
