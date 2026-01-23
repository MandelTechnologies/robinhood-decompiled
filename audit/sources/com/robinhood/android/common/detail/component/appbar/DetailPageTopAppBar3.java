package com.robinhood.android.common.detail.component.appbar;

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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DetailPageTopAppBar.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ap\u0010\u0012\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, m3636d2 = {"", "T", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "topBarScrollState", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/common/detail/component/appbar/DetailPageTopAppBarViewState;", "duxo", "Lkotlin/Function0;", "", "onBackPressed", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "actions", "DetailPageTopAppBar", "(Landroidx/compose/foundation/ScrollState;Lcom/robinhood/compose/bento/component/TopBarScrollState;Lcom/robinhood/android/udf/BaseDuxo;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "viewState", "feature-lib-detail-component_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.detail.component.appbar.DetailPageTopAppBarKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DetailPageTopAppBar3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailPageTopAppBar$lambda$1(ScrollState scrollState, TopBarScrollState topBarScrollState, BaseDuxo baseDuxo, Function0 function0, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        DetailPageTopAppBar(scrollState, topBarScrollState, baseDuxo, function0, modifier, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void DetailPageTopAppBar(final ScrollState scrollState, final TopBarScrollState topBarScrollState, final BaseDuxo<T, DetailPageTopAppBarViewState> duxo, final Function0<Unit> onBackPressed, Modifier modifier, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32;
        final Modifier modifier3;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(topBarScrollState, "topBarScrollState");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(2116086759);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(scrollState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(topBarScrollState) : composerStartRestartGroup.changedInstance(topBarScrollState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(duxo) : composerStartRestartGroup.changedInstance(duxo) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function32 = function3;
                    i3 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3M12196getLambda$145468544$feature_lib_detail_component_externalDebug = i4 == 0 ? DetailPageTopAppBar.INSTANCE.m12196getLambda$145468544$feature_lib_detail_component_externalDebug() : function32;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2116086759, i3, -1, "com.robinhood.android.common.detail.component.appbar.DetailPageTopAppBar (DetailPageTopAppBar.kt:26)");
                    }
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Function3<? super Row5, ? super Composer, ? super Integer, Unit> function34 = function3M12196getLambda$145468544$feature_lib_detail_component_externalDebug;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1080655060, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.detail.component.appbar.DetailPageTopAppBarKt.DetailPageTopAppBar.1
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
                                ComposerKt.traceEventStart(1080655060, i6, -1, "com.robinhood.android.common.detail.component.appbar.DetailPageTopAppBar.<anonymous> (DetailPageTopAppBar.kt:39)");
                            }
                            Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, topBarScrollState.getOpacity());
                            SnapshotState4<DetailPageTopAppBarViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierAlpha);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String title = DetailPageTopAppBar3.DetailPageTopAppBar$lambda$0(snapshotState4).getTitle();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                            TextStyle textM = bentoTheme.getTypography(composer2, i7).getTextM();
                            TextOverflow.Companion companion2 = TextOverflow.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM, composer2, 817889280, 0, 7546);
                            String subtitle = DetailPageTopAppBar3.DetailPageTopAppBar$lambda$0(snapshotState4).getSubtitle();
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU();
                            TextStyle textM2 = bentoTheme.getTypography(composer2, i7).getTextM();
                            BentoText2.m20747BentoText38GnDrw(subtitle, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM2, composer2, 817889280, 0, 7546);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), TopBarScrollState3.scrollableTopBarState(modifier4, scrollState, topBarScrollState), ComposableLambda3.rememberComposableLambda(-1406844888, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.detail.component.appbar.DetailPageTopAppBarKt.DetailPageTopAppBar.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                            invoke(bentoAppBarScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i6) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i6 & 6) == 0) {
                                i6 |= (i6 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1406844888, i6, -1, "com.robinhood.android.common.detail.component.appbar.DetailPageTopAppBar.<anonymous> (DetailPageTopAppBar.kt:34)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBackPressed, composer2, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), function34, null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composerStartRestartGroup, ((i3 >> 6) & 7168) | 390, 0, 1968);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    function33 = function34;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function33 = function32;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.detail.component.appbar.DetailPageTopAppBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return DetailPageTopAppBar3.DetailPageTopAppBar$lambda$1(scrollState, topBarScrollState, duxo, onBackPressed, modifier3, function33, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            function32 = function3;
            if ((74899 & i3) != 74898) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<DetailPageTopAppBarViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Function3<? super Row5, ? super Composer, ? super Integer, Unit> function342 = function3M12196getLambda$145468544$feature_lib_detail_component_externalDebug;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1080655060, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.detail.component.appbar.DetailPageTopAppBarKt.DetailPageTopAppBar.1
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
                            ComposerKt.traceEventStart(1080655060, i6, -1, "com.robinhood.android.common.detail.component.appbar.DetailPageTopAppBar.<anonymous> (DetailPageTopAppBar.kt:39)");
                        }
                        Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, topBarScrollState.getOpacity());
                        SnapshotState4<DetailPageTopAppBarViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierAlpha);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        String title = DetailPageTopAppBar3.DetailPageTopAppBar$lambda$0(snapshotState4).getTitle();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                        TextStyle textM = bentoTheme.getTypography(composer2, i7).getTextM();
                        TextOverflow.Companion companion2 = TextOverflow.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM, composer2, 817889280, 0, 7546);
                        String subtitle = DetailPageTopAppBar3.DetailPageTopAppBar$lambda$0(snapshotState4).getSubtitle();
                        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU();
                        TextStyle textM2 = bentoTheme.getTypography(composer2, i7).getTextM();
                        BentoText2.m20747BentoText38GnDrw(subtitle, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM2, composer2, 817889280, 0, 7546);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), TopBarScrollState3.scrollableTopBarState(modifier4, scrollState, topBarScrollState), ComposableLambda3.rememberComposableLambda(-1406844888, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.detail.component.appbar.DetailPageTopAppBarKt.DetailPageTopAppBar.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                        invoke(bentoAppBarScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i6 & 6) == 0) {
                            i6 |= (i6 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1406844888, i6, -1, "com.robinhood.android.common.detail.component.appbar.DetailPageTopAppBar.<anonymous> (DetailPageTopAppBar.kt:34)");
                        }
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBackPressed, composer2, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), function342, null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composerStartRestartGroup, ((i3 >> 6) & 7168) | 390, 0, 1968);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                function33 = function342;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        function32 = function3;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DetailPageTopAppBarViewState DetailPageTopAppBar$lambda$0(SnapshotState4<DetailPageTopAppBarViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
