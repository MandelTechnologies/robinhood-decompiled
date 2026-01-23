package com.truelayer.payments.p419ui.components.inputs.form;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.input.KeyboardCapitalization;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.components.inputs.TextInputKt;
import com.truelayer.payments.p419ui.components.inputs.TextInputWithImageKt;
import com.truelayer.payments.p419ui.components.inputs.form.models.Field;
import com.truelayer.payments.p419ui.components.inputs.form.models.FieldState;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields5;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields6;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.truelayer.payments.p419ui.utils.FieldIds;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Form.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Form", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/truelayer/payments/ui/components/inputs/form/FormViewModel;", "boxWithConstraintsScope", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "(Landroidx/compose/ui/Modifier;Lcom/truelayer/payments/ui/components/inputs/form/FormViewModel;Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.inputs.form.FormKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Form2 {
    public static final void Form(Modifier modifier, final FormViewModel viewModel, BoxWithConstraints4 boxWithConstraints4, Composer composer, final int i, final int i2) {
        int i3;
        final BoxWithConstraints4 boxWithConstraints42;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(518626312);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(viewModel) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(boxWithConstraints4) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            boxWithConstraints42 = boxWithConstraints4;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            boxWithConstraints42 = i5 != 0 ? null : boxWithConstraints4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(518626312, i3, -1, "com.truelayer.payments.ui.components.inputs.form.Form (Form.kt:34)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Column6 column6 = Column6.INSTANCE;
            FocusActionManager.FocusActionManager(viewModel.getFields(), null, ComposableLambda3.composableLambda(composerStartRestartGroup, -453629489, true, new Function4<FocusActionManagerScope, Field, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.form.FormKt$Form$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(FocusActionManagerScope focusActionManagerScope, Field field, Composer composer2, Integer num) {
                    invoke(focusActionManagerScope, field, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final FocusActionManagerScope FocusActionManager, final Field field, Composer composer2, int i6) {
                    Composer composer3 = composer2;
                    Intrinsics.checkNotNullParameter(FocusActionManager, "$this$FocusActionManager");
                    Intrinsics.checkNotNullParameter(field, "field");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-453629489, i6, -1, "com.truelayer.payments.ui.components.inputs.form.Form.<anonymous>.<anonymous> (Form.kt:41)");
                    }
                    composer3.startReplaceableGroup(-773767027);
                    if (field.getHeader() != null) {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, Spacing.INSTANCE.m27175getMEDIUMD9Ej5fM()), composer3, 6);
                        field.getHeader().invoke(composer3, 0);
                    }
                    composer3.endReplaceableGroup();
                    if (field instanceof Fields6) {
                        composer3.startReplaceableGroup(-773766812);
                        Modifier focusModifier = FocusActionManager.getFocusModifier();
                        Fields6 fields6 = (Fields6) field;
                        composer3.startReplaceableGroup(-773766680);
                        boolean zChanged = ((((i6 & 14) ^ 6) > 4 && composer3.changed(FocusActionManager)) || (i6 & 6) == 4) | composer3.changed(viewModel);
                        final FormViewModel formViewModel = viewModel;
                        Object objRememberedValue = composer3.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<FieldState, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.form.FormKt$Form$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(FieldState fieldState) {
                                    invoke2(fieldState);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(FieldState state) {
                                    Intrinsics.checkNotNullParameter(state, "state");
                                    formViewModel.onChange(FocusActionManager.getIndex(), state);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceableGroup();
                        TextInputWithImageKt.m27059TextInputWithImagevdpxvcM(focusModifier, null, null, fields6, (Function1) objRememberedValue, FocusActionManager.intoKeyboardActions(FocusActionManager.getActions()), FocusActionManager.m27064getImeeUduSuo(), boxWithConstraints42, composer3, 4096, 6);
                        composer3.endReplaceableGroup();
                    } else {
                        boolean z = true;
                        if (field instanceof Fields5) {
                            composer3.startReplaceableGroup(-773766365);
                            Modifier focusModifier2 = FocusActionManager.getFocusModifier();
                            KeyboardActions keyboardActionsIntoKeyboardActions = FocusActionManager.intoKeyboardActions(FocusActionManager.getActions());
                            int iM27064getImeeUduSuo = FocusActionManager.m27064getImeeUduSuo();
                            int iM7766getCharactersIUNYP9k = Intrinsics.areEqual(field.getId(), FieldIds.IBAN) ? KeyboardCapitalization.INSTANCE.m7766getCharactersIUNYP9k() : KeyboardCapitalization.INSTANCE.m7767getNoneIUNYP9k();
                            Fields5 fields5 = (Fields5) field;
                            composer3.startReplaceableGroup(-773766284);
                            boolean zChanged2 = composer3.changed(viewModel);
                            if ((((i6 & 14) ^ 6) <= 4 || !composer3.changed(FocusActionManager)) && (i6 & 6) != 4) {
                                z = false;
                            }
                            boolean z2 = z | zChanged2;
                            final FormViewModel formViewModel2 = viewModel;
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<FieldState, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.form.FormKt$Form$1$1$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(FieldState fieldState) {
                                        invoke2(fieldState);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(FieldState state) {
                                        Intrinsics.checkNotNullParameter(state, "state");
                                        formViewModel2.onChange(FocusActionManager.getIndex(), state);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceableGroup();
                            TextInputKt.m27056TextInput9ApJK6A(focusModifier2, fields5, (Function1) objRememberedValue2, keyboardActionsIntoKeyboardActions, iM7766getCharactersIUNYP9k, iM27064getImeeUduSuo, boxWithConstraints42, composer2, 64, 0);
                            composer3 = composer2;
                            composer3.endReplaceableGroup();
                        } else if (field instanceof Fields4) {
                            composer3.startReplaceableGroup(-773765747);
                            EffectsKt.SideEffect(new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.inputs.form.FormKt$Form$1$1.3
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
                                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.WTF(null, "Select field should not be presented on the Form along side other fields. Filed id = " + field.getId() + PlaceholderUtils.XXShortPlaceholderText, null, null, null, null, 61, null));
                                }
                            }, composer3, 0);
                            composer3.endReplaceableGroup();
                        } else {
                            composer3.startReplaceableGroup(-773765383);
                            composer3.endReplaceableGroup();
                        }
                    }
                    if (field.getFooter() != null) {
                        field.getFooter().invoke(composer3, 0);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, Spacing.INSTANCE.m27175getMEDIUMD9Ej5fM()), composer3, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 384, 2);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.form.FormKt.Form.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    Form2.Form(modifier2, viewModel, boxWithConstraints42, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
