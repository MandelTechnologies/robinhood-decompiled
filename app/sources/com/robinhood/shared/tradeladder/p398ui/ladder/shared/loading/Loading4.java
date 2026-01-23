package com.robinhood.shared.tradeladder.p398ui.ladder.shared.loading;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.rows.LadderRowKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyleKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Loading.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a>\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0005H\u0002\u001a\u0017\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"LoadingLadderLazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "rowCount", "", "baseFraction", "", "priceColumnWidth", "Landroidx/compose/ui/unit/Dp;", "LoadingLadderLazyColumn--jt2gSs", "(Landroidx/compose/ui/Modifier;IFFLandroidx/compose/runtime/Composer;II)V", "LadderLoadingItem", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "center", "LadderLoadingItem-gwO9Abs", "(IIFFLandroidx/compose/runtime/Composer;I)V", "scaledFraction", "distance", "maxDistance", "minFractionAtEdge", "jitterPct", "jitterSeed", "Loading", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.loading.LoadingKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Loading4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderLoadingItem_gwO9Abs$lambda$6(int i, int i2, float f, float f2, int i3, Composer composer, int i4) {
        m26140LadderLoadingItemgwO9Abs(i, i2, f, f2, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$7(Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loading(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingLadderLazyColumn__jt2gSs$lambda$3(Modifier modifier, int i, float f, float f2, int i2, int i3, Composer composer, int i4) {
        m26141LoadingLadderLazyColumnjt2gSs(modifier, i, f, f2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingPreview$lambda$8(int i, Composer composer, int i2) {
        LoadingPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0146  */
    /* renamed from: LoadingLadderLazyColumn--jt2gSs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m26141LoadingLadderLazyColumnjt2gSs(Modifier modifier, int i, float f, float f2, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        float f3;
        float f4;
        Modifier modifier3;
        final float fM21596getXxlargeD9Ej5fM;
        int i7;
        int i8;
        final float f5;
        final int i9;
        LazyListState lazyListStateRememberLazyListState;
        boolean zChanged;
        Object objRememberedValue;
        boolean z;
        boolean z2;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier4;
        final int i10;
        final float f6;
        final float f7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1437646363);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
            }
            i6 = i3 & 4;
            if (i6 != 0) {
                if ((i2 & 384) == 0) {
                    f3 = f;
                    i4 |= composerStartRestartGroup.changed(f3) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        f4 = f2;
                        int i13 = composerStartRestartGroup.changed(f4) ? 2048 : 1024;
                        i4 |= i13;
                    } else {
                        f4 = f2;
                    }
                    i4 |= i13;
                } else {
                    f4 = f2;
                }
                if ((i4 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    final int i14 = 51;
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i12 != 0) {
                            i5 = 51;
                        }
                        if (i6 != 0) {
                            f3 = 0.5f;
                        }
                        if ((i3 & 8) == 0) {
                            i4 &= -7169;
                            fM21596getXxlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21596getXxlargeD9Ej5fM();
                            i7 = i5;
                        }
                        i8 = i4;
                        f5 = f3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1437646363, i8, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.loading.LoadingLadderLazyColumn (Loading.kt:37)");
                        }
                        if (i7 >= 50) {
                            i14 = i7 % 2 == 0 ? i7 + 1 : i7;
                        }
                        i9 = i14 / 2;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        Unit unit = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(i9);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Loading5(lazyListStateRememberLazyListState, i9, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                        z = true;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChanged2 = ((i8 & 896) != 256) | composerStartRestartGroup.changed(i14) | composerStartRestartGroup.changed(i9);
                        if ((((i8 & 7168) ^ 3072) > 2048 || !composerStartRestartGroup.changed(fM21596getXxlargeD9Ej5fM)) && (i8 & 3072) != 2048) {
                            z = false;
                        }
                        z2 = zChanged2 | z;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.loading.LoadingKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Loading4.LoadingLadderLazyColumn__jt2gSs$lambda$2$lambda$1(i14, i9, f5, fM21596getXxlargeD9Ej5fM, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        float f8 = fM21596getXxlargeD9Ej5fM;
                        composer2 = composerStartRestartGroup;
                        LazyDslKt.LazyColumn(modifierFillMaxSize$default, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer2, 12582912, 380);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        i10 = i7;
                        f6 = f5;
                        f7 = f8;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        modifier3 = modifier2;
                    }
                    i7 = i5;
                    fM21596getXxlargeD9Ej5fM = f4;
                    i8 = i4;
                    f5 = f3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (i7 >= 50) {
                    }
                    i9 = i14 / 2;
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    Unit unit2 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(i9);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new Loading5(lazyListStateRememberLazyListState, i9, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                        z = true;
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChanged22 = ((i8 & 896) != 256) | composerStartRestartGroup.changed(i14) | composerStartRestartGroup.changed(i9);
                        if (((i8 & 7168) ^ 3072) > 2048) {
                            z = false;
                            z2 = zChanged22 | z;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z2) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.loading.LoadingKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Loading4.LoadingLadderLazyColumn__jt2gSs$lambda$2$lambda$1(i14, i9, f5, fM21596getXxlargeD9Ej5fM, (LazyListScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                float f82 = fM21596getXxlargeD9Ej5fM;
                                composer2 = composerStartRestartGroup;
                                LazyDslKt.LazyColumn(modifierFillMaxSize$default2, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer2, 12582912, 380);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier3;
                                i10 = i7;
                                f6 = f5;
                                f7 = f82;
                            }
                        } else {
                            z = false;
                            z2 = zChanged22 | z;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z2) {
                            }
                        }
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    i10 = i5;
                    f6 = f3;
                    f7 = f4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.loading.LoadingKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Loading4.LoadingLadderLazyColumn__jt2gSs$lambda$3(modifier4, i10, f6, f7, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 384;
            f3 = f;
            if ((i2 & 3072) == 0) {
            }
            if ((i4 & 1171) != 1170) {
                composerStartRestartGroup.startDefaults();
                final int i142 = 51;
                if ((i2 & 1) != 0) {
                    if (i11 == 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 8) == 0) {
                        i7 = i5;
                        fM21596getXxlargeD9Ej5fM = f4;
                    }
                    i8 = i4;
                    f5 = f3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (i7 >= 50) {
                    }
                    i9 = i142 / 2;
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    Unit unit22 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(i9);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i;
        i6 = i3 & 4;
        if (i6 != 0) {
        }
        f3 = f;
        if ((i2 & 3072) == 0) {
        }
        if ((i4 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingLadderLazyColumn__jt2gSs$lambda$2$lambda$1(int i, final int i2, final float f, final float f2, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.items$default(LazyColumn, i, null, null, ComposableLambda3.composableLambdaInstance(473780797, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.loading.LoadingKt$LoadingLadderLazyColumn$2$1$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i3, Composer composer, int i4) {
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i4 & 48) == 0) {
                    i4 |= composer.changed(i3) ? 32 : 16;
                }
                if ((i4 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(473780797, i4, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.loading.LoadingLadderLazyColumn.<anonymous>.<anonymous>.<anonymous> (Loading.kt:59)");
                }
                Loading4.m26140LadderLoadingItemgwO9Abs(i3, i2, f, f2, composer, (i4 >> 3) & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0283  */
    /* renamed from: LadderLoadingItem-gwO9Abs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m26140LadderLoadingItemgwO9Abs(final int i, final int i2, final float f, final float f2, Composer composer, final int i3) {
        int i4;
        float fScaledFraction;
        float f3;
        int i5;
        float fScaledFraction2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1863811452);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            fScaledFraction = f;
            i4 |= composerStartRestartGroup.changed(fScaledFraction) ? 256 : 128;
        } else {
            fScaledFraction = f;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
        }
        if ((i4 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1863811452, i4, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.loading.LadderLoadingItem (Loading.kt:75)");
            }
            boolean z = i == i2;
            int iAbs = Math.abs(i2 - i);
            if (z) {
                f3 = fScaledFraction;
                i5 = i2 - 1;
                if (i == i5) {
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), LadderRowKt.getLadderRowHeight());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierM5156height3ABfNKs, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM());
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting()) {
                }
            } else if (i > i2) {
                fScaledFraction = scaledFraction(f, iAbs, i2, 0.15f, 0.05f, i << 1);
                f3 = fScaledFraction;
                i5 = i2 - 1;
                if (i == i5) {
                    fScaledFraction2 = f;
                } else {
                    fScaledFraction2 = i < i5 ? scaledFraction(f, iAbs, i2, 0.15f, 0.05f, (i << 1) | 1) : 0.0f;
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), LadderRowKt.getLadderRowHeight());
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifierM5156height3ABfNKs2, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM());
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Color.Companion companion5 = Color.INSTANCE;
                LadderRowKt.m26201QuantityBarRowY2L_72g(f3, companion5.m6727getWhite0d7_KjU(), false, 1.0f, Side.START, null, SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), 0.0f, 1, null), 0.0f, 1, null), true, composerStartRestartGroup, 12807600, 0);
                Spacer2.Spacer(PaddingKt.m5142padding3ABfNKs(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierM5156height3ABfNKs3 = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(ModifiersKt.bentoPlaceholder$default(companion4, true, null, 2, null), f2), C2002Dp.m7995constructorimpl(20));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getCenter(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs3);
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier3, companion32.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.endNode();
                Spacer2.Spacer(PaddingKt.m5142padding3ABfNKs(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                composer2 = composerStartRestartGroup;
                LadderRowKt.m26201QuantityBarRowY2L_72g(fScaledFraction2, companion5.m6727getWhite0d7_KjU(), false, 1.0f, Side.END, null, SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), 0.0f, 1, null), 0.0f, 1, null), true, composer2, 12807600, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                f3 = 0.0f;
                i5 = i2 - 1;
                if (i == i5) {
                }
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifierM5156height3ABfNKs22 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), LadderRowKt.getLadderRowHeight());
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i622 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN422 = PaddingKt.m5143paddingVpY3zN4(modifierM5156height3ABfNKs22, bentoTheme22.getSpacing(composerStartRestartGroup, i622).m21590getDefaultD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i622).m21595getXsmallD9Ej5fM());
                Alignment.Companion companion222 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion222.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN422);
                ComposeUiNode.Companion companion322 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor22 = companion322.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy22, companion322.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion322.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion322.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier22, companion322.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    Color.Companion companion52 = Color.INSTANCE;
                    LadderRowKt.m26201QuantityBarRowY2L_72g(f3, companion52.m6727getWhite0d7_KjU(), false, 1.0f, Side.START, null, SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(Row5.weight$default(row62, companion42, 1.0f, false, 2, null), 0.0f, 1, null), 0.0f, 1, null), true, composerStartRestartGroup, 12807600, 0);
                    Spacer2.Spacer(PaddingKt.m5142padding3ABfNKs(companion42, bentoTheme22.getSpacing(composerStartRestartGroup, i622).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    Modifier modifierM5156height3ABfNKs32 = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(ModifiersKt.bentoPlaceholder$default(companion42, true, null, 2, null), f2), C2002Dp.m7995constructorimpl(20));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion222.getCenter(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs32);
                    Function0<ComposeUiNode> constructor32 = companion322.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion322.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap32, companion322.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion322.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier32, companion322.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.endNode();
                        Spacer2.Spacer(PaddingKt.m5142padding3ABfNKs(companion42, bentoTheme22.getSpacing(composerStartRestartGroup, i622).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        composer2 = composerStartRestartGroup;
                        LadderRowKt.m26201QuantityBarRowY2L_72g(fScaledFraction2, companion52.m6727getWhite0d7_KjU(), false, 1.0f, Side.END, null, SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(Row5.weight$default(row62, companion42, 1.0f, false, 2, null), 0.0f, 1, null), 0.0f, 1, null), true, composer2, 12807600, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.loading.LoadingKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Loading4.LadderLoadingItem_gwO9Abs$lambda$6(i, i2, f, f2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static /* synthetic */ float scaledFraction$default(float f, int i, int i2, float f2, float f3, int i3, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            f2 = 0.15f;
        }
        float f4 = f2;
        if ((i4 & 16) != 0) {
            f3 = 0.06f;
        }
        float f5 = f3;
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        return scaledFraction(f, i, i2, f4, f5, i3);
    }

    private static final float scaledFraction(float f, int i, int i2, float f2, float f3, int i3) {
        if (i2 <= 0) {
            return f;
        }
        float f4 = f2 + ((1.0f - (i / i2)) * (f - f2));
        if (f3 <= 0.0f || i == 0) {
            return f4;
        }
        return RangesKt.coerceIn(f4 + (f3 * f4 * ((Random2.Random(i3).nextFloat() * 2.0f) - 1.0f)), 0.0f, f);
    }

    public static final void Loading(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-660154294);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-660154294, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.loading.Loading (Loading.kt:185)");
            }
            LadderStyleKt.WithLadderStyle(ComposableLambda3.rememberComposableLambda(1665038632, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.loading.LoadingKt.Loading.1
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
                        ComposerKt.traceEventStart(1665038632, i5, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.loading.Loading.<anonymous> (Loading.kt:187)");
                    }
                    Loading4.m26141LoadingLadderLazyColumnjt2gSs(modifier, 0, 0.0f, 0.0f, composer2, 0, 14);
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.loading.LoadingKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Loading4.Loading$lambda$7(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void LoadingPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(29285101);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(29285101, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.loading.LoadingPreview (Loading.kt:193)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(true, Loading2.INSTANCE.m26137getLambda$818853748$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.loading.LoadingKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Loading4.LoadingPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
