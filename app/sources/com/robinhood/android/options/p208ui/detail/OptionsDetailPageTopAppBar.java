package com.robinhood.android.options.p208ui.detail;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageToolbarState;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageTopAppBar.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aS\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"OptionsDetailPageTopAppBar", "", "state", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "topBarScrollState", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "onBackPressed", "Lkotlin/Function0;", "onToolbarMenuItemTapped", "Lkotlin/Function1;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState$MenuItemState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState;Landroidx/compose/foundation/ScrollState;Lcom/robinhood/compose/bento/component/TopBarScrollState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBarKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsDetailPageTopAppBar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPageTopAppBar$lambda$0(OptionsDetailPageToolbarState optionsDetailPageToolbarState, ScrollState scrollState, TopBarScrollState topBarScrollState, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionsDetailPageTopAppBar(optionsDetailPageToolbarState, scrollState, topBarScrollState, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsDetailPageTopAppBar(final OptionsDetailPageToolbarState optionsDetailPageToolbarState, final ScrollState scrollState, final TopBarScrollState topBarScrollState, final Function0<Unit> onBackPressed, final Function1<? super OptionsDetailPageToolbarState.MenuItemState, Unit> onToolbarMenuItemTapped, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final CharSequence charSequence;
        Composer composer2;
        final Modifier modifier3;
        CharSequence subtitle;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(topBarScrollState, "topBarScrollState");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onToolbarMenuItemTapped, "onToolbarMenuItemTapped");
        Composer composerStartRestartGroup = composer.startRestartGroup(-973688259);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(optionsDetailPageToolbarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(scrollState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(topBarScrollState) : composerStartRestartGroup.changedInstance(topBarScrollState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onToolbarMenuItemTapped) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-973688259, i3, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBar (OptionsDetailPageTopAppBar.kt:22)");
                }
                charSequence = "";
                if (optionsDetailPageToolbarState != null || (title = optionsDetailPageToolbarState.getTitle()) == null) {
                    final CharSequence title = "";
                }
                if (optionsDetailPageToolbarState != null && (subtitle = optionsDetailPageToolbarState.getSubtitle()) != null) {
                    charSequence = subtitle;
                }
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-550221910, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBarKt.OptionsDetailPageTopAppBar.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-550221910, i5, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBar.<anonymous> (OptionsDetailPageTopAppBar.kt:33)");
                        }
                        Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, topBarScrollState.getOpacity());
                        CharSequence charSequence2 = title;
                        CharSequence charSequence3 = charSequence;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAlpha);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        String string2 = charSequence2.toString();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU();
                        TextStyle textM = bentoTheme.getTypography(composer3, i6).getTextM();
                        TextOverflow.Companion companion2 = TextOverflow.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM, composer3, 817889280, 0, 7546);
                        String string3 = charSequence3.toString();
                        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU();
                        TextStyle textM2 = bentoTheme.getTypography(composer3, i6).getTextM();
                        BentoText2.m20747BentoText38GnDrw(string3, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM2, composer3, 817889280, 0, 7546);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), TopBarScrollState3.scrollableTopBarState(modifier5, scrollState, topBarScrollState), ComposableLambda3.rememberComposableLambda(-1688097538, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBarKt.OptionsDetailPageTopAppBar.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1688097538, i5, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBar.<anonymous> (OptionsDetailPageTopAppBar.kt:51)");
                        }
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBackPressed, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-589031457, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBarKt.OptionsDetailPageTopAppBar.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                        invoke(row5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-589031457, i5, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBar.<anonymous> (OptionsDetailPageTopAppBar.kt:55)");
                        }
                        OptionsDetailPageToolbarState optionsDetailPageToolbarState2 = optionsDetailPageToolbarState;
                        List<OptionsDetailPageToolbarState.MenuItemState> menuItems = optionsDetailPageToolbarState2 != null ? optionsDetailPageToolbarState2.getMenuItems() : null;
                        if (menuItems != null) {
                            OptionsDetailPageToolbarMenu.OptionsDetailPageToolbarMenu(menuItems, onToolbarMenuItemTapped, composer3, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composer2, 3462, 0, 1968);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionsDetailPageTopAppBar.OptionsDetailPageTopAppBar$lambda$0(optionsDetailPageToolbarState, scrollState, topBarScrollState, onBackPressed, onToolbarMenuItemTapped, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            charSequence = "";
            if (optionsDetailPageToolbarState != null) {
                final CharSequence title2 = "";
                if (optionsDetailPageToolbarState != null) {
                    charSequence = subtitle;
                }
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-550221910, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBarKt.OptionsDetailPageTopAppBar.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-550221910, i5, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBar.<anonymous> (OptionsDetailPageTopAppBar.kt:33)");
                        }
                        Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, topBarScrollState.getOpacity());
                        CharSequence charSequence2 = title2;
                        CharSequence charSequence3 = charSequence;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAlpha);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        String string2 = charSequence2.toString();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU();
                        TextStyle textM = bentoTheme.getTypography(composer3, i6).getTextM();
                        TextOverflow.Companion companion2 = TextOverflow.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM, composer3, 817889280, 0, 7546);
                        String string3 = charSequence3.toString();
                        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU();
                        TextStyle textM2 = bentoTheme.getTypography(composer3, i6).getTextM();
                        BentoText2.m20747BentoText38GnDrw(string3, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM2, composer3, 817889280, 0, 7546);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), TopBarScrollState3.scrollableTopBarState(modifier52, scrollState, topBarScrollState), ComposableLambda3.rememberComposableLambda(-1688097538, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBarKt.OptionsDetailPageTopAppBar.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1688097538, i5, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBar.<anonymous> (OptionsDetailPageTopAppBar.kt:51)");
                        }
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBackPressed, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-589031457, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBarKt.OptionsDetailPageTopAppBar.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                        invoke(row5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-589031457, i5, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageTopAppBar.<anonymous> (OptionsDetailPageTopAppBar.kt:55)");
                        }
                        OptionsDetailPageToolbarState optionsDetailPageToolbarState2 = optionsDetailPageToolbarState;
                        List<OptionsDetailPageToolbarState.MenuItemState> menuItems = optionsDetailPageToolbarState2 != null ? optionsDetailPageToolbarState2.getMenuItems() : null;
                        if (menuItems != null) {
                            OptionsDetailPageToolbarMenu.OptionsDetailPageToolbarMenu(menuItems, onToolbarMenuItemTapped, composer3, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composer2, 3462, 0, 1968);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
