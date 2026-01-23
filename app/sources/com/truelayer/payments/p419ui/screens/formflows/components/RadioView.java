package com.truelayer.payments.p419ui.screens.formflows.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.ButtonKt;
import com.truelayer.payments.p419ui.components.inputs.RadioSelect2;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
import com.truelayer.payments.p419ui.screens.formflows.model.SelectOption;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RadioView.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ak\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "title", "Lcom/truelayer/payments/ui/components/inputs/form/models/SelectField;", "input", "defaultValue", "Lkotlin/Function1;", "", "", "onSelect", "Lkotlin/Function0;", "header", Footer.f10637type, "RadioView", "(Ljava/lang/String;Lcom/truelayer/payments/ui/components/inputs/form/models/SelectField;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lcom/truelayer/payments/ui/screens/formflows/model/SelectOption;", "selected", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.formflows.components.RadioViewKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class RadioView {
    public static final void RadioView(final String title, final Fields4 input, String str, final Function1<? super Map<String, String>, Unit> onSelect, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i, final int i2) {
        final int i3;
        SelectOption selectOption;
        Object next;
        Function1<? super Map<String, String>, Unit> function1;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1797445216);
        final String str2 = (i2 & 4) != 0 ? null : str;
        if (ComposerKt.isTraceInProgress()) {
            i3 = i;
            ComposerKt.traceEventStart(-1797445216, i3, -1, "com.truelayer.payments.ui.screens.formflows.components.RadioView (RadioView.kt:28)");
        } else {
            i3 = i;
        }
        if (input.getOptions().isEmpty()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                function1 = onSelect;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.RadioViewKt.RadioView.1
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

                    public final void invoke(Composer composer2, int i4) {
                        RadioView.RadioView(title, input, str2, onSelect, function2, function22, composer2, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i2);
                    }
                });
            } else {
                function1 = onSelect;
            }
            function1.invoke(MapsKt.emptyMap());
            return;
        }
        final String str3 = str2;
        composerStartRestartGroup.startReplaceableGroup(-2075198398);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            if (str3 != null) {
                Iterator<T> it = input.getOptions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.areEqual(((SelectOption) next).getId(), str3)) {
                            break;
                        }
                    }
                }
                selectOption = (SelectOption) next;
            } else {
                selectOption = null;
            }
            objRememberedValue = SnapshotState3.mutableStateOf$default(selectOption, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        ContentScaffold4.ContentScaffold(null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1760070749, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.RadioViewKt.RadioView.2
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

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1760070749, i4, -1, "com.truelayer.payments.ui.screens.formflows.components.RadioView.<anonymous> (RadioView.kt:41)");
                    }
                    String str4 = title;
                    final Function2<Composer, Integer, Unit> function23 = function2;
                    FormHeader.FormHeader(str4, ComposableLambda3.composableLambda(composer2, -620449916, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.RadioViewKt.RadioView.2.1
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

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-620449916, i5, -1, "com.truelayer.payments.ui.screens.formflows.components.RadioView.<anonymous>.<anonymous> (RadioView.kt:44)");
                                }
                                Function2<Composer, Integer, Unit> function24 = function23;
                                composer3.startReplaceableGroup(-324939974);
                                if (function24 != null) {
                                    function24.invoke(composer3, 0);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer3.endReplaceableGroup();
                                Spacer2.Spacer(SizeKt.m5171sizeVpY3zN4(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(1), Spacing.INSTANCE.m27175getMEDIUMD9Ej5fM()), composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), ComposableLambda3.composableLambda(composerStartRestartGroup, 2119569730, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.RadioViewKt.RadioView.3
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

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2119569730, i4, -1, "com.truelayer.payments.ui.screens.formflows.components.RadioView.<anonymous> (RadioView.kt:58)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Spacing spacing = Spacing.INSTANCE;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, spacing.m27176getMODERATED9Ej5fM(), 0.0f, spacing.m27177getREGULARD9Ej5fM(), 5, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(spacing.m27175getMEDIUMD9Ej5fM());
                    Function2<Composer, Integer, Unit> function23 = function22;
                    final SnapshotState<SelectOption> snapshotState2 = snapshotState;
                    final Function1<Map<String, String>, Unit> function12 = onSelect;
                    final Fields4 fields4 = input;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5146paddingqDBjuR0$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Column6 column6 = Column6.INSTANCE;
                    ButtonKt.Button((Modifier) null, RadioView.RadioView$lambda$3(snapshotState2) != null, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.RadioViewKt$RadioView$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            SelectOption selectOptionRadioView$lambda$3 = RadioView.RadioView$lambda$3(snapshotState2);
                            if (selectOptionRadioView$lambda$3 != null) {
                                function12.invoke(MapsKt.mapOf(Tuples4.m3642to(fields4.getId(), selectOptionRadioView$lambda$3.getId())));
                            }
                        }
                    }, C42830R.string.button_continue, composer2, 0, 1);
                    composer2.startReplaceableGroup(-133783850);
                    if (function23 != null) {
                        function23.invoke(composer2, 0);
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), ComposableLambda3.composableLambda(composerStartRestartGroup, -676521670, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.RadioViewKt.RadioView.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                invoke(boxWithConstraints4, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxWithConstraints4 scope, Composer composer2, int i4) {
                Intrinsics.checkNotNullParameter(scope, "scope");
                if ((i4 & 14) == 0) {
                    i4 |= composer2.changed(scope) ? 4 : 2;
                }
                if ((i4 & 91) != 18 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-676521670, i4, -1, "com.truelayer.payments.ui.screens.formflows.components.RadioView.<anonymous> (RadioView.kt:50)");
                    }
                    List<SelectOption> options = input.getOptions();
                    SelectOption selectOptionRadioView$lambda$3 = RadioView.RadioView$lambda$3(snapshotState);
                    composer2.startReplaceableGroup(-133784518);
                    final SnapshotState<SelectOption> snapshotState2 = snapshotState;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<SelectOption, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.RadioViewKt$RadioView$4$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SelectOption selectOption2) {
                                invoke2(selectOption2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SelectOption it2) {
                                Intrinsics.checkNotNullParameter(it2, "it");
                                snapshotState2.setValue(it2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    RadioSelect2.RadioSelect(options, selectOptionRadioView$lambda$3, (Function1) objRememberedValue2, scope, composer2, ((i4 << 9) & 7168) | WaitlistAnimationConstants.MIDDLE_YAW_FRAME, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 3504, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.RadioViewKt.RadioView.5
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

                public final void invoke(Composer composer2, int i4) {
                    RadioView.RadioView(title, input, str3, onSelect, function2, function22, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectOption RadioView$lambda$3(SnapshotState<SelectOption> snapshotState) {
        return snapshotState.getValue();
    }
}
