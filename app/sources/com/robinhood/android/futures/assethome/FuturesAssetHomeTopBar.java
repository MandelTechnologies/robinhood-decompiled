package com.robinhood.android.futures.assethome;

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
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: FuturesAssetHomeTopBar.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\"\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"FuturesAssetHomeTopBar", "", "scrollStateOpacity", "", "spanGrossReturn", "", "callbacks", "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "showToolbarSearchIcon", "", "(FLjava/lang/String;Lcom/robinhood/android/futures/assethome/FuturesAssetHomeScreenCallbacks;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "TopNavSearchEventLoggingIdentifier", "feature-futures-asset-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.assethome.FuturesAssetHomeTopBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesAssetHomeTopBar {
    private static final String TopNavSearchEventLoggingIdentifier = "top_nav-search";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeTopBar$lambda$0(float f, String str, FuturesAssetHomeScreen3 futuresAssetHomeScreen3, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        FuturesAssetHomeTopBar(f, str, futuresAssetHomeScreen3, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesAssetHomeTopBar(final float f, final String spanGrossReturn, final FuturesAssetHomeScreen3 callbacks, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(spanGrossReturn, "spanGrossReturn");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1497975544);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(spanGrossReturn) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    final Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    final boolean z4 = i4 == 0 ? true : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1497975544, i3, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeTopBar (FuturesAssetHomeTopBar.kt:28)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-897693731, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeTopBarKt.FuturesAssetHomeTopBar.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-897693731, i6, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeTopBar.<anonymous> (FuturesAssetHomeTopBar.kt:30)");
                            }
                            AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                            final float f2 = f;
                            final String str = spanGrossReturn;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-437237616, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeTopBarKt.FuturesAssetHomeTopBar.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i7) {
                                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-437237616, i7, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeTopBar.<anonymous>.<anonymous> (FuturesAssetHomeTopBar.kt:33)");
                                    }
                                    Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, f2);
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    String str2 = str;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
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
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i8 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextM(), composer3, 0, 0, 8190);
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_title, composer3, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextS(), composer3, 0, 0, 8186);
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54);
                            Modifier modifier4 = modifier3;
                            final FuturesAssetHomeScreen3 futuresAssetHomeScreen3 = callbacks;
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1583693756, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeTopBarKt.FuturesAssetHomeTopBar.1.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                    invoke(bentoAppBarScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i7) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i7 & 6) == 0) {
                                        i7 |= (i7 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1583693756, i7, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeTopBar.<anonymous>.<anonymous> (FuturesAssetHomeTopBar.kt:49)");
                                    }
                                    FuturesAssetHomeScreen3 futuresAssetHomeScreen32 = futuresAssetHomeScreen3;
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer3.changedInstance(futuresAssetHomeScreen32);
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new FuturesAssetHomeTopBar2(futuresAssetHomeScreen32);
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    composer3.endReplaceGroup();
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue), composer3, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54);
                            final boolean z5 = z4;
                            final FuturesAssetHomeScreen3 futuresAssetHomeScreen32 = callbacks;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, modifier4, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(485628795, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeTopBarKt.FuturesAssetHomeTopBar.1.3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                    invoke(row5, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 BentoAppBar, Composer composer3, int i7) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i7 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(485628795, i7, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeTopBar.<anonymous>.<anonymous> (FuturesAssetHomeTopBar.kt:52)");
                                    }
                                    if (z5) {
                                        BentoIconButton4.Icon.HeroSize24 heroSize24 = new BentoIconButton4.Icon.HeroSize24(ServerToBentoAssetMapper2.SEARCH_24);
                                        String strStringResource = StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_search_desc, composer3, 0);
                                        BentoIconButton4.Type type2 = BentoIconButton4.Type.Secondary;
                                        long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU();
                                        FuturesAssetHomeScreen3 futuresAssetHomeScreen33 = futuresAssetHomeScreen32;
                                        composer3.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer3.changedInstance(futuresAssetHomeScreen33);
                                        Object objRememberedValue = composer3.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new FuturesAssetHomeTopBar3(futuresAssetHomeScreen33);
                                            composer3.updateRememberedValue(objRememberedValue);
                                        }
                                        composer3.endReplaceGroup();
                                        Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                                        BentoIconButton2.m20641BentoIconButtoncqYvz4g(function0, heroSize24, strStringResource, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), "top_nav-search", null, UserInteractionEventData.Action.VIEW_SEARCH, null, new Component(Component.ComponentType.BUTTON, "top_nav-search", null, 4, null), null, 42, null), false, false, false, true, false, null, 110, null), type2, false, null, null, Color.m6701boximpl(jM21371getBg0d7_KjU), null, false, composer3, (BentoIconButton4.Icon.HeroSize24.$stable << 3) | 24576, 0, 1760);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), null, false, false, appBarType, null, 0L, null, composer2, 12586374, 0, 1904);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z3 = z4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeTopBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FuturesAssetHomeTopBar.FuturesAssetHomeTopBar$lambda$0(f, spanGrossReturn, callbacks, modifier2, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            z2 = z;
            if ((i3 & 9363) != 9362) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-897693731, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeTopBarKt.FuturesAssetHomeTopBar.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-897693731, i6, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeTopBar.<anonymous> (FuturesAssetHomeTopBar.kt:30)");
                        }
                        AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                        final float f2 = f;
                        final String str = spanGrossReturn;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-437237616, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeTopBarKt.FuturesAssetHomeTopBar.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-437237616, i7, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeTopBar.<anonymous>.<anonymous> (FuturesAssetHomeTopBar.kt:33)");
                                }
                                Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, f2);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                String str2 = str;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
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
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextM(), composer3, 0, 0, 8190);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_title, composer3, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextS(), composer3, 0, 0, 8186);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        Modifier modifier4 = modifier3;
                        final FuturesAssetHomeScreen3 futuresAssetHomeScreen3 = callbacks;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1583693756, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeTopBarKt.FuturesAssetHomeTopBar.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1583693756, i7, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeTopBar.<anonymous>.<anonymous> (FuturesAssetHomeTopBar.kt:49)");
                                }
                                FuturesAssetHomeScreen3 futuresAssetHomeScreen32 = futuresAssetHomeScreen3;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer3.changedInstance(futuresAssetHomeScreen32);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new FuturesAssetHomeTopBar2(futuresAssetHomeScreen32);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue), composer3, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final boolean z5 = z4;
                        final FuturesAssetHomeScreen3 futuresAssetHomeScreen32 = callbacks;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, modifier4, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(485628795, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeTopBarKt.FuturesAssetHomeTopBar.1.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                invoke(row5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoAppBar, Composer composer3, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(485628795, i7, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeTopBar.<anonymous>.<anonymous> (FuturesAssetHomeTopBar.kt:52)");
                                }
                                if (z5) {
                                    BentoIconButton4.Icon.HeroSize24 heroSize24 = new BentoIconButton4.Icon.HeroSize24(ServerToBentoAssetMapper2.SEARCH_24);
                                    String strStringResource = StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_search_desc, composer3, 0);
                                    BentoIconButton4.Type type2 = BentoIconButton4.Type.Secondary;
                                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU();
                                    FuturesAssetHomeScreen3 futuresAssetHomeScreen33 = futuresAssetHomeScreen32;
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer3.changedInstance(futuresAssetHomeScreen33);
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new FuturesAssetHomeTopBar3(futuresAssetHomeScreen33);
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    composer3.endReplaceGroup();
                                    Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                                    BentoIconButton2.m20641BentoIconButtoncqYvz4g(function0, heroSize24, strStringResource, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), "top_nav-search", null, UserInteractionEventData.Action.VIEW_SEARCH, null, new Component(Component.ComponentType.BUTTON, "top_nav-search", null, 4, null), null, 42, null), false, false, false, true, false, null, 110, null), type2, false, null, null, Color.m6701boximpl(jM21371getBg0d7_KjU), null, false, composer3, (BentoIconButton4.Icon.HeroSize24.$stable << 3) | 24576, 0, 1760);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, false, false, appBarType, null, 0L, null, composer2, 12586374, 0, 1904);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
                z3 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
