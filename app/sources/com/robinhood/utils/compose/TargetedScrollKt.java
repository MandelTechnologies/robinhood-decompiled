package com.robinhood.utils.compose;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color3;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TargetedScroll.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001an\u0010\u0010\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\\\u0010\u0017\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u0000*\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010 \u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0002¢\u0006\u0004\b \u0010\u001f\u001a/\u0010\"\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010!\u001a\u00028\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0002¢\u0006\u0004\b\"\u0010#\u001a\u000f\u0010$\u001a\u00020\nH\u0003¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\nH\u0003¢\u0006\u0004\b&\u0010%¨\u0006'"}, m3636d2 = {"T", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Lkotlin/Function0;", "", "onScrollStart", "Lkotlin/Function1;", "Lcom/robinhood/utils/compose/TargetedScrollRowScope;", "Lkotlin/ExtensionFunctionType;", "content", "TargetedScrollRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Lcom/robinhood/utils/compose/TargetedScrollColumnScope;", "TargetedScrollColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Lcom/robinhood/utils/compose/TargetedScrollState;", "rememberTargetedScrollState", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/utils/compose/TargetedScrollState;", "targetedScrollState", "horizontalTargetedScroll", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/utils/compose/TargetedScrollState;)Landroidx/compose/ui/Modifier;", "verticalTargetedScroll", "key", "registerAsScrollTarget", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lcom/robinhood/utils/compose/TargetedScrollState;)Landroidx/compose/ui/Modifier;", "HorizontalPreview", "(Landroidx/compose/runtime/Composer;I)V", "VerticalPreview", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class TargetedScrollKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalPreview$lambda$7(int i, Composer composer, int i2) {
        HorizontalPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TargetedScrollColumn$lambda$1(Modifier modifier, ScrollState scrollState, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, Function3 function3, int i, int i2, Composer composer, int i3) {
        TargetedScrollColumn(modifier, scrollState, vertical, horizontal, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TargetedScrollRow$lambda$0(Modifier modifier, ScrollState scrollState, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Function0 function0, Function3 function3, int i, int i2, Composer composer, int i3) {
        TargetedScrollRow(modifier, scrollState, horizontal, vertical, function0, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalPreview$lambda$9(int i, Composer composer, int i2) {
        VerticalPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void TargetedScrollRow(Modifier modifier, ScrollState scrollState, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Function0<Unit> function0, final Function3<? super TargetedScrollRowScope<T>, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        ScrollState scrollState2;
        Arrangement.Horizontal start;
        int i4;
        Alignment.Vertical top;
        int i5;
        Function0<Unit> function02;
        ScrollState scrollStateRememberScrollState;
        final ScrollState scrollState3;
        int i6;
        final Arrangement.Horizontal horizontal2;
        final Function0<Unit> function03;
        final Alignment.Vertical vertical2;
        final ScrollState scrollState4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1384031297);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                scrollState2 = scrollState;
                int i8 = composerStartRestartGroup.changed(scrollState2) ? 32 : 16;
                i3 |= i8;
            } else {
                scrollState2 = scrollState;
            }
            i3 |= i8;
        } else {
            scrollState2 = scrollState;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                start = horizontal;
                i3 |= composerStartRestartGroup.changed(start) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    top = vertical;
                    i3 |= composerStartRestartGroup.changed(top) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) == 0) {
                                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                i3 &= -113;
                            } else {
                                scrollStateRememberScrollState = scrollState2;
                            }
                            if (i9 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            }
                            if (i4 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if (i5 == 0) {
                                ScrollState scrollState5 = scrollStateRememberScrollState;
                                modifier2 = modifier4;
                                scrollState3 = scrollState5;
                                Arrangement.Horizontal horizontal3 = start;
                                i6 = i3;
                                horizontal2 = horizontal3;
                                function03 = null;
                                vertical2 = top;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1384031297, i6, -1, "com.robinhood.utils.compose.TargetedScrollRow (TargetedScroll.kt:55)");
                                }
                                BoxWithConstraints.BoxWithConstraints(null, null, false, ComposableLambda3.rememberComposableLambda(112050731, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.TargetedScrollKt.TargetedScrollRow.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                                        invoke(boxWithConstraints4, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i10) {
                                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                        if ((i10 & 6) == 0) {
                                            i10 |= composer2.changed(BoxWithConstraints) ? 4 : 2;
                                        }
                                        if ((i10 & 19) == 18 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(112050731, i10, -1, "com.robinhood.utils.compose.TargetedScrollRow.<anonymous> (TargetedScroll.kt:57)");
                                        }
                                        TargetedScrollState targetedScrollStateRememberTargetedScrollState = TargetedScrollKt.rememberTargetedScrollState(BoxWithConstraints, scrollState3, composer2, i10 & 14);
                                        Modifier modifierHorizontalTargetedScroll = TargetedScrollKt.horizontalTargetedScroll(modifier2, targetedScrollStateRememberTargetedScrollState);
                                        Arrangement.Horizontal horizontal4 = horizontal2;
                                        Alignment.Vertical vertical3 = vertical2;
                                        Function3<TargetedScrollRowScope<T>, Composer, Integer, Unit> function3 = content;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontal4, vertical3, composer2, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierHorizontalTargetedScroll);
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        composer2.startReplaceGroup(1365106576);
                                        function3.invoke(new TargetedScrollRowScopeImpl(targetedScrollStateRememberTargetedScrollState, row6), composer2, 0);
                                        composer2.endReplaceGroup();
                                        composer2.endNode();
                                        Function0<Unit> function04 = function03;
                                        if (function04 != null) {
                                            composer2.startReplaceGroup(-1633490746);
                                            boolean zChangedInstance = composer2.changedInstance(targetedScrollStateRememberTargetedScrollState) | composer2.changed(function03);
                                            Function0<Unit> function05 = function03;
                                            Object objRememberedValue = composer2.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new TargetedScrollKt$TargetedScrollRow$1$2$1(targetedScrollStateRememberTargetedScrollState, function05, null);
                                                composer2.updateRememberedValue(objRememberedValue);
                                            }
                                            composer2.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(function04, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                Modifier modifier5 = modifier2;
                                scrollState4 = scrollState3;
                                modifier3 = modifier5;
                            } else {
                                ScrollState scrollState6 = scrollStateRememberScrollState;
                                modifier2 = modifier4;
                                scrollState3 = scrollState6;
                                Arrangement.Horizontal horizontal4 = start;
                                i6 = i3;
                                horizontal2 = horizontal4;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            Arrangement.Horizontal horizontal5 = start;
                            i6 = i3;
                            horizontal2 = horizontal5;
                            scrollState3 = scrollState2;
                        }
                        vertical2 = top;
                        function03 = function02;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        BoxWithConstraints.BoxWithConstraints(null, null, false, ComposableLambda3.rememberComposableLambda(112050731, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.TargetedScrollKt.TargetedScrollRow.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                                invoke(boxWithConstraints4, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i10) {
                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                if ((i10 & 6) == 0) {
                                    i10 |= composer2.changed(BoxWithConstraints) ? 4 : 2;
                                }
                                if ((i10 & 19) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(112050731, i10, -1, "com.robinhood.utils.compose.TargetedScrollRow.<anonymous> (TargetedScroll.kt:57)");
                                }
                                TargetedScrollState targetedScrollStateRememberTargetedScrollState = TargetedScrollKt.rememberTargetedScrollState(BoxWithConstraints, scrollState3, composer2, i10 & 14);
                                Modifier modifierHorizontalTargetedScroll = TargetedScrollKt.horizontalTargetedScroll(modifier2, targetedScrollStateRememberTargetedScrollState);
                                Arrangement.Horizontal horizontal42 = horizontal2;
                                Alignment.Vertical vertical3 = vertical2;
                                Function3<TargetedScrollRowScope<T>, Composer, Integer, Unit> function3 = content;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontal42, vertical3, composer2, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierHorizontalTargetedScroll);
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                composer2.startReplaceGroup(1365106576);
                                function3.invoke(new TargetedScrollRowScopeImpl(targetedScrollStateRememberTargetedScrollState, row6), composer2, 0);
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                Function0<Unit> function04 = function03;
                                if (function04 != null) {
                                    composer2.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance = composer2.changedInstance(targetedScrollStateRememberTargetedScrollState) | composer2.changed(function03);
                                    Function0<Unit> function05 = function03;
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new TargetedScrollKt$TargetedScrollRow$1$2$1(targetedScrollStateRememberTargetedScrollState, function05, null);
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    composer2.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(function04, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 7);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifier52 = modifier2;
                        scrollState4 = scrollState3;
                        modifier3 = modifier52;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        scrollState4 = scrollState2;
                        horizontal2 = start;
                        vertical2 = top;
                        function03 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.compose.TargetedScrollKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TargetedScrollKt.TargetedScrollRow$lambda$0(modifier3, scrollState4, horizontal2, vertical2, function03, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function02 = function0;
                if ((i2 & 32) == 0) {
                }
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if ((i2 & 2) == 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            top = vertical;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((i2 & 32) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        start = horizontal;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        top = vertical;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void TargetedScrollColumn(Modifier modifier, ScrollState scrollState, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, final Function3<? super TargetedScrollColumnScope<T>, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        ScrollState scrollState2;
        Arrangement.Vertical vertical2;
        int i4;
        Alignment.Horizontal horizontal2;
        final ScrollState scrollStateRememberScrollState;
        final Arrangement.Vertical top;
        final Modifier modifier2;
        int i5;
        final Alignment.Horizontal start;
        final ScrollState scrollState3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1991167713);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                scrollState2 = scrollState;
                int i7 = composerStartRestartGroup.changed(scrollState2) ? 32 : 16;
                i3 |= i7;
            } else {
                scrollState2 = scrollState;
            }
            i3 |= i7;
        } else {
            scrollState2 = scrollState;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                vertical2 = vertical;
                i3 |= composerStartRestartGroup.changed(vertical2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    horizontal2 = horizontal;
                    i3 |= composerStartRestartGroup.changed(horizontal2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i6 != 0) {
                            modifier = Modifier.INSTANCE;
                        }
                        if ((i2 & 2) == 0) {
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                            i3 &= -113;
                        } else {
                            scrollStateRememberScrollState = scrollState2;
                        }
                        top = i8 == 0 ? Arrangement.INSTANCE.getTop() : vertical2;
                        if (i4 == 0) {
                            start = Alignment.INSTANCE.getStart();
                            int i9 = i3;
                            modifier2 = modifier;
                            i5 = i9;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1991167713, i5, -1, "com.robinhood.utils.compose.TargetedScrollColumn (TargetedScroll.kt:100)");
                            }
                            BoxWithConstraints.BoxWithConstraints(null, null, false, ComposableLambda3.rememberComposableLambda(1865254517, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.TargetedScrollKt.TargetedScrollColumn.1
                                public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i10) {
                                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                    if ((i10 & 6) == 0) {
                                        i10 |= composer2.changed(BoxWithConstraints) ? 4 : 2;
                                    }
                                    if ((i10 & 19) == 18 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1865254517, i10, -1, "com.robinhood.utils.compose.TargetedScrollColumn.<anonymous> (TargetedScroll.kt:102)");
                                    }
                                    TargetedScrollState targetedScrollStateRememberTargetedScrollState = TargetedScrollKt.rememberTargetedScrollState(BoxWithConstraints, scrollStateRememberScrollState, composer2, i10 & 14);
                                    Modifier modifierVerticalTargetedScroll = TargetedScrollKt.verticalTargetedScroll(modifier2, targetedScrollStateRememberTargetedScrollState);
                                    Arrangement.Vertical vertical3 = top;
                                    Alignment.Horizontal horizontal3 = start;
                                    Function3<TargetedScrollColumnScope<T>, Composer, Integer, Unit> function3 = content;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(vertical3, horizontal3, composer2, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalTargetedScroll);
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
                                    composer2.startReplaceGroup(853702711);
                                    function3.invoke(new TargetedScrollColumnScopeImpl(targetedScrollStateRememberTargetedScrollState, column6), composer2, 0);
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                                    invoke(boxWithConstraints4, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            Modifier modifier4 = modifier2;
                            scrollState3 = scrollStateRememberScrollState;
                            modifier3 = modifier4;
                        } else {
                            int i10 = i3;
                            modifier2 = modifier;
                            i5 = i10;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        int i11 = i3;
                        modifier2 = modifier;
                        i5 = i11;
                        scrollStateRememberScrollState = scrollState2;
                        top = vertical2;
                    }
                    start = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    BoxWithConstraints.BoxWithConstraints(null, null, false, ComposableLambda3.rememberComposableLambda(1865254517, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.TargetedScrollKt.TargetedScrollColumn.1
                        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i102) {
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i102 & 6) == 0) {
                                i102 |= composer2.changed(BoxWithConstraints) ? 4 : 2;
                            }
                            if ((i102 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1865254517, i102, -1, "com.robinhood.utils.compose.TargetedScrollColumn.<anonymous> (TargetedScroll.kt:102)");
                            }
                            TargetedScrollState targetedScrollStateRememberTargetedScrollState = TargetedScrollKt.rememberTargetedScrollState(BoxWithConstraints, scrollStateRememberScrollState, composer2, i102 & 14);
                            Modifier modifierVerticalTargetedScroll = TargetedScrollKt.verticalTargetedScroll(modifier2, targetedScrollStateRememberTargetedScrollState);
                            Arrangement.Vertical vertical3 = top;
                            Alignment.Horizontal horizontal3 = start;
                            Function3<TargetedScrollColumnScope<T>, Composer, Integer, Unit> function3 = content;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(vertical3, horizontal3, composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalTargetedScroll);
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
                            composer2.startReplaceGroup(853702711);
                            function3.invoke(new TargetedScrollColumnScopeImpl(targetedScrollStateRememberTargetedScrollState, column6), composer2, 0);
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                            invoke(boxWithConstraints4, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 7);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier42 = modifier2;
                    scrollState3 = scrollStateRememberScrollState;
                    modifier3 = modifier42;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    scrollState3 = scrollState2;
                    top = vertical2;
                    start = horizontal2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.compose.TargetedScrollKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TargetedScrollKt.TargetedScrollColumn$lambda$1(modifier3, scrollState3, top, start, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            horizontal2 = horizontal;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                    }
                    if ((i2 & 2) == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        vertical2 = vertical;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        horizontal2 = horizontal;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Modifier horizontalTargetedScroll(Modifier modifier, TargetedScrollState<T> targetedScrollState) {
        targetedScrollState.setOrientation(Orientation.Horizontal);
        return ScrollKt.horizontalScroll$default(modifier, targetedScrollState.getScrollState(), false, null, false, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Modifier verticalTargetedScroll(Modifier modifier, TargetedScrollState<T> targetedScrollState) {
        targetedScrollState.setOrientation(Orientation.Vertical);
        return ScrollKt.verticalScroll$default(modifier, targetedScrollState.getScrollState(), false, null, false, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Modifier registerAsScrollTarget(Modifier modifier, final T t, final TargetedScrollState<T> targetedScrollState) {
        return OnGloballyPositionedModifier3.onGloballyPositioned(modifier, new Function1() { // from class: com.robinhood.utils.compose.TargetedScrollKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TargetedScrollKt.registerAsScrollTarget$lambda$5(targetedScrollState, t, (LayoutCoordinates) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerAsScrollTarget$lambda$5(TargetedScrollState targetedScrollState, Object obj, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        targetedScrollState.registerTarget(obj, it);
        return Unit.INSTANCE;
    }

    private static final void HorizontalPreview(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(251507085);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(251507085, i, -1, "com.robinhood.utils.compose.HorizontalPreview (TargetedScroll.kt:292)");
            }
            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(300));
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5174width3ABfNKs);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer2 = composerStartRestartGroup;
            BasicTextKt.m5334BasicTextRWo7tUw("Center On", (Modifier) null, (TextStyle) null, (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (Color3) null, (TextAutoSize) null, composer2, 6, 1022);
            ComposableSingletons$TargetedScrollKt composableSingletons$TargetedScrollKt = ComposableSingletons$TargetedScrollKt.INSTANCE;
            TargetedScrollRow(null, null, null, null, null, composableSingletons$TargetedScrollKt.getLambda$746506159$lib_utils_compose_externalDebug(), composer2, 196608, 31);
            BasicTextKt.m5334BasicTextRWo7tUw("Scroll To", (Modifier) null, (TextStyle) null, (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (Color3) null, (TextAutoSize) null, composer2, 6, 1022);
            TargetedScrollRow(null, null, null, null, null, composableSingletons$TargetedScrollKt.m26590getLambda$980148648$lib_utils_compose_externalDebug(), composer2, 196608, 31);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.compose.TargetedScrollKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TargetedScrollKt.HorizontalPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void VerticalPreview(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-691488929);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-691488929, i, -1, "com.robinhood.utils.compose.VerticalPreview (TargetedScroll.kt:324)");
            }
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(300));
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composer2 = composerStartRestartGroup;
            BasicTextKt.m5334BasicTextRWo7tUw("Center On", (Modifier) null, (TextStyle) null, (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (Color3) null, (TextAutoSize) null, composer2, 6, 1022);
            ComposableSingletons$TargetedScrollKt composableSingletons$TargetedScrollKt = ComposableSingletons$TargetedScrollKt.INSTANCE;
            TargetedScrollColumn(null, null, null, null, composableSingletons$TargetedScrollKt.getLambda$754068548$lib_utils_compose_externalDebug(), composer2, 24576, 15);
            BasicTextKt.m5334BasicTextRWo7tUw("Scroll To", (Modifier) null, (TextStyle) null, (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (Color3) null, (TextAutoSize) null, composer2, 6, 1022);
            TargetedScrollColumn(null, null, null, null, composableSingletons$TargetedScrollKt.m26589getLambda$918731859$lib_utils_compose_externalDebug(), composer2, 24576, 15);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.compose.TargetedScrollKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TargetedScrollKt.VerticalPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> TargetedScrollState<T> rememberTargetedScrollState(BoxWithConstraints4 boxWithConstraints4, ScrollState scrollState, Composer composer, int i) {
        composer.startReplaceGroup(-1303785177);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1303785177, i, -1, "com.robinhood.utils.compose.rememberTargetedScrollState (TargetedScroll.kt:177)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
            composer.updateRememberedValue(objRememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new TargetedScrollState(scrollState, coroutineScope, density, boxWithConstraints4);
            composer.updateRememberedValue(objRememberedValue2);
        }
        TargetedScrollState<T> targetedScrollState = (TargetedScrollState) objRememberedValue2;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return targetedScrollState;
    }
}
