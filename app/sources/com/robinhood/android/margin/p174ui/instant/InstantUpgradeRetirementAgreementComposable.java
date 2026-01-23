package com.robinhood.android.margin.p174ui.instant;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldDefaults;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.instant.C18943R;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeRetirementAgreementComposable;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeRetirementAgreementDuxo2;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.compose.extensions.WindowInsetsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InstantUpgradeRetirementAgreementComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u008e\u0002"}, m3636d2 = {"InstantUpgradeRetirementAgreementComposable", "", "state", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementState;", "onAccept", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "", "(Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-margin_externalDebug", "hasScrolledToBottom", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class InstantUpgradeRetirementAgreementComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstantUpgradeRetirementAgreementComposable$lambda$0(InstantUpgradeRetirementAgreementDuxo2 instantUpgradeRetirementAgreementDuxo2, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        InstantUpgradeRetirementAgreementComposable(instantUpgradeRetirementAgreementDuxo2, function0, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InstantUpgradeRetirementAgreementComposable(final InstantUpgradeRetirementAgreementDuxo2 state, final Function0<Unit> onAccept, final Function1<? super Throwable, Unit> onError, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAccept, "onAccept");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-161513089);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onAccept) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onError) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-161513089, i2, -1, "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementComposable (InstantUpgradeRetirementAgreementComposable.kt:33)");
            }
            if (!(state instanceof InstantUpgradeRetirementAgreementDuxo2.Loading)) {
                if (state instanceof InstantUpgradeRetirementAgreementDuxo2.ShowInstantAgreement) {
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(764857579, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementComposableKt.InstantUpgradeRetirementAgreementComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i3) {
                            if ((i3 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(764857579, i3, -1, "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementComposable.<anonymous> (InstantUpgradeRetirementAgreementComposable.kt:37)");
                            }
                            final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            WindowInsets windowInsetsExcludeTop = WindowInsetsKt.excludeTop(ScaffoldDefaults.INSTANCE.getContentWindowInsets(composer2, ScaffoldDefaults.$stable));
                            final InstantUpgradeRetirementAgreementDuxo2 instantUpgradeRetirementAgreementDuxo2 = state;
                            final Function0<Unit> function0 = onAccept;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, null, null, null, null, 0, 0L, 0L, windowInsetsExcludeTop, ComposableLambda3.rememberComposableLambda(-604654854, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementComposableKt.InstantUpgradeRetirementAgreementComposable.1.1

                                /* compiled from: InstantUpgradeRetirementAgreementComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementComposableKt$InstantUpgradeRetirementAgreementComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C502651 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ Context $context;
                                    final /* synthetic */ Function0<Unit> $onAccept;
                                    final /* synthetic */ PaddingValues $paddingValues;
                                    final /* synthetic */ InstantUpgradeRetirementAgreementDuxo2 $state;

                                    C502651(PaddingValues paddingValues, InstantUpgradeRetirementAgreementDuxo2 instantUpgradeRetirementAgreementDuxo2, Function0<Unit> function0, Context context) {
                                        this.$paddingValues = paddingValues;
                                        this.$state = instantUpgradeRetirementAgreementDuxo2;
                                        this.$onAccept = function0;
                                        this.$context = context;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final void invoke$lambda$9$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
                                        snapshotState.setValue(Boolean.valueOf(z));
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$9$lambda$4$lambda$3(final InstantUpgradeRetirementAgreementDuxo2 instantUpgradeRetirementAgreementDuxo2, LazyListScope LazyColumn) {
                                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1637728262, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementComposableKt$InstantUpgradeRetirementAgreementComposable$1$1$1$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                invoke(lazyItemScope, composer, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(LazyItemScope item, Composer composer, int i) {
                                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                                if ((i & 17) == 16 && composer.getSkipping()) {
                                                    composer.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1637728262, i, -1, "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstantUpgradeRetirementAgreementComposable.kt:57)");
                                                }
                                                InstantRetirementAgreementComponents.RetirementAgreement(((InstantUpgradeRetirementAgreementDuxo2.ShowInstantAgreement) instantUpgradeRetirementAgreementDuxo2).getViewModel(), null, composer, 0, 2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 3, null);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$9$lambda$6$lambda$5(Function0 function0, SnapshotState snapshotState) {
                                        if (!invoke$lambda$9$lambda$1(snapshotState)) {
                                            invoke$lambda$9$lambda$2(snapshotState, true);
                                        } else {
                                            function0.invoke();
                                        }
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final boolean invoke$lambda$9$lambda$1(SnapshotState<Boolean> snapshotState) {
                                        return snapshotState.getValue().booleanValue();
                                    }

                                    public final void invoke(Composer composer, int i) {
                                        SnapshotState snapshotState;
                                        Continuation continuation;
                                        if ((i & 3) == 2 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-468317585, i, -1, "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementComposable.<anonymous>.<anonymous>.<anonymous> (InstantUpgradeRetirementAgreementComposable.kt:43)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), this.$paddingValues), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                        final InstantUpgradeRetirementAgreementDuxo2 instantUpgradeRetirementAgreementDuxo2 = this.$state;
                                        final Function0<Unit> function0 = this.$onAccept;
                                        Context context = this.$context;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        if (composer.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer.startReusableNode();
                                        if (composer.getInserting()) {
                                            composer.createNode(constructor);
                                        } else {
                                            composer.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue = composer.rememberedValue();
                                        Composer.Companion companion3 = Composer.INSTANCE;
                                        if (objRememberedValue == companion3.getEmpty()) {
                                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                                        composer.endReplaceGroup();
                                        LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3);
                                        Modifier modifierWeight$default = Column5.weight$default(column6, companion, 1.0f, false, 2, null);
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged = composer.changed(instantUpgradeRetirementAgreementDuxo2);
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementComposableKt$InstantUpgradeRetirementAgreementComposable$1$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return InstantUpgradeRetirementAgreementComposable.C210461.AnonymousClass1.C502651.invoke$lambda$9$lambda$4$lambda$3(instantUpgradeRetirementAgreementDuxo2, (LazyListScope) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        LazyDslKt.LazyColumn(modifierWeight$default, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer, 0, 508);
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChanged2 = composer.changed(function0);
                                        Object objRememberedValue3 = composer.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == companion3.getEmpty()) {
                                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementComposableKt$InstantUpgradeRetirementAgreementComposable$1$1$1$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return InstantUpgradeRetirementAgreementComposable.C210461.AnonymousClass1.C502651.invoke$lambda$9$lambda$6$lambda$5(function0, snapshotState2);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue3);
                                        }
                                        Function0 function02 = (Function0) objRememberedValue3;
                                        composer.endReplaceGroup();
                                        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function02, context.getString(invoke$lambda$9$lambda$1(snapshotState2) ? C18943R.string.retirement_agreement_agree : C11048R.string.general_action_review), false, null, false, null, null, false, null, false, composer, 0, 0, 65343);
                                        Boolean boolValueOf = Boolean.valueOf(invoke$lambda$9$lambda$1(snapshotState2));
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChanged3 = composer.changed(lazyListStateRememberLazyListState);
                                        Object objRememberedValue4 = composer.rememberedValue();
                                        if (zChanged3 || objRememberedValue4 == companion3.getEmpty()) {
                                            snapshotState = snapshotState2;
                                            continuation = null;
                                            objRememberedValue4 = new InstantUpgradeRetirementAgreementComposable3(lazyListStateRememberLazyListState, snapshotState, null);
                                            composer.updateRememberedValue(objRememberedValue4);
                                        } else {
                                            snapshotState = snapshotState2;
                                            continuation = null;
                                        }
                                        composer.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer, 0);
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChanged4 = composer.changed(lazyListStateRememberLazyListState);
                                        Object objRememberedValue5 = composer.rememberedValue();
                                        if (zChanged4 || objRememberedValue5 == companion3.getEmpty()) {
                                            objRememberedValue5 = new InstantUpgradeRetirementAgreementComposable4(lazyListStateRememberLazyListState, snapshotState, continuation);
                                            composer.updateRememberedValue(objRememberedValue5);
                                        }
                                        composer.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer, 0);
                                        composer.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                    invoke(paddingValues, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer3, int i4) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i4 & 6) == 0) {
                                        i4 |= composer3.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i4 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-604654854, i4, -1, "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementComposable.<anonymous>.<anonymous> (InstantUpgradeRetirementAgreementComposable.kt:42)");
                                    }
                                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, null, null, null, 63, null), ComposableLambda3.rememberComposableLambda(-468317585, true, new C502651(paddingValues, instantUpgradeRetirementAgreementDuxo2, function0, context), composer3, 54), composer3, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 805306374, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                } else {
                    if (!(state instanceof InstantUpgradeRetirementAgreementDuxo2.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    onError.invoke(((InstantUpgradeRetirementAgreementDuxo2.Error) state).getThrowable());
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstantUpgradeRetirementAgreementComposable.InstantUpgradeRetirementAgreementComposable$lambda$0(state, onAccept, onError, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
