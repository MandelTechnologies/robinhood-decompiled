package com.truelayer.payments.p419ui.components;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.p011ui.window.DialogProperties;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.feature.margin.hub.sdui.SduiMarginBufferBarLarge;
import com.truelayer.payments.p419ui.theme.Breakpoints;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.truelayer.payments.p419ui.utils.ModifierExtensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomDialog.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001ac\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/truelayer/payments/ui/components/CustomDialogProperties;", "dialogProperties", "Lkotlin/Function0;", "", "onDismissRequest", "title", CarResultComposable2.BUTTONS, "content", "CustomDialog", "(Landroidx/compose/ui/Modifier;Lcom/truelayer/payments/ui/components/CustomDialogProperties;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.components.CustomDialogKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CustomDialog {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomDialog(Modifier modifier, CustomDialogProperties customDialogProperties, final Function0<Unit> onDismissRequest, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        CustomDialogProperties customDialogProperties2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        CustomDialogProperties customDialogPropertiesM27038default;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final CustomDialogProperties customDialogProperties3;
        int i5;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        Composer composer2;
        final Modifier modifier3;
        final CustomDialogProperties customDialogProperties4;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(662244930);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                customDialogProperties2 = customDialogProperties;
                int i8 = composerStartRestartGroup.changed(customDialogProperties2) ? 32 : 16;
                i3 |= i8;
            } else {
                customDialogProperties2 = customDialogProperties;
            }
            i3 |= i8;
        } else {
            customDialogProperties2 = customDialogProperties;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 7168) == 0) {
                function23 = function2;
                i3 |= composerStartRestartGroup.changedInstance(function23) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((57344 & i) == 0) {
                    function24 = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function24) ? 16384 : 8192;
                }
                if ((i2 & 32) == 0) {
                    i6 = (458752 & i) == 0 ? composerStartRestartGroup.changedInstance(content) ? 131072 : 65536 : 196608;
                    if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) == 0) {
                                customDialogPropertiesM27038default = CustomDialogProperties.INSTANCE.m27038default();
                                i3 &= -113;
                            } else {
                                customDialogPropertiesM27038default = customDialogProperties2;
                            }
                            function25 = null;
                            if (i9 != 0) {
                                function23 = null;
                            }
                            if (i4 == 0) {
                                CustomDialogProperties customDialogProperties5 = customDialogPropertiesM27038default;
                                modifier2 = modifier4;
                                customDialogProperties3 = customDialogProperties5;
                                i5 = i3;
                                function26 = function23;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(662244930, i5, -1, "com.truelayer.payments.ui.components.CustomDialog (CustomDialog.kt:51)");
                                }
                                CustomDialogProperties customDialogProperties6 = customDialogProperties3;
                                Modifier modifier5 = modifier2;
                                Function2<? super Composer, ? super Integer, Unit> function29 = function26;
                                Function2<? super Composer, ? super Integer, Unit> function210 = function25;
                                composer2 = composerStartRestartGroup;
                                AndroidDialog_androidKt.Dialog(onDismissRequest, new DialogProperties(false, false, null, false, true, 7, null), ComposableLambda3.composableLambda(composerStartRestartGroup, 676348569, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.CustomDialogKt.CustomDialog.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i10) {
                                        if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(676348569, i10, -1, "com.truelayer.payments.ui.components.CustomDialog.<anonymous> (CustomDialog.kt:59)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ModifierExtensions.systemBarSafeAreaAndImePadding(companion), 0.0f, 1, null), Color.m6705copywmQWz5c$default(Color.INSTANCE.m6716getBlack0d7_KjU(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            final CustomDialogProperties customDialogProperties7 = customDialogProperties3;
                                            final Modifier modifier6 = modifier2;
                                            final Function2<Composer, Integer, Unit> function211 = function26;
                                            final Function2<Composer, Integer, Unit> function212 = function25;
                                            final Function2<Composer, Integer, Unit> function213 = content;
                                            composer3.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM4872backgroundbw27NRU$default);
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
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                            float f = SduiMarginBufferBarLarge.MARGIN_BUFFER_BAR_LARGE_ANIMATION_DURATION_MILLIS;
                                            ResponsiveContainer.ResponsiveContainer(null, null, new Breakpoints(modifierFillMaxWidth$default, SizeKt.m5173sizeInqDBjuR0$default(companion, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 11, null), SizeKt.m5173sizeInqDBjuR0$default(companion, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 11, null)), ComposableLambda3.composableLambda(composer3, 547959925, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.CustomDialogKt$CustomDialog$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier7, Composer composer4, Integer num) {
                                                    invoke(modifier7, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Modifier it, Composer composer4, int i11) {
                                                    Intrinsics.checkNotNullParameter(it, "it");
                                                    if ((i11 & 14) == 0) {
                                                        i11 |= composer4.changed(it) ? 4 : 2;
                                                    }
                                                    if ((i11 & 91) != 18 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(547959925, i11, -1, "com.truelayer.payments.ui.components.CustomDialog.<anonymous>.<anonymous>.<anonymous> (CustomDialog.kt:73)");
                                                        }
                                                        Modifier modifierThen = it.then(customDialogProperties7.getDialogPadding());
                                                        final Modifier modifier7 = modifier6;
                                                        final CustomDialogProperties customDialogProperties8 = customDialogProperties7;
                                                        final Function2<Composer, Integer, Unit> function214 = function211;
                                                        final Function2<Composer, Integer, Unit> function215 = function212;
                                                        final Function2<Composer, Integer, Unit> function216 = function213;
                                                        composer4.startReplaceableGroup(-483455358);
                                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                                        composer4.startReplaceableGroup(-1323940314);
                                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierThen);
                                                        if (composer4.getApplier() == null) {
                                                            Composables.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor2);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                        }
                                                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer4)), composer4, 0);
                                                        composer4.startReplaceableGroup(2058660585);
                                                        Column6 column6 = Column6.INSTANCE;
                                                        CardKt.ElevatedCard(null, null, null, null, ComposableLambda3.composableLambda(composer4, 519498980, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.CustomDialogKt$CustomDialog$1$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(3);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function3
                                                            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer5, Integer num) {
                                                                invoke(column5, composer5, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Column5 ElevatedCard, Composer composer5, int i12) {
                                                                Intrinsics.checkNotNullParameter(ElevatedCard, "$this$ElevatedCard");
                                                                if ((i12 & 81) == 16 && composer5.getSkipping()) {
                                                                    composer5.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(519498980, i12, -1, "com.truelayer.payments.ui.components.CustomDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CustomDialog.kt:78)");
                                                                }
                                                                Modifier modifierThen2 = modifier7.then(customDialogProperties8.getCardPadding());
                                                                final Function2<Composer, Integer, Unit> function217 = function214;
                                                                CustomDialogProperties customDialogProperties9 = customDialogProperties8;
                                                                Function2<Composer, Integer, Unit> function218 = function215;
                                                                Function2<Composer, Integer, Unit> function219 = function216;
                                                                composer5.startReplaceableGroup(-483455358);
                                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                                Arrangement.Vertical top = arrangement.getTop();
                                                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top, companion4.getStart(), composer5, 0);
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                                CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierThen2);
                                                                if (composer5.getApplier() == null) {
                                                                    Composables.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor3);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer5);
                                                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                                }
                                                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                final Column6 column62 = Column6.INSTANCE;
                                                                composer5.startReplaceableGroup(-726986128);
                                                                if (function217 != null) {
                                                                    CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[0], ComposableLambda3.composableLambda(composer5, 2105251099, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.CustomDialogKt$CustomDialog$1$1$1$1$1$1$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                        {
                                                                            super(2);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                            invoke(composer6, num.intValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        public final void invoke(Composer composer6, int i13) {
                                                                            if ((i13 & 11) != 2 || !composer6.getSkipping()) {
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(2105251099, i13, -1, "com.truelayer.payments.ui.components.CustomDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CustomDialog.kt:85)");
                                                                                }
                                                                                TextStyle titleLarge = MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getTitleLarge();
                                                                                final Column5 column5 = column62;
                                                                                final Function2<Composer, Integer, Unit> function220 = function217;
                                                                                TextKt.ProvideTextStyle(titleLarge, ComposableLambda3.composableLambda(composer6, -583407670, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.CustomDialogKt$CustomDialog$1$1$1$1$1$1$1$1.1
                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                                    {
                                                                                        super(2);
                                                                                    }

                                                                                    @Override // kotlin.jvm.functions.Function2
                                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                                                        invoke(composer7, num.intValue());
                                                                                        return Unit.INSTANCE;
                                                                                    }

                                                                                    public final void invoke(Composer composer7, int i14) {
                                                                                        if ((i14 & 11) == 2 && composer7.getSkipping()) {
                                                                                            composer7.skipToGroupEnd();
                                                                                            return;
                                                                                        }
                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                            ComposerKt.traceEventStart(-583407670, i14, -1, "com.truelayer.payments.ui.components.CustomDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CustomDialog.kt:86)");
                                                                                        }
                                                                                        Column5 column52 = column5;
                                                                                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                                                        Alignment.Companion companion6 = Alignment.INSTANCE;
                                                                                        Modifier modifierAlign = column52.align(modifierFillMaxWidth$default2, companion6.getCenterHorizontally());
                                                                                        Alignment center2 = companion6.getCenter();
                                                                                        Function2<Composer, Integer, Unit> function221 = function220;
                                                                                        composer7.startReplaceableGroup(733328855);
                                                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer7, 6);
                                                                                        composer7.startReplaceableGroup(-1323940314);
                                                                                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer7, 0);
                                                                                        CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                                                                                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                                                                        Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                                                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierAlign);
                                                                                        if (composer7.getApplier() == null) {
                                                                                            Composables.invalidApplier();
                                                                                        }
                                                                                        composer7.startReusableNode();
                                                                                        if (composer7.getInserting()) {
                                                                                            composer7.createNode(constructor4);
                                                                                        } else {
                                                                                            composer7.useNode();
                                                                                        }
                                                                                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer7);
                                                                                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                                                                                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                                                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                                                                                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                                                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                                                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                                                        }
                                                                                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer7)), composer7, 0);
                                                                                        composer7.startReplaceableGroup(2058660585);
                                                                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                                        function221.invoke(composer7, 0);
                                                                                        composer7.endReplaceableGroup();
                                                                                        composer7.endNode();
                                                                                        composer7.endReplaceableGroup();
                                                                                        composer7.endReplaceableGroup();
                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                            ComposerKt.traceEventEnd();
                                                                                        }
                                                                                    }
                                                                                }), composer6, 48);
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            composer6.skipToGroupEnd();
                                                                        }
                                                                    }), composer5, 56);
                                                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, Spacing.INSTANCE.m27177getREGULARD9Ej5fM()), composer5, 6);
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(column62.weight(companion6, 1.0f, false), 0.0f, 1, null);
                                                                composer5.startReplaceableGroup(-726985060);
                                                                if (customDialogProperties9.getMakeContentScrollable()) {
                                                                    modifierFillMaxWidth$default2 = ScrollKt.verticalScroll$default(modifierFillMaxWidth$default2, ScrollKt.rememberScrollState(0, composer5, 0, 1), false, null, false, 14, null);
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                composer5.startReplaceableGroup(-483455358);
                                                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer5, 0);
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                                CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                                                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                                                                if (composer5.getApplier() == null) {
                                                                    Composables.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor4);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer5);
                                                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
                                                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                                                                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                                }
                                                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                function219.invoke(composer5, 0);
                                                                composer5.endReplaceableGroup();
                                                                composer5.endNode();
                                                                composer5.endReplaceableGroup();
                                                                composer5.endReplaceableGroup();
                                                                composer5.startReplaceableGroup(839427519);
                                                                if (function218 != null) {
                                                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, Spacing.INSTANCE.m27174getLARGED9Ej5fM()), composer5, 6);
                                                                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                                                                    composer5.startReplaceableGroup(-483455358);
                                                                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer5, 0);
                                                                    composer5.startReplaceableGroup(-1323940314);
                                                                    int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                                                                    Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default3);
                                                                    if (composer5.getApplier() == null) {
                                                                        Composables.invalidApplier();
                                                                    }
                                                                    composer5.startReusableNode();
                                                                    if (composer5.getInserting()) {
                                                                        composer5.createNode(constructor5);
                                                                    } else {
                                                                        composer5.useNode();
                                                                    }
                                                                    Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer5);
                                                                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy4, companion5.getSetMeasurePolicy());
                                                                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
                                                                    if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                                    }
                                                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer5)), composer5, 0);
                                                                    composer5.startReplaceableGroup(2058660585);
                                                                    function218.invoke(composer5, 0);
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endNode();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                composer5.endReplaceableGroup();
                                                                composer5.endNode();
                                                                composer5.endReplaceableGroup();
                                                                composer5.endReplaceableGroup();
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }), composer4, 24576, 15);
                                                        composer4.endReplaceableGroup();
                                                        composer4.endNode();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }), composer3, 3072, 3);
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, ((i5 >> 6) & 14) | 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier5;
                                customDialogProperties4 = customDialogProperties6;
                                function27 = function29;
                                function28 = function210;
                            } else {
                                CustomDialogProperties customDialogProperties7 = customDialogPropertiesM27038default;
                                modifier2 = modifier4;
                                customDialogProperties3 = customDialogProperties7;
                                i5 = i3;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            i5 = i3;
                            customDialogProperties3 = customDialogProperties2;
                        }
                        function26 = function23;
                        function25 = function24;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        CustomDialogProperties customDialogProperties62 = customDialogProperties3;
                        Modifier modifier52 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function292 = function26;
                        Function2<? super Composer, ? super Integer, Unit> function2102 = function25;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, new DialogProperties(false, false, null, false, true, 7, null), ComposableLambda3.composableLambda(composerStartRestartGroup, 676348569, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.CustomDialogKt.CustomDialog.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i10) {
                                if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(676348569, i10, -1, "com.truelayer.payments.ui.components.CustomDialog.<anonymous> (CustomDialog.kt:59)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ModifierExtensions.systemBarSafeAreaAndImePadding(companion), 0.0f, 1, null), Color.m6705copywmQWz5c$default(Color.INSTANCE.m6716getBlack0d7_KjU(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    final CustomDialogProperties customDialogProperties72 = customDialogProperties3;
                                    final Modifier modifier6 = modifier2;
                                    final Function2<? super Composer, ? super Integer, Unit> function211 = function26;
                                    final Function2<? super Composer, ? super Integer, Unit> function212 = function25;
                                    final Function2<? super Composer, ? super Integer, Unit> function213 = content;
                                    composer3.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM4872backgroundbw27NRU$default);
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                    float f = SduiMarginBufferBarLarge.MARGIN_BUFFER_BAR_LARGE_ANIMATION_DURATION_MILLIS;
                                    ResponsiveContainer.ResponsiveContainer(null, null, new Breakpoints(modifierFillMaxWidth$default, SizeKt.m5173sizeInqDBjuR0$default(companion, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 11, null), SizeKt.m5173sizeInqDBjuR0$default(companion, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 11, null)), ComposableLambda3.composableLambda(composer3, 547959925, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.CustomDialogKt$CustomDialog$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier7, Composer composer4, Integer num) {
                                            invoke(modifier7, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Modifier it, Composer composer4, int i11) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            if ((i11 & 14) == 0) {
                                                i11 |= composer4.changed(it) ? 4 : 2;
                                            }
                                            if ((i11 & 91) != 18 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(547959925, i11, -1, "com.truelayer.payments.ui.components.CustomDialog.<anonymous>.<anonymous>.<anonymous> (CustomDialog.kt:73)");
                                                }
                                                Modifier modifierThen = it.then(customDialogProperties72.getDialogPadding());
                                                final Modifier modifier7 = modifier6;
                                                final CustomDialogProperties customDialogProperties8 = customDialogProperties72;
                                                final Function2<? super Composer, ? super Integer, Unit> function214 = function211;
                                                final Function2<? super Composer, ? super Integer, Unit> function215 = function212;
                                                final Function2<? super Composer, ? super Integer, Unit> function216 = function213;
                                                composer4.startReplaceableGroup(-483455358);
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                                composer4.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierThen);
                                                if (composer4.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor2);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                Column6 column6 = Column6.INSTANCE;
                                                CardKt.ElevatedCard(null, null, null, null, ComposableLambda3.composableLambda(composer4, 519498980, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.CustomDialogKt$CustomDialog$1$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer5, Integer num) {
                                                        invoke(column5, composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Column5 ElevatedCard, Composer composer5, int i12) {
                                                        Intrinsics.checkNotNullParameter(ElevatedCard, "$this$ElevatedCard");
                                                        if ((i12 & 81) == 16 && composer5.getSkipping()) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(519498980, i12, -1, "com.truelayer.payments.ui.components.CustomDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CustomDialog.kt:78)");
                                                        }
                                                        Modifier modifierThen2 = modifier7.then(customDialogProperties8.getCardPadding());
                                                        final Function2<? super Composer, ? super Integer, Unit> function217 = function214;
                                                        CustomDialogProperties customDialogProperties9 = customDialogProperties8;
                                                        Function2<Composer, Integer, Unit> function218 = function215;
                                                        Function2<Composer, Integer, Unit> function219 = function216;
                                                        composer5.startReplaceableGroup(-483455358);
                                                        Arrangement arrangement = Arrangement.INSTANCE;
                                                        Arrangement.Vertical top = arrangement.getTop();
                                                        Alignment.Companion companion4 = Alignment.INSTANCE;
                                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top, companion4.getStart(), composer5, 0);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                        CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierThen2);
                                                        if (composer5.getApplier() == null) {
                                                            Composables.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor3);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer5);
                                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                        }
                                                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        final Column5 column62 = Column6.INSTANCE;
                                                        composer5.startReplaceableGroup(-726986128);
                                                        if (function217 != null) {
                                                            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[0], ComposableLambda3.composableLambda(composer5, 2105251099, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.CustomDialogKt$CustomDialog$1$1$1$1$1$1$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                    invoke(composer6, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(Composer composer6, int i13) {
                                                                    if ((i13 & 11) != 2 || !composer6.getSkipping()) {
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(2105251099, i13, -1, "com.truelayer.payments.ui.components.CustomDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CustomDialog.kt:85)");
                                                                        }
                                                                        TextStyle titleLarge = MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getTitleLarge();
                                                                        final Column5 column5 = column62;
                                                                        final Function2<? super Composer, ? super Integer, Unit> function220 = function217;
                                                                        TextKt.ProvideTextStyle(titleLarge, ComposableLambda3.composableLambda(composer6, -583407670, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.CustomDialogKt$CustomDialog$1$1$1$1$1$1$1$1.1
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            /* JADX WARN: Multi-variable type inference failed */
                                                                            {
                                                                                super(2);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                                                invoke(composer7, num.intValue());
                                                                                return Unit.INSTANCE;
                                                                            }

                                                                            public final void invoke(Composer composer7, int i14) {
                                                                                if ((i14 & 11) == 2 && composer7.getSkipping()) {
                                                                                    composer7.skipToGroupEnd();
                                                                                    return;
                                                                                }
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(-583407670, i14, -1, "com.truelayer.payments.ui.components.CustomDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CustomDialog.kt:86)");
                                                                                }
                                                                                Column5 column52 = column5;
                                                                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                                                Alignment.Companion companion6 = Alignment.INSTANCE;
                                                                                Modifier modifierAlign = column52.align(modifierFillMaxWidth$default2, companion6.getCenterHorizontally());
                                                                                Alignment center2 = companion6.getCenter();
                                                                                Function2<Composer, Integer, Unit> function221 = function220;
                                                                                composer7.startReplaceableGroup(733328855);
                                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer7, 6);
                                                                                composer7.startReplaceableGroup(-1323940314);
                                                                                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer7, 0);
                                                                                CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                                                                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                                                                Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierAlign);
                                                                                if (composer7.getApplier() == null) {
                                                                                    Composables.invalidApplier();
                                                                                }
                                                                                composer7.startReusableNode();
                                                                                if (composer7.getInserting()) {
                                                                                    composer7.createNode(constructor4);
                                                                                } else {
                                                                                    composer7.useNode();
                                                                                }
                                                                                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer7);
                                                                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                                                                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                                                                                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                                                }
                                                                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer7)), composer7, 0);
                                                                                composer7.startReplaceableGroup(2058660585);
                                                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                                function221.invoke(composer7, 0);
                                                                                composer7.endReplaceableGroup();
                                                                                composer7.endNode();
                                                                                composer7.endReplaceableGroup();
                                                                                composer7.endReplaceableGroup();
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                            }
                                                                        }), composer6, 48);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    composer6.skipToGroupEnd();
                                                                }
                                                            }), composer5, 56);
                                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, Spacing.INSTANCE.m27177getREGULARD9Ej5fM()), composer5, 6);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        Modifier.Companion companion6 = Modifier.INSTANCE;
                                                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(column62.weight(companion6, 1.0f, false), 0.0f, 1, null);
                                                        composer5.startReplaceableGroup(-726985060);
                                                        if (customDialogProperties9.getMakeContentScrollable()) {
                                                            modifierFillMaxWidth$default2 = ScrollKt.verticalScroll$default(modifierFillMaxWidth$default2, ScrollKt.rememberScrollState(0, composer5, 0, 1), false, null, false, 14, null);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        composer5.startReplaceableGroup(-483455358);
                                                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer5, 0);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                        CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                                        Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                                                        if (composer5.getApplier() == null) {
                                                            Composables.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor4);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer5);
                                                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                        }
                                                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        function219.invoke(composer5, 0);
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.startReplaceableGroup(839427519);
                                                        if (function218 != null) {
                                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, Spacing.INSTANCE.m27174getLARGED9Ej5fM()), composer5, 6);
                                                            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                                                            composer5.startReplaceableGroup(-483455358);
                                                            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer5, 0);
                                                            composer5.startReplaceableGroup(-1323940314);
                                                            int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                            CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                                                            Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default3);
                                                            if (composer5.getApplier() == null) {
                                                                Composables.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor5);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer5);
                                                            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy4, companion5.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                            }
                                                            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer5)), composer5, 0);
                                                            composer5.startReplaceableGroup(2058660585);
                                                            function218.invoke(composer5, 0);
                                                            composer5.endReplaceableGroup();
                                                            composer5.endNode();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }), composer4, 24576, 15);
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 3072, 3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, ((i5 >> 6) & 14) | 432, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        customDialogProperties4 = customDialogProperties62;
                        function27 = function292;
                        function28 = function2102;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        customDialogProperties4 = customDialogProperties2;
                        composer2 = composerStartRestartGroup;
                        function27 = function23;
                        function28 = function24;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.CustomDialogKt.CustomDialog.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i10) {
                                CustomDialog.CustomDialog(modifier3, customDialogProperties4, onDismissRequest, function27, function28, content, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i6;
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if ((i2 & 2) == 0) {
                        }
                        function25 = null;
                        if (i9 != 0) {
                        }
                        if (i4 == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function24 = function22;
            if ((i2 & 32) == 0) {
            }
            i3 |= i6;
            if ((374491 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function23 = function2;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function24 = function22;
        if ((i2 & 32) == 0) {
        }
        i3 |= i6;
        if ((374491 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
