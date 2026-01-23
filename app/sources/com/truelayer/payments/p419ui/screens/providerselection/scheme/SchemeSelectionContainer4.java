package com.truelayer.payments.p419ui.screens.providerselection.scheme;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AccessTime;
import androidx.compose.material.icons.filled.Bolt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.vector.ImageVector;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.BackHandler;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.core.domain.experience.scheme.Scheme;
import com.truelayer.payments.core.domain.experience.scheme.SchemeIcon;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.BackButton;
import com.truelayer.payments.p419ui.components.ResponsiveContainer;
import com.truelayer.payments.p419ui.components.ScreenTitle;
import com.truelayer.payments.p419ui.components.toolbars.AccessibleTopAppBar2;
import com.truelayer.payments.p419ui.theme.Breakpoints;
import com.truelayer.payments.p419ui.theme.Color8;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.truelayer.payments.p419ui.theme.Theme5;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SchemeSelectionContainer.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\t\u001af\u0010\n\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\b2#\b\u0002\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0018\u001a\u001b\u0010\u0019\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003¢\u0006\u0002\u0010\u001a\u001a\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u001a\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001d\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010$¨\u0006%²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002"}, m3636d2 = {"Scheme", "", "it", "Lcom/truelayer/payments/core/domain/experience/scheme/Scheme;", "isEnabled", "", "isSelected", "onClick", "Lkotlin/Function0;", "(Lcom/truelayer/payments/core/domain/experience/scheme/Scheme;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SchemeSelectionContainer", "subtitle", "", "schemes", "", "autoSelectSchemeId", "onBack", "onContinue", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "selectedSchemeId", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SchemeSelectionContainerPreview", "(Landroidx/compose/runtime/Composer;I)V", "SchemeSelectionContinueButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "previewSchemes", "schemeCardAlpha", "", "schemeCardBackground", "Landroidx/compose/ui/graphics/Color;", "isDarkTheme", "(ZZ)J", "schemeCardBorder", "Landroidx/compose/foundation/BorderStroke;", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SchemeSelectionContainer4 {
    public static final float schemeCardAlpha(boolean z, boolean z2) {
        if (z) {
            return 1.0f;
        }
        return z2 ? 0.5f : 0.2f;
    }

    public static final void SchemeSelectionContainer(final String str, final List<Scheme> schemes, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(schemes, "schemes");
        Composer composerStartRestartGroup = composer.startRestartGroup(-121080245);
        String str3 = (i2 & 4) != 0 ? null : str2;
        final Function0<Unit> function02 = (i2 & 8) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt.SchemeSelectionContainer.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        final Function1<? super String, Unit> function12 = (i2 & 16) != 0 ? new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt.SchemeSelectionContainer.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                invoke2(str4);
                return Unit.INSTANCE;
            }
        } : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-121080245, i, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainer (SchemeSelectionContainer.kt:69)");
        }
        composerStartRestartGroup.startReplaceableGroup(1632974732);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(str3, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1632974808);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new SnackbarHostState();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final SnackbarHostState snackbarHostState = (SnackbarHostState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(773894976);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup));
            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue3 = compositionScopedCoroutineScopeCanceller;
        }
        composerStartRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1632974899);
        boolean z = (((i & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(function02)) || (i & 3072) == 2048;
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt$SchemeSelectionContainer$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    function02.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        BackHandler.BackHandler(false, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 1);
        final Function1<? super String, Unit> function13 = function12;
        ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.composableLambda(composerStartRestartGroup, 609488135, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt.SchemeSelectionContainer.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(609488135, i3, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainer.<anonymous> (SchemeSelectionContainer.kt:79)");
                }
                final Function0<Unit> function03 = function02;
                AccessibleTopAppBar2.AccessibleTopAppBar(null, null, ComposableLambda3.composableLambda(composer2, -615728989, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt.SchemeSelectionContainer.4.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i4) {
                        if ((i4 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-615728989, i4, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainer.<anonymous>.<anonymous> (SchemeSelectionContainer.kt:79)");
                        }
                        BackButton.BackButton(null, null, function03, composer3, 0, 3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), null, composer2, 384, 11);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), null, ComposableLambda3.composableLambda(composerStartRestartGroup, 2133250757, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt.SchemeSelectionContainer.5
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2133250757, i3, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainer.<anonymous> (SchemeSelectionContainer.kt:80)");
                }
                SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer2, 6, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), null, 0, 0L, 0L, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -2077659172, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt.SchemeSelectionContainer.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                invoke(paddingValues, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PaddingValues padding, Composer composer2, int i3) {
                int i4;
                Function1<String, Unit> function14;
                Modifier.Companion companion2;
                CoroutineScope coroutineScope2;
                SnapshotState<String> snapshotState2;
                SnackbarHostState snackbarHostState2;
                List<Scheme> list;
                Composer composer3 = composer2;
                Intrinsics.checkNotNullParameter(padding, "padding");
                if ((i3 & 14) == 0) {
                    i4 = i3 | (composer3.changed(padding) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i4 & 91) == 18 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2077659172, i4, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainer.<anonymous> (SchemeSelectionContainer.kt:82)");
                }
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), padding);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                String str4 = str;
                List<Scheme> list2 = schemes;
                SnapshotState<String> snapshotState3 = snapshotState;
                CoroutineScope coroutineScope3 = coroutineScope;
                SnackbarHostState snackbarHostState3 = snackbarHostState;
                Function1<String, Unit> function15 = function12;
                composer3.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                composer3.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                Column6 column6 = Column6.INSTANCE;
                ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                Spacing spacing = Spacing.INSTANCE;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxSize$default, spacing.m27177getREGULARD9Ej5fM(), 0.0f, 2, null), 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Horizontal centerHorizontally2 = companion4.getCenterHorizontally();
                composer3.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top, centerHorizontally2, composer3, 54);
                composer3.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
                if (composer3.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                ScreenTitle.ScreenTitle(StringResources_androidKt.stringResource(C42830R.string.scheme_screen_title, composer3, 0), null, composer3, 0, 2);
                composer3.startReplaceableGroup(-742121021);
                if (str4 == null) {
                    function14 = function15;
                    companion2 = companion3;
                    list = list2;
                    snapshotState2 = snapshotState3;
                    coroutineScope2 = coroutineScope3;
                    snackbarHostState2 = snackbarHostState3;
                } else {
                    function14 = function15;
                    companion2 = companion3;
                    coroutineScope2 = coroutineScope3;
                    snapshotState2 = snapshotState3;
                    snackbarHostState2 = snackbarHostState3;
                    list = list2;
                    TextKt.m6028Text4IGK_g(str4, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, spacing.m27178getSMALLD9Ej5fM(), 0.0f, 0.0f, 13, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7655copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyLarge(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 48, 0, 65532);
                    composer3 = composer2;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, spacing.m27174getLARGED9Ej5fM()), composer3, 6);
                }
                composer3.endReplaceableGroup();
                final List<Scheme> list3 = list;
                final SnapshotState<String> snapshotState4 = snapshotState2;
                final CoroutineScope coroutineScope4 = coroutineScope2;
                final SnackbarHostState snackbarHostState4 = snackbarHostState2;
                ResponsiveContainer.ResponsiveContainer(null, null, ResponsiveContainer.confirmationBodyBreakpoints(companion2), ComposableLambda3.composableLambda(composer3, 413764254, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt$SchemeSelectionContainer$6$1$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer4, Integer num) {
                        invoke(modifier, composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Modifier it, Composer composer4, int i5) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        int i6 = (i5 & 14) == 0 ? i5 | (composer4.changed(it) ? 4 : 2) : i5;
                        if ((i6 & 91) != 18 || !composer4.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(413764254, i6, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchemeSelectionContainer.kt:112)");
                            }
                            List<Scheme> list4 = list3;
                            final SnapshotState<String> snapshotState5 = snapshotState4;
                            final CoroutineScope coroutineScope5 = coroutineScope4;
                            final SnackbarHostState snackbarHostState5 = snackbarHostState4;
                            composer4.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                            composer4.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(it);
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor3);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer4)), composer4, 0);
                            composer4.startReplaceableGroup(2058660585);
                            Column6 column62 = Column6.INSTANCE;
                            composer4.startReplaceableGroup(694820296);
                            for (final Scheme scheme : list4) {
                                final boolean zAreEqual = Intrinsics.areEqual(scheme.getEnabled(), Boolean.TRUE);
                                boolean zAreEqual2 = Intrinsics.areEqual(scheme.getId(), SchemeSelectionContainer4.SchemeSelectionContainer$lambda$1(snapshotState5));
                                final String strStringResource = StringResources_androidKt.stringResource(C42830R.string.scheme_selection_option_not_available, composer4, 0);
                                SchemeSelectionContainer4.Scheme(scheme, zAreEqual, zAreEqual2, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt$SchemeSelectionContainer$6$1$1$2$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (!zAreEqual) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(snackbarHostState5, strStringResource, null), 3, null);
                                        } else {
                                            snapshotState5.setValue(scheme.getId());
                                        }
                                    }

                                    /* compiled from: SchemeSelectionContainer.kt */
                                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt$SchemeSelectionContainer$6$1$1$2$1$1$1$1", m3645f = "SchemeSelectionContainer.kt", m3646l = {125}, m3647m = "invokeSuspend")
                                    /* renamed from: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt$SchemeSelectionContainer$6$1$1$2$1$1$1$1, reason: invalid class name */
                                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ SnackbarHostState $snackBarHostState;
                                        final /* synthetic */ String $snackbarMessage;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(SnackbarHostState snackbarHostState, String str, Continuation<? super AnonymousClass1> continuation) {
                                            super(2, continuation);
                                            this.$snackBarHostState = snackbarHostState;
                                            this.$snackbarMessage = str;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new AnonymousClass1(this.$snackBarHostState, this.$snackbarMessage, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                SnackbarData currentSnackbarData = this.$snackBarHostState.getCurrentSnackbarData();
                                                if (currentSnackbarData != null) {
                                                    currentSnackbarData.dismiss();
                                                }
                                                SnackbarHostState snackbarHostState = this.$snackBarHostState;
                                                String str = this.$snackbarMessage;
                                                this.label = 1;
                                                if (SnackbarHostState.showSnackbar$default(snackbarHostState, str, null, true, null, this, 10, null) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer4, 8);
                            }
                            composer4.endReplaceableGroup();
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
                final String strStringResource = StringResources_androidKt.stringResource(C42830R.string.scheme_selection_select_option_first, composer3, 0);
                final Function1<String, Unit> function16 = function14;
                SchemeSelectionContainer4.SchemeSelectionContinueButton(new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt$SchemeSelectionContainer$6$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* compiled from: SchemeSelectionContainer.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt$SchemeSelectionContainer$6$1$2$2", m3645f = "SchemeSelectionContainer.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "invokeSuspend")
                    /* renamed from: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt$SchemeSelectionContainer$6$1$2$2 */
                    static final class C432302 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ SnackbarHostState $snackBarHostState;
                        final /* synthetic */ String $snackBarMessage;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C432302(SnackbarHostState snackbarHostState, String str, Continuation<? super C432302> continuation) {
                            super(2, continuation);
                            this.$snackBarHostState = snackbarHostState;
                            this.$snackBarMessage = str;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C432302(this.$snackBarHostState, this.$snackBarMessage, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C432302) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                SnackbarData currentSnackbarData = this.$snackBarHostState.getCurrentSnackbarData();
                                if (currentSnackbarData != null) {
                                    currentSnackbarData.dismiss();
                                }
                                SnackbarHostState snackbarHostState = this.$snackBarHostState;
                                String str = this.$snackBarMessage;
                                this.label = 1;
                                if (SnackbarHostState.showSnackbar$default(snackbarHostState, str, null, true, null, this, 10, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        String strSchemeSelectionContainer$lambda$1 = SchemeSelectionContainer4.SchemeSelectionContainer$lambda$1(snapshotState4);
                        if (strSchemeSelectionContainer$lambda$1 != null) {
                            function16.invoke(strSchemeSelectionContainer$lambda$1);
                        } else {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C432302(snackbarHostState4, strStringResource, null), 3, null);
                        }
                    }
                }, composer3, 0);
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 805309488, 501);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final String str4 = str3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt.SchemeSelectionContainer.7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    SchemeSelectionContainer4.SchemeSelectionContainer(str, schemes, str4, function02, function13, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SchemeSelectionContinueButton(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1957841562);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1957841562, i2, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContinueButton (SchemeSelectionContainer.kt:152)");
            }
            SurfaceKt.m5967SurfaceT9BRK9s(SizeKt.m5155defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(113), 0.0f, 2, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1440577045, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt.SchemeSelectionContinueButton.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1440577045, i3, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContinueButton.<anonymous> (SchemeSelectionContainer.kt:156)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, Spacing.INSTANCE.m27177getREGULARD9Ej5fM(), 0.0f, 2, null);
                        Breakpoints breakpointsConfirmationBodyBreakpoints = ResponsiveContainer.confirmationBodyBreakpoints(companion);
                        final Function0<Unit> function02 = function0;
                        ResponsiveContainer.ResponsiveContainer(modifierM5144paddingVpY3zN4$default, null, breakpointsConfirmationBodyBreakpoints, ComposableLambda3.composableLambda(composer2, -1950429119, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt.SchemeSelectionContinueButton.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer3, Integer num) {
                                invoke(modifier, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Modifier modifier, Composer composer3, int i4) {
                                int i5;
                                Intrinsics.checkNotNullParameter(modifier, "modifier");
                                if ((i4 & 14) == 0) {
                                    i5 = i4 | (composer3.changed(modifier) ? 4 : 2);
                                } else {
                                    i5 = i4;
                                }
                                if ((i5 & 91) != 18 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1950429119, i5, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContinueButton.<anonymous>.<anonymous> (SchemeSelectionContainer.kt:161)");
                                    }
                                    ButtonKt.Button(function02, modifier, false, null, null, null, null, null, null, SchemeSelectionContainer.INSTANCE.m27126getLambda1$payments_ui_release(), composer3, ((i5 << 3) & 112) | 805306368, 508);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 3078, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 12582918, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt.SchemeSelectionContinueButton.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    SchemeSelectionContainer4.SchemeSelectionContinueButton(function0, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final long schemeCardBackground(boolean z, boolean z2) {
        if (z && !z2) {
            return Color8.INSTANCE.m27169getCharcoal50d7_KjU();
        }
        if (z) {
            return Color2.Color(4282466630L);
        }
        if (z2) {
            return Color8.INSTANCE.m27167getCharcoal1000d7_KjU();
        }
        return Color.INSTANCE.m6727getWhite0d7_KjU();
    }

    public static final BorderStroke schemeCardBorder(boolean z, boolean z2, Composer composer, int i) {
        BorderStroke borderStrokeM4886BorderStrokecXLIe8U;
        composer.startReplaceableGroup(-1865471491);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1865471491, i, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.schemeCardBorder (SchemeSelectionContainer.kt:190)");
        }
        if (z) {
            borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(2), Color8.INSTANCE.m27171getDeepAzure300d7_KjU());
        } else if (!z2) {
            borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(2), Color.m6705copywmQWz5c$default(Color8.INSTANCE.m27168getCharcoal300d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
        } else {
            borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(2), Color8.INSTANCE.m27168getCharcoal300d7_KjU());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStrokeM4886BorderStrokecXLIe8U;
    }

    public static final void Scheme(final Scheme it, final boolean z, final boolean z2, final Function0<Unit> onClick, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(965449482);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(965449482, i, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.Scheme (SchemeSelectionContainer.kt:202)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        CardKt.OutlinedCard(onClick, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12)), CardDefaults.INSTANCE.m5732outlinedCardColorsro_MJ88(Color.m6705copywmQWz5c$default(schemeCardBackground(z2, DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), schemeCardAlpha(z2, z), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14), null, schemeCardBorder(z2, z, composerStartRestartGroup, ((i >> 6) & 14) | (i & 112)), null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1871518157, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt.Scheme.1

            /* compiled from: SchemeSelectionContainer.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            /* renamed from: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt$Scheme$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SchemeIcon.values().length];
                    try {
                        iArr[SchemeIcon.Bolt.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SchemeIcon.Clock.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SchemeIcon.Undefined.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                invoke(column5, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Column5 OutlinedCard, Composer composer2, int i2) {
                ImageVector bolt;
                Intrinsics.checkNotNullParameter(OutlinedCard, "$this$OutlinedCard");
                if ((i2 & 81) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1871518157, i2, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.Scheme.<anonymous> (SchemeSelectionContainer.kt:213)");
                }
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Spacing spacing = Spacing.INSTANCE;
                Modifier modifierAlpha = Alpha.alpha(PaddingKt.m5142padding3ABfNKs(companion2, spacing.m27177getREGULARD9Ej5fM()), z ? 1.0f : 0.5f);
                Scheme scheme = it;
                composer2.startReplaceableGroup(693286680);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Horizontal start = arrangement.getStart();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion3.getTop(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlpha);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                Row6 row6 = Row6.INSTANCE;
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                Column6 column6 = Column6.INSTANCE;
                int i3 = WhenMappings.$EnumSwitchMapping$0[scheme.getIcon().ordinal()];
                if (i3 == 1) {
                    bolt = Bolt.getBolt(Icons.Filled.INSTANCE);
                } else {
                    if (i3 != 2 && i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bolt = AccessTime.getAccessTime(Icons.Filled.INSTANCE);
                }
                Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion2, C2002Dp.m7995constructorimpl(24));
                ColorFilter.Companion companion5 = ColorFilter.INSTANCE;
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i4 = MaterialTheme.$stable;
                ImageKt.Image(bolt, (String) null, modifierM5169size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(companion5, materialTheme.getColorScheme(composer2, i4).getPrimary(), 0, 2, null), composer2, 432, 56);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, spacing.m27175getMEDIUMD9Ej5fM()), composer2, 6);
                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(center, companion3.getStart(), composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion2);
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                TextKt.m6028Text4IGK_g(scheme.getTitle(), null, materialTheme.getColorScheme(composer2, i4).getOnSecondaryContainer(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getTitleMedium(), composer2, 0, 0, 65530);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, spacing.m27178getSMALLD9Ej5fM()), composer2, 6);
                TextKt.m6028Text4IGK_g(scheme.getDescription(), null, materialTheme.getColorScheme(composer2, i4).getOnSecondaryContainer(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getBodyMedium(), composer2, 0, 0, 65530);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, ((i >> 9) & 14) | 100663344, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, Spacing.INSTANCE.m27178getSMALLD9Ej5fM()), composerStartRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt.Scheme.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    SchemeSelectionContainer4.Scheme(it, z, z2, onClick, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final List<Scheme> previewSchemes() {
        SchemeIcon schemeIcon = SchemeIcon.Bolt;
        Boolean bool = Boolean.TRUE;
        return CollectionsKt.listOf((Object[]) new Scheme[]{new Scheme("01", "Instantly", "Money is transferred straight away but your bank may charge a fee", "GBP", schemeIcon, bool), new Scheme("02", "1 - 2 business days", "This takes a little longer however almost all banks have no fee", "GBP", SchemeIcon.Clock, bool), new Scheme("03", "Disabled", "A long description in here to check how the long text will look like. Lets hope this will not cause any problems on small devices.", "GBP", SchemeIcon.Undefined, Boolean.FALSE)});
    }

    public static final void SchemeSelectionContainerPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-782413376);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782413376, i, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerPreview (SchemeSelectionContainer.kt:280)");
            }
            Theme5.Theme(null, false, null, SchemeSelectionContainer.INSTANCE.m27127getLambda2$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.SchemeSelectionContainerKt.SchemeSelectionContainerPreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    SchemeSelectionContainer4.SchemeSelectionContainerPreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SchemeSelectionContainer$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }
}
