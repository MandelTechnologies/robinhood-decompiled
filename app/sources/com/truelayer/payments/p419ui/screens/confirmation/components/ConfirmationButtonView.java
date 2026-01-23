package com.truelayer.payments.p419ui.screens.confirmation.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.ButtonKt;
import com.truelayer.payments.p419ui.components.ResponsiveContainer;
import com.truelayer.payments.p419ui.screens.components.LegalText;
import com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData;
import com.truelayer.payments.p419ui.screens.confirmation.MandateConfirmationViewData;
import com.truelayer.payments.p419ui.screens.confirmation.PaymentConfirmationViewData;
import com.truelayer.payments.p419ui.theme.Spacing;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmationButtonView.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"ConfirmationButtonView", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewData", "Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData;", "onConfirm", "Lkotlin/Function0;", "onLegalLinkClicked", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/Modifier;Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonViewKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ConfirmationButtonView {
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmationButtonView(Modifier modifier, final ConfirmationViewData viewData, Function0<Unit> function0, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super String, Unit> function12;
        final Function1<? super String, Unit> function13;
        final Function0<Unit> function02;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        Composer composerStartRestartGroup = composer.startRestartGroup(354386041);
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
            i3 |= composerStartRestartGroup.changed(viewData) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 7168) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                final Function0<Unit> function03 = i5 == 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonViewKt.ConfirmationButtonView.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                } : function0;
                final Function1<? super String, Unit> function14 = i6 == 0 ? new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonViewKt.ConfirmationButtonView.2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }
                } : function12;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354386041, i3, -1, "com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonView (ConfirmationButtonView.kt:29)");
                }
                ResponsiveContainer.ResponsiveContainer(null, null, ResponsiveContainer.legalsTextBreakpoints(modifier), ComposableLambda3.composableLambda(composerStartRestartGroup, -2119183389, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonViewKt.ConfirmationButtonView.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier2, Composer composer2, Integer num) {
                        invoke(modifier2, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Modifier it, Composer composer2, int i7) {
                        int i8;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i7 & 14) == 0) {
                            i8 = i7 | (composer2.changed(it) ? 4 : 2);
                        } else {
                            i8 = i7;
                        }
                        if ((i8 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2119183389, i8, -1, "com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonView.<anonymous> (ConfirmationButtonView.kt:32)");
                        }
                        Spacing spacing = Spacing.INSTANCE;
                        Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(it, spacing.m27177getREGULARD9Ej5fM(), spacing.m27175getMEDIUMD9Ej5fM(), spacing.m27177getREGULARD9Ej5fM(), spacing.m27179getXLARGED9Ej5fM());
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical bottom = arrangement.getBottom();
                        Function0<Unit> function04 = function03;
                        final ConfirmationViewData confirmationViewData = viewData;
                        final Function1<String, Unit> function15 = function14;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(bottom, centerHorizontally, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5145paddingqDBjuR0);
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
                        ButtonKt.Button((Modifier) null, false, function04, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambda3.composableLambda(composer2, 953610523, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonViewKt$ConfirmationButtonView$3$1$1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i9) {
                                int i10;
                                if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(953610523, i9, -1, "com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonView.<anonymous>.<anonymous>.<anonymous> (ConfirmationButtonView.kt:45)");
                                    }
                                    ConfirmationViewData confirmationViewData2 = confirmationViewData;
                                    if (confirmationViewData2 instanceof PaymentConfirmationViewData) {
                                        i10 = C42830R.string.button_continue;
                                    } else {
                                        if (!(confirmationViewData2 instanceof MandateConfirmationViewData)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        i10 = C42830R.string.confirm_bank_button;
                                    }
                                    String strStringResource = StringResources_androidKt.stringResource(i10, composer3, 0);
                                    if (strStringResource.length() > 0) {
                                        StringBuilder sb = new StringBuilder();
                                        String strValueOf = String.valueOf(strStringResource.charAt(0));
                                        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                                        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                        sb.append((Object) upperCase);
                                        String strSubstring = strStringResource.substring(1);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                        sb.append(strSubstring);
                                        strStringResource = sb.toString();
                                    }
                                    TextKt.m6028Text4IGK_g(strStringResource, null, 0L, 0L, null, null, null, 0L, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 130558);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 3072, 3);
                        Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
                        Arrangement.Vertical bottom2 = arrangement.getBottom();
                        composer2.startReplaceableGroup(-483455358);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(bottom2, centerHorizontally2, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, spacing.m27175getMEDIUMD9Ej5fM()), composer2, 6);
                        Legals legals = confirmationViewData.getLegals();
                        composer2.startReplaceableGroup(867297000);
                        boolean zChanged = composer2.changed(function15);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonViewKt$ConfirmationButtonView$3$1$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                    invoke2(str);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(String url) {
                                    Intrinsics.checkNotNullParameter(url, "url");
                                    function15.invoke(url);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        LegalText.LegalText(null, legals, (Function1) objRememberedValue, composer2, 64, 1);
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
                }), composerStartRestartGroup, 3072, 3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function13 = function14;
                function02 = function03;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function02 = function0;
                function13 = function12;
            }
            final Modifier modifier2 = modifier;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonViewKt.ConfirmationButtonView.4
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

                    public final void invoke(Composer composer2, int i7) {
                        ConfirmationButtonView.ConfirmationButtonView(modifier2, viewData, function02, function13, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        function12 = function1;
        if ((i3 & 5851) == 1170) {
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ResponsiveContainer.ResponsiveContainer(null, null, ResponsiveContainer.legalsTextBreakpoints(modifier), ComposableLambda3.composableLambda(composerStartRestartGroup, -2119183389, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonViewKt.ConfirmationButtonView.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier22, Composer composer2, Integer num) {
                    invoke(modifier22, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Modifier it, Composer composer2, int i7) {
                    int i8;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i7 & 14) == 0) {
                        i8 = i7 | (composer2.changed(it) ? 4 : 2);
                    } else {
                        i8 = i7;
                    }
                    if ((i8 & 91) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2119183389, i8, -1, "com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonView.<anonymous> (ConfirmationButtonView.kt:32)");
                    }
                    Spacing spacing = Spacing.INSTANCE;
                    Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(it, spacing.m27177getREGULARD9Ej5fM(), spacing.m27175getMEDIUMD9Ej5fM(), spacing.m27177getREGULARD9Ej5fM(), spacing.m27179getXLARGED9Ej5fM());
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical bottom = arrangement.getBottom();
                    Function0<Unit> function04 = function03;
                    final ConfirmationViewData confirmationViewData = viewData;
                    final Function1<? super String, Unit> function15 = function14;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(bottom, centerHorizontally, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5145paddingqDBjuR0);
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
                    ButtonKt.Button((Modifier) null, false, function04, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambda3.composableLambda(composer2, 953610523, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonViewKt$ConfirmationButtonView$3$1$1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i9) {
                            int i10;
                            if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(953610523, i9, -1, "com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonView.<anonymous>.<anonymous>.<anonymous> (ConfirmationButtonView.kt:45)");
                                }
                                ConfirmationViewData confirmationViewData2 = confirmationViewData;
                                if (confirmationViewData2 instanceof PaymentConfirmationViewData) {
                                    i10 = C42830R.string.button_continue;
                                } else {
                                    if (!(confirmationViewData2 instanceof MandateConfirmationViewData)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i10 = C42830R.string.confirm_bank_button;
                                }
                                String strStringResource = StringResources_androidKt.stringResource(i10, composer3, 0);
                                if (strStringResource.length() > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    String strValueOf = String.valueOf(strStringResource.charAt(0));
                                    Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                    sb.append((Object) upperCase);
                                    String strSubstring = strStringResource.substring(1);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                    sb.append(strSubstring);
                                    strStringResource = sb.toString();
                                }
                                TextKt.m6028Text4IGK_g(strStringResource, null, 0L, 0L, null, null, null, 0L, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 130558);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 3072, 3);
                    Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
                    Arrangement.Vertical bottom2 = arrangement.getBottom();
                    composer2.startReplaceableGroup(-483455358);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(bottom2, centerHorizontally2, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, spacing.m27175getMEDIUMD9Ej5fM()), composer2, 6);
                    Legals legals = confirmationViewData.getLegals();
                    composer2.startReplaceableGroup(867297000);
                    boolean zChanged = composer2.changed(function15);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.components.ConfirmationButtonViewKt$ConfirmationButtonView$3$1$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                invoke2(str);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String url) {
                                Intrinsics.checkNotNullParameter(url, "url");
                                function15.invoke(url);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    LegalText.LegalText(null, legals, (Function1) objRememberedValue, composer2, 64, 1);
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
            }), composerStartRestartGroup, 3072, 3);
            if (ComposerKt.isTraceInProgress()) {
            }
            function13 = function14;
            function02 = function03;
        }
        final Modifier modifier22 = modifier;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
