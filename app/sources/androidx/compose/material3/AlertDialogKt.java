package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyle;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.car.result.CarResultComposable2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AlertDialog.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a®\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0092\u0001\u0010\u001f\u001a\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a0\u0010$\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\"\u001a\u0010%\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u001a\u0010)\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(\"\u0014\u0010+\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010&\"\u0014\u0010,\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010&\"\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/\"\u0014\u00101\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/\"\u0014\u00102\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, m3636d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/window/DialogProperties;", "properties", "content", "BasicAlertDialog", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "confirmButton", "dismissButton", "icon", "title", "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "iconContentColor", "titleContentColor", "textContentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "AlertDialogImpl-wrnwzgE", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "AlertDialogImpl", CarResultComposable2.BUTTONS, "buttonContentColor", "AlertDialogContent-4hvqGtA", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JFJJJJLandroidx/compose/runtime/Composer;III)V", "AlertDialogContent", "mainAxisSpacing", "crossAxisSpacing", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AlertDialogFlowRow", "DialogMinWidth", "F", "getDialogMinWidth", "()F", "DialogMaxWidth", "getDialogMaxWidth", "ButtonsMainAxisSpacing", "ButtonsCrossAxisSpacing", "Landroidx/compose/foundation/layout/PaddingValues;", "DialogPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "IconPadding", "TitlePadding", "TextPadding", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AlertDialogKt {
    private static final PaddingValues DialogPadding;
    private static final PaddingValues IconPadding;
    private static final PaddingValues TextPadding;
    private static final PaddingValues TitlePadding;
    private static final float DialogMinWidth = C2002Dp.m7995constructorimpl(280);
    private static final float DialogMaxWidth = C2002Dp.m7995constructorimpl(560);
    private static final float ButtonsMainAxisSpacing = C2002Dp.m7995constructorimpl(8);
    private static final float ButtonsCrossAxisSpacing = C2002Dp.m7995constructorimpl(12);

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicAlertDialog(final Function0<Unit> function0, Modifier modifier, DialogProperties dialogProperties, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        DialogProperties dialogProperties2;
        final Modifier modifier3;
        final DialogProperties dialogProperties3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1922902937);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else if ((i & 6) == 0) {
            function02 = function0;
            i3 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    dialogProperties2 = dialogProperties;
                    i3 |= composerStartRestartGroup.changed(dialogProperties2) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    final Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    DialogProperties dialogProperties4 = i4 == 0 ? new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null) : dialogProperties2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1922902937, i3, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:145)");
                    }
                    AndroidDialog_androidKt.Dialog(function02, dialogProperties4, ComposableLambda3.rememberComposableLambda(905289008, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt.BasicAlertDialog.1
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

                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(905289008, i6, -1, "androidx.compose.material3.BasicAlertDialog.<anonymous> (AlertDialog.kt:150)");
                                }
                                Strings.Companion companion = Strings.INSTANCE;
                                final String strM6095getString2EP1pXo = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_dialog), composer2, 0);
                                Modifier modifierM5173sizeInqDBjuR0$default = SizeKt.m5173sizeInqDBjuR0$default(modifier4, AlertDialogKt.getDialogMinWidth(), 0.0f, AlertDialogKt.getDialogMaxWidth(), 0.0f, 10, null);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                boolean zChanged = composer2.changed(strM6095getString2EP1pXo);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM6095getString2EP1pXo);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                Modifier modifierThen = modifierM5173sizeInqDBjuR0$default.then(SemanticsModifier6.semantics$default(companion2, false, (Function1) objRememberedValue, 1, null));
                                Function2<Composer, Integer, Unit> function22 = function2;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierThen);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function22.invoke(composer2, 0);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 384 | ((i3 >> 3) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    dialogProperties3 = dialogProperties4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt.BasicAlertDialog.2
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

                        public final void invoke(Composer composer2, int i6) {
                            AlertDialogKt.BasicAlertDialog(function0, modifier3, dialogProperties3, function2, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            dialogProperties2 = dialogProperties;
            if ((i2 & 8) != 0) {
            }
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                AndroidDialog_androidKt.Dialog(function02, dialogProperties4, ComposableLambda3.rememberComposableLambda(905289008, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt.BasicAlertDialog.1
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

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(905289008, i6, -1, "androidx.compose.material3.BasicAlertDialog.<anonymous> (AlertDialog.kt:150)");
                            }
                            Strings.Companion companion = Strings.INSTANCE;
                            final String strM6095getString2EP1pXo = Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(R$string.m3c_dialog), composer2, 0);
                            Modifier modifierM5173sizeInqDBjuR0$default = SizeKt.m5173sizeInqDBjuR0$default(modifier4, AlertDialogKt.getDialogMinWidth(), 0.0f, AlertDialogKt.getDialogMaxWidth(), 0.0f, 10, null);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            boolean zChanged = composer2.changed(strM6095getString2EP1pXo);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM6095getString2EP1pXo);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            Modifier modifierThen = modifierM5173sizeInqDBjuR0$default.then(SemanticsModifier6.semantics$default(companion2, false, (Function1) objRememberedValue, 1, null));
                            Function2<Composer, Integer, Unit> function22 = function2;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierThen);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function22.invoke(composer2, 0);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 384 | ((i3 >> 3) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                dialogProperties3 = dialogProperties4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        dialogProperties2 = dialogProperties;
        if ((i2 & 8) != 0) {
        }
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* renamed from: AlertDialogImpl-wrnwzgE, reason: not valid java name */
    public static final void m5697AlertDialogImplwrnwzgE(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final Shape shape, final long j, final long j2, final long j3, final long j4, final float f, final DialogProperties dialogProperties, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i4;
        float f2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-919826268);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function26 = function2;
            i3 |= composerStartRestartGroup.changedInstance(function26) ? 32 : 16;
        } else {
            function26 = function2;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function27 = function22;
            i3 |= composerStartRestartGroup.changedInstance(function27) ? 2048 : 1024;
        } else {
            function27 = function22;
        }
        if ((i & 24576) == 0) {
            function28 = function23;
            i3 |= composerStartRestartGroup.changedInstance(function28) ? 16384 : 8192;
        } else {
            function28 = function23;
        }
        if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(dialogProperties) ? 2048 : 1024;
        }
        int i5 = i4;
        if ((i3 & 306783379) != 306783378 || (i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-919826268, i3, i5, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:247)");
            }
            final Function2<? super Composer, ? super Integer, Unit> function29 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function210 = function27;
            final float f3 = f2;
            final Function2<? super Composer, ? super Integer, Unit> function211 = function28;
            BasicAlertDialog(function0, modifier, dialogProperties, ComposableLambda3.rememberComposableLambda(-1852840226, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1
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

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1852840226, i6, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:252)");
                        }
                        final Function2<Composer, Integer, Unit> function212 = function210;
                        final Function2<Composer, Integer, Unit> function213 = function29;
                        AlertDialogKt.m5695AlertDialogContent4hvqGtA(ComposableLambda3.rememberComposableLambda(1163543932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1.1
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

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1163543932, i7, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:254)");
                                    }
                                    float f4 = AlertDialogKt.ButtonsMainAxisSpacing;
                                    float f5 = AlertDialogKt.ButtonsCrossAxisSpacing;
                                    final Function2<Composer, Integer, Unit> function214 = function212;
                                    final Function2<Composer, Integer, Unit> function215 = function213;
                                    AlertDialogKt.m5696AlertDialogFlowRowixp7dh8(f4, f5, ComposableLambda3.rememberComposableLambda(1887135077, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt.AlertDialogImpl.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i8) {
                                            if ((i8 & 3) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1887135077, i8, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:258)");
                                                }
                                                Function2<Composer, Integer, Unit> function216 = function214;
                                                composer4.startReplaceGroup(1497073862);
                                                if (function216 != null) {
                                                    function216.invoke(composer4, 0);
                                                    Unit unit = Unit.INSTANCE;
                                                }
                                                composer4.endReplaceGroup();
                                                function215.invoke(composer4, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }, composer3, 54), composer3, 438);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), null, function211, function24, function25, shape, j, f3, ColorScheme2.getValue(DialogTokens.INSTANCE.getActionLabelTextColor(), composer2, 6), j2, j3, j4, composer2, 6, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$2
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

                public final void invoke(Composer composer2, int i6) {
                    AlertDialogKt.m5697AlertDialogImplwrnwzgE(function0, function2, modifier, function22, function23, function24, function25, shape, j, j2, j3, j4, f, dialogProperties, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* renamed from: AlertDialogContent-4hvqGtA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5695AlertDialogContent4hvqGtA(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Shape shape, final long j, final float f, final long j2, final long j3, final long j4, final long j5, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        long j6;
        long j7;
        int i5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1522575799);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
                function25 = function22;
            } else {
                function25 = function22;
                if ((i & 384) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function25) ? 256 : 128;
                }
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function26 = function23;
                    i4 |= composerStartRestartGroup.changedInstance(function26) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function27 = function24;
                        i4 |= composerStartRestartGroup.changedInstance(function27) ? 16384 : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i4 |= 196608;
                    } else {
                        if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(shape) ? 131072 : 65536;
                        }
                        if ((i3 & 64) != 0) {
                            i4 |= 1572864;
                            j6 = j;
                        } else {
                            j6 = j;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(j6) ? 1048576 : 524288;
                            }
                        }
                        if ((i3 & 128) != 0) {
                            i4 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                i4 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
                            }
                            if ((i3 & 256) == 0) {
                                i4 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i4 |= composerStartRestartGroup.changed(j2) ? 67108864 : 33554432;
                            }
                            if ((i3 & 512) == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i4 |= composerStartRestartGroup.changed(j3) ? 536870912 : 268435456;
                            }
                            if ((i3 & 1024) == 0) {
                                i5 = i2 | 6;
                                j7 = j4;
                            } else {
                                j7 = j4;
                                if ((i2 & 6) == 0) {
                                    i5 = i2 | (composerStartRestartGroup.changed(j7) ? 4 : 2);
                                } else {
                                    i5 = i2;
                                }
                            }
                            if ((i3 & 2048) != 0) {
                                if ((i2 & 48) == 0) {
                                    i5 |= composerStartRestartGroup.changed(j5) ? 32 : 16;
                                }
                                if ((i4 & 306783379) != 306783378 || (i5 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1522575799, i4, i5, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:293)");
                                    }
                                    final long j8 = j7;
                                    final Function2<? super Composer, ? super Integer, Unit> function28 = function26;
                                    final Function2<? super Composer, ? super Integer, Unit> function29 = function27;
                                    int i7 = i4 >> 12;
                                    Modifier modifier5 = modifier4;
                                    SurfaceKt.m5967SurfaceT9BRK9s(modifier5, shape, j6, 0L, f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-2126308228, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
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

                                        /* JADX WARN: Type inference failed for: r11v1 */
                                        /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
                                        /* JADX WARN: Type inference failed for: r11v3 */
                                        public final void invoke(Composer composer2, int i8) {
                                            boolean z;
                                            ?? r11;
                                            if ((i8 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-2126308228, i8, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:300)");
                                                }
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                Modifier modifierPadding = PaddingKt.padding(companion, AlertDialogKt.DialogPadding);
                                                final Function2<Composer, Integer, Unit> function210 = function25;
                                                final Function2<Composer, Integer, Unit> function211 = function28;
                                                final Function2<Composer, Integer, Unit> function212 = function29;
                                                long j9 = j3;
                                                long j10 = j8;
                                                long j11 = j5;
                                                long j12 = j2;
                                                Function2<Composer, Integer, Unit> function213 = function2;
                                                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPadding);
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                                final Column6 column6 = Column6.INSTANCE;
                                                composer2.startReplaceGroup(-1924971291);
                                                if (function210 != null) {
                                                    CompositionLocal3.CompositionLocalProvider(ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(j9)), ComposableLambda3.rememberComposableLambda(934657765, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                                            if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(934657765, i9, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:303)");
                                                                }
                                                                Column5 column5 = column6;
                                                                Modifier modifierPadding2 = PaddingKt.padding(Modifier.INSTANCE, AlertDialogKt.IconPadding);
                                                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                                                Modifier modifierAlign = column5.align(modifierPadding2, companion4.getCenterHorizontally());
                                                                Function2<Composer, Integer, Unit> function214 = function210;
                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                                                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                }
                                                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                function214.invoke(composer3, 0);
                                                                composer3.endNode();
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                                                }
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(-1924961479);
                                                if (function211 == null) {
                                                    z = true;
                                                    r11 = 0;
                                                } else {
                                                    z = true;
                                                    r11 = 0;
                                                    ProvideContentColorTextStyle.m6093ProvideContentColorTextStyle3JVO9M(j10, Typography4.getValue(DialogTokens.INSTANCE.getHeadlineFont(), composer2, 6), ComposableLambda3.rememberComposableLambda(434448772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                                            Alignment.Horizontal centerHorizontally;
                                                            if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(434448772, i9, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:313)");
                                                                }
                                                                Column5 column5 = column6;
                                                                Modifier modifierPadding2 = PaddingKt.padding(Modifier.INSTANCE, AlertDialogKt.TitlePadding);
                                                                if (function210 == null) {
                                                                    centerHorizontally = Alignment.INSTANCE.getStart();
                                                                } else {
                                                                    centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                                                }
                                                                Modifier modifierAlign = column5.align(modifierPadding2, centerHorizontally);
                                                                Function2<Composer, Integer, Unit> function214 = function211;
                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                                                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                }
                                                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                function214.invoke(composer3, 0);
                                                                composer3.endNode();
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    }, composer2, 54), composer2, 384);
                                                }
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(-1924936431);
                                                if (function212 != null) {
                                                    ProvideContentColorTextStyle.m6093ProvideContentColorTextStyle3JVO9M(j11, Typography4.getValue(DialogTokens.INSTANCE.getSupportingTextFont(), composer2, 6), ComposableLambda3.rememberComposableLambda(-796843771, z, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
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
                                                            if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-796843771, i9, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:334)");
                                                                }
                                                                Column5 column5 = column6;
                                                                Modifier modifierPadding2 = PaddingKt.padding(column5.weight(Modifier.INSTANCE, 1.0f, false), AlertDialogKt.TextPadding);
                                                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                                                Modifier modifierAlign = column5.align(modifierPadding2, companion4.getStart());
                                                                Function2<Composer, Integer, Unit> function214 = function212;
                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                                                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                }
                                                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                function214.invoke(composer3, 0);
                                                                composer3.endNode();
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    }, composer2, 54), composer2, 384);
                                                }
                                                composer2.endReplaceGroup();
                                                Modifier modifierAlign = column6.align(companion, companion2.getEnd());
                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), r11);
                                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, r11);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierAlign);
                                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                ProvideContentColorTextStyle.m6093ProvideContentColorTextStyle3JVO9M(j12, Typography4.getValue(DialogTokens.INSTANCE.getActionLabelTextFont(), composer2, 6), function213, composer2, 0);
                                                composer2.endNode();
                                                composer2.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 12582912 | (i7 & 112) | (i7 & 896) | ((i4 >> 9) & 57344), 104);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier5;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier2;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$2
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

                                        public final void invoke(Composer composer2, int i8) {
                                            AlertDialogKt.m5695AlertDialogContent4hvqGtA(function2, modifier3, function22, function23, function24, shape, j, f, j2, j3, j4, j5, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= 48;
                            if ((i4 & 306783379) != 306783378) {
                                if (i6 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final long j82 = j7;
                                final Function2<? super Composer, ? super Integer, Unit> function282 = function26;
                                final Function2<? super Composer, ? super Integer, Unit> function292 = function27;
                                int i72 = i4 >> 12;
                                Modifier modifier52 = modifier4;
                                SurfaceKt.m5967SurfaceT9BRK9s(modifier52, shape, j6, 0L, f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-2126308228, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
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

                                    /* JADX WARN: Type inference failed for: r11v1 */
                                    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
                                    /* JADX WARN: Type inference failed for: r11v3 */
                                    public final void invoke(Composer composer2, int i8) {
                                        boolean z;
                                        ?? r11;
                                        if ((i8 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2126308228, i8, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:300)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Modifier modifierPadding = PaddingKt.padding(companion, AlertDialogKt.DialogPadding);
                                            final Function2<? super Composer, ? super Integer, Unit> function210 = function25;
                                            final Function2<? super Composer, ? super Integer, Unit> function211 = function282;
                                            final Function2<? super Composer, ? super Integer, Unit> function212 = function292;
                                            long j9 = j3;
                                            long j10 = j82;
                                            long j11 = j5;
                                            long j12 = j2;
                                            Function2<Composer, Integer, Unit> function213 = function2;
                                            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                            Alignment.Companion companion2 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPadding);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                            final Column5 column6 = Column6.INSTANCE;
                                            composer2.startReplaceGroup(-1924971291);
                                            if (function210 != null) {
                                                CompositionLocal3.CompositionLocalProvider(ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(j9)), ComposableLambda3.rememberComposableLambda(934657765, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                                        if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(934657765, i9, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:303)");
                                                            }
                                                            Column5 column5 = column6;
                                                            Modifier modifierPadding2 = PaddingKt.padding(Modifier.INSTANCE, AlertDialogKt.IconPadding);
                                                            Alignment.Companion companion4 = Alignment.INSTANCE;
                                                            Modifier modifierAlign = column5.align(modifierPadding2, companion4.getCenterHorizontally());
                                                            Function2<Composer, Integer, Unit> function214 = function210;
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                                                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            function214.invoke(composer3, 0);
                                                            composer3.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer3.skipToGroupEnd();
                                                    }
                                                }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                                            }
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(-1924961479);
                                            if (function211 == null) {
                                                z = true;
                                                r11 = 0;
                                            } else {
                                                z = true;
                                                r11 = 0;
                                                ProvideContentColorTextStyle.m6093ProvideContentColorTextStyle3JVO9M(j10, Typography4.getValue(DialogTokens.INSTANCE.getHeadlineFont(), composer2, 6), ComposableLambda3.rememberComposableLambda(434448772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                                        Alignment.Horizontal centerHorizontally;
                                                        if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(434448772, i9, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:313)");
                                                            }
                                                            Column5 column5 = column6;
                                                            Modifier modifierPadding2 = PaddingKt.padding(Modifier.INSTANCE, AlertDialogKt.TitlePadding);
                                                            if (function210 == null) {
                                                                centerHorizontally = Alignment.INSTANCE.getStart();
                                                            } else {
                                                                centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                                            }
                                                            Modifier modifierAlign = column5.align(modifierPadding2, centerHorizontally);
                                                            Function2<Composer, Integer, Unit> function214 = function211;
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            function214.invoke(composer3, 0);
                                                            composer3.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer3.skipToGroupEnd();
                                                    }
                                                }, composer2, 54), composer2, 384);
                                            }
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(-1924936431);
                                            if (function212 != null) {
                                                ProvideContentColorTextStyle.m6093ProvideContentColorTextStyle3JVO9M(j11, Typography4.getValue(DialogTokens.INSTANCE.getSupportingTextFont(), composer2, 6), ComposableLambda3.rememberComposableLambda(-796843771, z, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
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
                                                        if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-796843771, i9, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:334)");
                                                            }
                                                            Column5 column5 = column6;
                                                            Modifier modifierPadding2 = PaddingKt.padding(column5.weight(Modifier.INSTANCE, 1.0f, false), AlertDialogKt.TextPadding);
                                                            Alignment.Companion companion4 = Alignment.INSTANCE;
                                                            Modifier modifierAlign = column5.align(modifierPadding2, companion4.getStart());
                                                            Function2<Composer, Integer, Unit> function214 = function212;
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                                                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            function214.invoke(composer3, 0);
                                                            composer3.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer3.skipToGroupEnd();
                                                    }
                                                }, composer2, 54), composer2, 384);
                                            }
                                            composer2.endReplaceGroup();
                                            Modifier modifierAlign = column6.align(companion, companion2.getEnd());
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), r11);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, r11);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierAlign);
                                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ProvideContentColorTextStyle.m6093ProvideContentColorTextStyle3JVO9M(j12, Typography4.getValue(DialogTokens.INSTANCE.getActionLabelTextFont(), composer2, 6), function213, composer2, 0);
                                            composer2.endNode();
                                            composer2.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 12582912 | (i72 & 112) | (i72 & 896) | ((i4 >> 9) & 57344), 104);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        if ((i3 & 256) == 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) != 0) {
                        }
                        if ((i4 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                    if ((i3 & 256) == 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function27 = function24;
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function26 = function23;
            if ((i3 & 16) != 0) {
            }
            function27 = function24;
            if ((i3 & 32) == 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        function26 = function23;
        if ((i3 & 16) != 0) {
        }
        function27 = function24;
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m5696AlertDialogFlowRowixp7dh8(final float f, final float f2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(586821353);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(586821353, i2, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:364)");
            }
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        final ArrayList arrayList3 = new ArrayList();
                        Ref.IntRef intRef = new Ref.IntRef();
                        Ref.IntRef intRef2 = new Ref.IntRef();
                        ArrayList arrayList4 = new ArrayList();
                        Ref.IntRef intRef3 = new Ref.IntRef();
                        Ref.IntRef intRef4 = new Ref.IntRef();
                        float f3 = f;
                        float f4 = f2;
                        int size = list.size();
                        int i3 = 0;
                        while (i3 < size) {
                            ArrayList arrayList5 = arrayList;
                            Ref.IntRef intRef5 = intRef2;
                            Placeable placeableMo7239measureBRTryo0 = list.get(i3).mo7239measureBRTryo0(j);
                            int i4 = i3;
                            Ref.IntRef intRef6 = intRef3;
                            intRef3 = intRef6;
                            int i5 = size;
                            if (measure_3p2s80s$canAddToCurrentSequence(arrayList4, intRef6, measureScope, f3, j, placeableMo7239measureBRTryo0)) {
                                arrayList = arrayList5;
                                intRef2 = intRef5;
                            } else {
                                arrayList = arrayList5;
                                intRef2 = intRef5;
                                measure_3p2s80s$startNewSequence(arrayList, intRef2, measureScope, f4, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
                            }
                            if (!arrayList4.isEmpty()) {
                                intRef3.element += measureScope.mo5010roundToPx0680j_4(f3);
                            }
                            arrayList4.add(placeableMo7239measureBRTryo0);
                            intRef3.element += placeableMo7239measureBRTryo0.getWidth();
                            intRef4.element = Math.max(intRef4.element, placeableMo7239measureBRTryo0.getHeight());
                            i3 = i4 + 1;
                            size = i5;
                        }
                        if (!arrayList4.isEmpty()) {
                            measure_3p2s80s$startNewSequence(arrayList, intRef2, measureScope, f2, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
                        }
                        final int iMax = Math.max(intRef.element, Constraints.m7977getMinWidthimpl(j));
                        int iMax2 = Math.max(intRef2.element, Constraints.m7976getMinHeightimpl(j));
                        final float f5 = f;
                        final ArrayList arrayList6 = arrayList;
                        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                List<List<Placeable>> list2 = arrayList6;
                                MeasureScope measureScope2 = measureScope;
                                float f6 = f5;
                                int i6 = iMax;
                                List<Integer> list3 = arrayList3;
                                int size2 = list2.size();
                                for (int i7 = 0; i7 < size2; i7++) {
                                    List<Placeable> list4 = list2.get(i7);
                                    int size3 = list4.size();
                                    int[] iArr = new int[size3];
                                    int i8 = 0;
                                    while (i8 < size3) {
                                        iArr[i8] = list4.get(i8).getWidth() + (i8 < CollectionsKt.getLastIndex(list4) ? measureScope2.mo5010roundToPx0680j_4(f6) : 0);
                                        i8++;
                                    }
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    int[] iArr2 = new int[size3];
                                    for (int i9 = 0; i9 < size3; i9++) {
                                        iArr2[i9] = 0;
                                    }
                                    end.arrange(measureScope2, i6, iArr, measureScope2.getLayoutDirection(), iArr2);
                                    int size4 = list4.size();
                                    for (int i10 = 0; i10 < size4; i10++) {
                                        Placeable.PlacementScope.place$default(placementScope, list4.get(i10), iArr2[i10], list3.get(i7).intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }

                    private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, long j, Placeable placeable) {
                        return list.isEmpty() || (intRef.element + measureScope.mo5010roundToPx0680j_4(f3)) + placeable.getWidth() <= Constraints.m7975getMaxWidthimpl(j);
                    }

                    private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, List<Placeable> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
                        if (!list.isEmpty()) {
                            intRef.element += measureScope.mo5010roundToPx0680j_4(f3);
                        }
                        list.add(0, CollectionsKt.toList(list2));
                        list3.add(Integer.valueOf(intRef2.element));
                        list4.add(Integer.valueOf(intRef.element));
                        intRef.element += intRef2.element;
                        intRef3.element = Math.max(intRef3.element, intRef4.element);
                        list2.clear();
                        intRef4.element = 0;
                        intRef2.element = 0;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            int i3 = (i2 >> 6) & 14;
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            int i4 = ((i3 << 6) & 896) | 6;
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 6) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$2
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

                public final void invoke(Composer composer2, int i5) {
                    AlertDialogKt.m5696AlertDialogFlowRowixp7dh8(f, f2, function2, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float getDialogMinWidth() {
        return DialogMinWidth;
    }

    public static final float getDialogMaxWidth() {
        return DialogMaxWidth;
    }

    static {
        float f = 24;
        DialogPadding = PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(f));
        float f2 = 16;
        IconPadding = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f2), 7, null);
        TitlePadding = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f2), 7, null);
        TextPadding = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 7, null);
    }
}
