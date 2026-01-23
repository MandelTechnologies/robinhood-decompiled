package com.truelayer.payments.p419ui.screens.formflows.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.Lock2;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.ButtonKt;
import com.truelayer.payments.p419ui.components.inputs.form.Form2;
import com.truelayer.payments.p419ui.components.inputs.form.FormViewModel;
import com.truelayer.payments.p419ui.components.inputs.form.FormViewModel2;
import com.truelayer.payments.p419ui.components.inputs.form.models.Field;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.truelayer.payments.p419ui.utils.TestTags;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FormView.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a|\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062-\u0010\u000f\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\nH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"", "title", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/truelayer/payments/ui/components/inputs/form/FormViewModel;", "viewModel", "Lkotlin/Function0;", "", "header", Footer.f10637type, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "values", "onSubmit", "FormView", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/truelayer/payments/ui/components/inputs/form/FormViewModel;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.formflows.components.FormViewKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FormView3 {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0135 A[EDGE_INSN: B:104:0x0135->B:92:0x0135 BREAK  A[LOOP:0: B:87:0x0121->B:106:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FormView(final String title, Modifier modifier, final FormViewModel viewModel, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, final Function1<? super Map<String, String>, Unit> onSubmit, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i6;
        Iterator<Field> it;
        final FormViewModel formViewModel;
        Composer composer2;
        Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onSubmit, "onSubmit");
        Composer composerStartRestartGroup = composer.startRestartGroup(2004984852);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(viewModel) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    function23 = function2;
                    i3 |= composerStartRestartGroup.changedInstance(function23) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((57344 & i) == 0) {
                        function24 = function22;
                        i3 |= composerStartRestartGroup.changedInstance(function24) ? 16384 : 8192;
                    }
                    if ((i2 & 32) != 0) {
                        i7 = (458752 & i) == 0 ? composerStartRestartGroup.changedInstance(onSubmit) ? 131072 : 65536 : 196608;
                        i6 = i3;
                        if ((374491 & i6) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            Field field = null;
                            if (i4 != 0) {
                                function23 = null;
                            }
                            final Function2<? super Composer, ? super Integer, Unit> function2M27114getLambda1$payments_ui_release = i5 == 0 ? FormView.INSTANCE.m27114getLambda1$payments_ui_release() : function24;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2004984852, i6, -1, "com.truelayer.payments.ui.screens.formflows.components.FormView (FormView.kt:37)");
                            }
                            final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                            final int bottom = WindowInsets_androidKt.getIme(WindowInsets.INSTANCE, composerStartRestartGroup, 8).getBottom((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
                            it = viewModel.getFields().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    break;
                                }
                                Field next = it.next();
                                if (next.getIsSensitive()) {
                                    field = next;
                                    break;
                                }
                            }
                            final boolean z = field == null;
                            ComposableLambda composableLambda = ComposableLambda3.composableLambda(composerStartRestartGroup, -732858025, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.FormViewKt.FormView.1
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

                                public final void invoke(Composer composer3, int i9) {
                                    if ((i9 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-732858025, i9, -1, "com.truelayer.payments.ui.screens.formflows.components.FormView.<anonymous> (FormView.kt:45)");
                                    }
                                    FormHeader.FormHeader(title, function23, composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            Function2<Composer, Integer, Unit> function26 = new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.FormViewKt.FormView.2
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

                                public final void invoke(Composer composer3, int i9) {
                                    if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-429970634, i9, -1, "com.truelayer.payments.ui.screens.formflows.components.FormView.<anonymous> (FormView.kt:54)");
                                        }
                                        if (bottom > 0) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Spacing spacing = Spacing.INSTANCE;
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, spacing.m27176getMODERATED9Ej5fM(), 0.0f, spacing.m27177getREGULARD9Ej5fM(), 5, null);
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(spacing.m27175getMEDIUMD9Ej5fM());
                                        final FormViewModel formViewModel2 = viewModel;
                                        Function2<Composer, Integer, Unit> function27 = function2M27114getLambda1$payments_ui_release;
                                        final FocusManager focusManager2 = focusManager;
                                        final Function1<Map<String, String>, Unit> function1 = onSubmit;
                                        final boolean z2 = z;
                                        composer3.startReplaceableGroup(-483455358);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer3, 6);
                                        composer3.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5146paddingqDBjuR0$default);
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        Column6 column6 = Column6.INSTANCE;
                                        ButtonKt.Button((Modifier) null, formViewModel2.getState() == FormViewModel2.Valid, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.FormViewKt$FormView$2$1$1
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
                                                FocusManager.clearFocus$default(focusManager2, false, 1, null);
                                                function1.invoke(formViewModel2.values());
                                            }
                                        }, ComposableLambda3.composableLambda(composer3, 937731838, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.FormViewKt$FormView$2$1$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i10) {
                                                if ((i10 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(937731838, i10, -1, "com.truelayer.payments.ui.screens.formflows.components.FormView.<anonymous>.<anonymous>.<anonymous> (FormView.kt:68)");
                                                    }
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(Spacing.INSTANCE.m27175getMEDIUMD9Ej5fM());
                                                    boolean z3 = z2;
                                                    composer4.startReplaceableGroup(693286680);
                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, centerVertically, composer4, 54);
                                                    composer4.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
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
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer4)), composer4, 0);
                                                    composer4.startReplaceableGroup(2058660585);
                                                    Row6 row6 = Row6.INSTANCE;
                                                    composer4.startReplaceableGroup(-705544050);
                                                    if (z3) {
                                                        IconKt.m5872Iconww6aTOc(Lock2.getLock(Icons.Outlined.INSTANCE), (String) null, TestTag3.testTag(SizeKt.m5169size3ABfNKs(companion3, C2002Dp.m7995constructorimpl(20)), TestTags.SENSITIVE_BUTTON_ICON), 0L, composer4, 432, 8);
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    String strStringResource = StringResources_androidKt.stringResource(C42830R.string.next, composer4, 0);
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
                                                    TextKt.m6028Text4IGK_g(strStringResource, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131070);
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
                                        }), composer3, 3072, 1);
                                        composer3.startReplaceableGroup(-623462560);
                                        if (function27 != null) {
                                            function27.invoke(composer3, 0);
                                        }
                                        composer3.endReplaceableGroup();
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
                            };
                            formViewModel = viewModel;
                            Function2<? super Composer, ? super Integer, Unit> function27 = function2M27114getLambda1$payments_ui_release;
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier4;
                            ContentScaffold4.ContentScaffold(modifier3, composableLambda, ComposableLambda3.composableLambda(composerStartRestartGroup, -429970634, true, function26), ComposableLambda3.composableLambda(composerStartRestartGroup, 1175721262, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.FormViewKt.FormView.3
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer3, Integer num) {
                                    invoke(boxWithConstraints4, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxWithConstraints4 it2, Composer composer3, int i9) {
                                    Intrinsics.checkNotNullParameter(it2, "it");
                                    if ((i9 & 14) == 0) {
                                        i9 |= composer3.changed(it2) ? 4 : 2;
                                    }
                                    if ((i9 & 91) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1175721262, i9, -1, "com.truelayer.payments.ui.screens.formflows.components.FormView.<anonymous> (FormView.kt:48)");
                                    }
                                    Form2.Form(null, formViewModel, it2, composer3, (i9 << 6) & 896, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, ((i6 >> 3) & 14) | 3504, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function25 = function27;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            formViewModel = viewModel;
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                            function25 = function24;
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function28 = function23;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier5 = modifier3;
                            final FormViewModel formViewModel2 = formViewModel;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.FormViewKt.FormView.4
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

                                public final void invoke(Composer composer3, int i9) {
                                    FormView3.FormView(title, modifier5, formViewModel2, function28, function25, onSubmit, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= i7;
                    i6 = i3;
                    if ((374491 & i6) != 74898) {
                        if (i8 == 0) {
                        }
                        Field field2 = null;
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                        final int bottom2 = WindowInsets_androidKt.getIme(WindowInsets.INSTANCE, composerStartRestartGroup, 8).getBottom((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
                        it = viewModel.getFields().iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        if (field2 == null) {
                        }
                        ComposableLambda composableLambda2 = ComposableLambda3.composableLambda(composerStartRestartGroup, -732858025, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.FormViewKt.FormView.1
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

                            public final void invoke(Composer composer3, int i9) {
                                if ((i9 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-732858025, i9, -1, "com.truelayer.payments.ui.screens.formflows.components.FormView.<anonymous> (FormView.kt:45)");
                                }
                                FormHeader.FormHeader(title, function23, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        Function2<Composer, Integer, Unit> function262 = new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.FormViewKt.FormView.2
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

                            public final void invoke(Composer composer3, int i9) {
                                if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-429970634, i9, -1, "com.truelayer.payments.ui.screens.formflows.components.FormView.<anonymous> (FormView.kt:54)");
                                    }
                                    if (bottom2 > 0) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Spacing spacing = Spacing.INSTANCE;
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, spacing.m27176getMODERATED9Ej5fM(), 0.0f, spacing.m27177getREGULARD9Ej5fM(), 5, null);
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(spacing.m27175getMEDIUMD9Ej5fM());
                                    final FormViewModel formViewModel22 = viewModel;
                                    Function2<Composer, Integer, Unit> function272 = function2M27114getLambda1$payments_ui_release;
                                    final FocusManager focusManager22 = focusManager2;
                                    final Function1<? super Map<String, String>, Unit> function1 = onSubmit;
                                    final boolean z2 = z;
                                    composer3.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5146paddingqDBjuR0$default);
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    Column6 column6 = Column6.INSTANCE;
                                    ButtonKt.Button((Modifier) null, formViewModel22.getState() == FormViewModel2.Valid, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.FormViewKt$FormView$2$1$1
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
                                            FocusManager.clearFocus$default(focusManager22, false, 1, null);
                                            function1.invoke(formViewModel22.values());
                                        }
                                    }, ComposableLambda3.composableLambda(composer3, 937731838, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.FormViewKt$FormView$2$1$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i10) {
                                            if ((i10 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(937731838, i10, -1, "com.truelayer.payments.ui.screens.formflows.components.FormView.<anonymous>.<anonymous>.<anonymous> (FormView.kt:68)");
                                                }
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(Spacing.INSTANCE.m27175getMEDIUMD9Ej5fM());
                                                boolean z3 = z2;
                                                composer4.startReplaceableGroup(693286680);
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, centerVertically, composer4, 54);
                                                composer4.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
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
                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                Row6 row6 = Row6.INSTANCE;
                                                composer4.startReplaceableGroup(-705544050);
                                                if (z3) {
                                                    IconKt.m5872Iconww6aTOc(Lock2.getLock(Icons.Outlined.INSTANCE), (String) null, TestTag3.testTag(SizeKt.m5169size3ABfNKs(companion3, C2002Dp.m7995constructorimpl(20)), TestTags.SENSITIVE_BUTTON_ICON), 0L, composer4, 432, 8);
                                                }
                                                composer4.endReplaceableGroup();
                                                String strStringResource = StringResources_androidKt.stringResource(C42830R.string.next, composer4, 0);
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
                                                TextKt.m6028Text4IGK_g(strStringResource, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131070);
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
                                    }), composer3, 3072, 1);
                                    composer3.startReplaceableGroup(-623462560);
                                    if (function272 != null) {
                                        function272.invoke(composer3, 0);
                                    }
                                    composer3.endReplaceableGroup();
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
                        };
                        formViewModel = viewModel;
                        Function2<? super Composer, ? super Integer, Unit> function272 = function2M27114getLambda1$payments_ui_release;
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier4;
                        ContentScaffold4.ContentScaffold(modifier3, composableLambda2, ComposableLambda3.composableLambda(composerStartRestartGroup, -429970634, true, function262), ComposableLambda3.composableLambda(composerStartRestartGroup, 1175721262, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.FormViewKt.FormView.3
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer3, Integer num) {
                                invoke(boxWithConstraints4, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxWithConstraints4 it2, Composer composer3, int i9) {
                                Intrinsics.checkNotNullParameter(it2, "it");
                                if ((i9 & 14) == 0) {
                                    i9 |= composer3.changed(it2) ? 4 : 2;
                                }
                                if ((i9 & 91) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1175721262, i9, -1, "com.truelayer.payments.ui.screens.formflows.components.FormView.<anonymous> (FormView.kt:48)");
                                }
                                Form2.Form(null, formViewModel, it2, composer3, (i9 << 6) & 896, 1);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, ((i6 >> 3) & 14) | 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function25 = function272;
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function282 = function23;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function24 = function22;
                if ((i2 & 32) != 0) {
                }
                i3 |= i7;
                i6 = i3;
                if ((374491 & i6) != 74898) {
                }
                final Function2<? super Composer, ? super Integer, Unit> function2822 = function23;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function23 = function2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function24 = function22;
            if ((i2 & 32) != 0) {
            }
            i3 |= i7;
            i6 = i3;
            if ((374491 & i6) != 74898) {
            }
            final Function2<? super Composer, ? super Integer, Unit> function28222 = function23;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function24 = function22;
        if ((i2 & 32) != 0) {
        }
        i3 |= i7;
        i6 = i3;
        if ((374491 & i6) != 74898) {
        }
        final Function2<? super Composer, ? super Integer, Unit> function282222 = function23;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
