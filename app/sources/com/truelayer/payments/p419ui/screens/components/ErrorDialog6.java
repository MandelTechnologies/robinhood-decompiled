package com.truelayer.payments.p419ui.screens.components;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.window.DialogProperties;
import androidx.compose.p011ui.window.SecureFlagPolicy;
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
import com.truelayer.payments.p419ui.theme.ModifiersKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ErrorDialog.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u001am\u0010\n\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001ag\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lkotlin/Function0;", "", "title", "message", "dismissButton", "retryButton", "onDismiss", "", "dismissOnClickOutside", "dismissOnBackPress", "ErrorDialog", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;ZZLandroidx/compose/runtime/Composer;II)V", "", "dismissButtonText", "retryButtonText", "onRetry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZLandroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.components.ErrorDialogKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ErrorDialog6 {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorDialog(final Function2<? super Composer, ? super Integer, Unit> title, final Function2<? super Composer, ? super Integer, Unit> message, final Function2<? super Composer, ? super Integer, Unit> dismissButton, Function2<? super Composer, ? super Integer, Unit> function2, final Function0<Unit> onDismiss, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final boolean z5;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(dismissButton, "dismissButton");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(322552084);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(message) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(dismissButton) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 7168) == 0) {
                function22 = function2;
                i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((i & 458752) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((i & 3670016) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                    }
                    if ((i3 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Function2<? super Composer, ? super Integer, Unit> function24 = i6 == 0 ? null : function22;
                        boolean z7 = i4 == 0 ? false : z3;
                        boolean z8 = i5 == 0 ? false : z4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(322552084, i3, -1, "com.truelayer.payments.ui.screens.components.ErrorDialog (ErrorDialog.kt:29)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight(Modifier.INSTANCE, 0.65f), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        Column6 column6 = Column6.INSTANCE;
                        int i7 = (i3 >> 12) & 14;
                        int i8 = i3 << 15;
                        composer2 = composerStartRestartGroup;
                        AndroidAlertDialog_androidKt.m5698AlertDialogOix01E0(onDismiss, function24 != null ? dismissButton : function24, null, function24 != null ? dismissButton : null, null, title, message, null, 0L, 0L, 0L, 0L, C2002Dp.m7995constructorimpl(0), new DialogProperties(z8, z7, (SecureFlagPolicy) null, 4, (DefaultConstructorMarker) null), composer2, i7 | (i8 & 458752) | (i8 & 3670016), 384, 3988);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function23 = function24;
                        z5 = z8;
                        z6 = z7;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        function23 = function22;
                        z6 = z3;
                        z5 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ErrorDialogKt.ErrorDialog.2
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
                                ErrorDialog6.ErrorDialog(title, message, dismissButton, function23, onDismiss, z6, z5, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                z4 = z2;
                if ((i3 & 2995931) == 599186) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight(Modifier.INSTANCE, 0.65f), 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                    Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(center2, centerHorizontally2, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        Column6 column62 = Column6.INSTANCE;
                        if (function24 != null) {
                        }
                        int i72 = (i3 >> 12) & 14;
                        int i82 = i3 << 15;
                        composer2 = composerStartRestartGroup;
                        AndroidAlertDialog_androidKt.m5698AlertDialogOix01E0(onDismiss, function24 != null ? dismissButton : function24, null, function24 != null ? dismissButton : null, null, title, message, null, 0L, 0L, 0L, 0L, C2002Dp.m7995constructorimpl(0), new DialogProperties(z8, z7, (SecureFlagPolicy) null, 4, (DefaultConstructorMarker) null), composer2, i72 | (i82 & 458752) | (i82 & 3670016), 384, 3988);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function23 = function24;
                        z5 = z8;
                        z6 = z7;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            z4 = z2;
            if ((i3 & 2995931) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function22 = function2;
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        z4 = z2;
        if ((i3 & 2995931) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorDialog(final String title, final String message, final String dismissButtonText, String str, final Function0<Unit> onDismiss, Function0<Unit> function0, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        int i4;
        Function0<Unit> function02;
        int i5;
        int i6;
        boolean z3;
        int i7;
        ComposableLambda composableLambda;
        final String str3;
        final Function0<Unit> function03;
        final String str4;
        final boolean z4;
        final boolean z5;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(dismissButtonText, "dismissButtonText");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-803905616);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(message) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(dismissButtonText) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 7168) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((i & 458752) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    i6 = 57344;
                    z3 = z;
                } else {
                    i6 = 57344;
                    z3 = z;
                    if ((i & 3670016) == 0) {
                        i3 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                }
                if ((i3 & 23967451) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composableLambda = null;
                    str3 = i8 == 0 ? null : str2;
                    function03 = i4 == 0 ? null : function02;
                    boolean z6 = i5 == 0 ? false : z3;
                    boolean z7 = i7 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-803905616, i3, -1, "com.truelayer.payments.ui.screens.components.ErrorDialog (ErrorDialog.kt:66)");
                    }
                    final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    if (str3 != null && function03 != null) {
                        composableLambda = ComposableLambda3.composableLambda(composerStartRestartGroup, 302546979, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ErrorDialogKt.ErrorDialog.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i9) {
                                if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(302546979, i9, -1, "com.truelayer.payments.ui.screens.components.ErrorDialog.<anonymous> (ErrorDialog.kt:80)");
                                    }
                                    Function0<Unit> function05 = function03;
                                    ButtonColors buttonColorsM5725textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m5725textButtonColorsro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondary(), 0L, 0L, composer2, ButtonDefaults.$stable << 12, 13);
                                    final String str5 = str3;
                                    ButtonKt.TextButton(function05, null, false, null, buttonColorsM5725textButtonColorsro_MJ88, null, null, null, null, ComposableLambda3.composableLambda(composer2, 2026847622, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ErrorDialogKt.ErrorDialog.3.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                            invoke(row5, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Row5 TextButton, Composer composer3, int i10) {
                                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                            if ((i10 & 81) == 16 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2026847622, i10, -1, "com.truelayer.payments.ui.screens.components.ErrorDialog.<anonymous>.<anonymous> (ErrorDialog.kt:86)");
                                            }
                                            String str6 = str5;
                                            Locale ROOT = Locale.ROOT;
                                            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                            String upperCase = str6.toUpperCase(ROOT);
                                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                            TextKt.m6028Text4IGK_g(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer2, 805306368, 494);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        });
                    }
                    int i9 = (i3 & i6) | 438;
                    int i10 = i3 >> 3;
                    int i11 = i9 | (i10 & 458752) | (i10 & 3670016);
                    String str5 = str3;
                    Function0<Unit> function05 = function03;
                    ErrorDialog(ComposableLambda3.composableLambda(composerStartRestartGroup, -118426699, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ErrorDialogKt.ErrorDialog.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i12) {
                            if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-118426699, i12, -1, "com.truelayer.payments.ui.screens.components.ErrorDialog.<anonymous> (ErrorDialog.kt:69)");
                            }
                            TextKt.m6028Text4IGK_g(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), ComposableLambda3.composableLambda(composerStartRestartGroup, -802657004, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ErrorDialogKt.ErrorDialog.5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i12) {
                            if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-802657004, i12, -1, "com.truelayer.payments.ui.screens.components.ErrorDialog.<anonymous> (ErrorDialog.kt:71)");
                                }
                                TextKt.m6028Text4IGK_g(message, ModifiersKt.verticalScroll$default(Modifier.INSTANCE, scrollStateRememberScrollState, false, null, false, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131068);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), ComposableLambda3.composableLambda(composerStartRestartGroup, -1486887309, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ErrorDialogKt.ErrorDialog.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i12) {
                            if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1486887309, i12, -1, "com.truelayer.payments.ui.screens.components.ErrorDialog.<anonymous> (ErrorDialog.kt:93)");
                                }
                                Function0<Unit> function06 = onDismiss;
                                ButtonColors buttonColorsM5725textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m5725textButtonColorsro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondary(), 0L, 0L, composer2, ButtonDefaults.$stable << 12, 13);
                                final String str6 = dismissButtonText;
                                ButtonKt.TextButton(function06, null, false, null, buttonColorsM5725textButtonColorsro_MJ88, null, null, null, null, ComposableLambda3.composableLambda(composer2, -1400916266, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ErrorDialogKt.ErrorDialog.6.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                        invoke(row5, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 TextButton, Composer composer3, int i13) {
                                        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                        if ((i13 & 81) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1400916266, i13, -1, "com.truelayer.payments.ui.screens.components.ErrorDialog.<anonymous>.<anonymous> (ErrorDialog.kt:99)");
                                        }
                                        String str7 = str6;
                                        Locale ROOT = Locale.ROOT;
                                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                        String upperCase = str7.toUpperCase(ROOT);
                                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                        TextKt.m6028Text4IGK_g(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer2, 805306368, 494);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composableLambda, onDismiss, z6, z7, composerStartRestartGroup, i11, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str4 = str5;
                    z4 = z6;
                    z5 = z7;
                    function04 = function05;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    str4 = str2;
                    z4 = z3;
                    function04 = function02;
                    z5 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ErrorDialogKt.ErrorDialog.7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i12) {
                            ErrorDialog6.ErrorDialog(title, message, dismissButtonText, str4, onDismiss, function04, z4, z5, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            function02 = function0;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i3 & 23967451) != 4793490) {
                composableLambda = null;
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                if (str3 != null) {
                    composableLambda = ComposableLambda3.composableLambda(composerStartRestartGroup, 302546979, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ErrorDialogKt.ErrorDialog.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i92) {
                            if ((i92 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(302546979, i92, -1, "com.truelayer.payments.ui.screens.components.ErrorDialog.<anonymous> (ErrorDialog.kt:80)");
                                }
                                Function0<Unit> function052 = function03;
                                ButtonColors buttonColorsM5725textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m5725textButtonColorsro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondary(), 0L, 0L, composer2, ButtonDefaults.$stable << 12, 13);
                                final String str52 = str3;
                                ButtonKt.TextButton(function052, null, false, null, buttonColorsM5725textButtonColorsro_MJ88, null, null, null, null, ComposableLambda3.composableLambda(composer2, 2026847622, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ErrorDialogKt.ErrorDialog.3.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                        invoke(row5, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 TextButton, Composer composer3, int i102) {
                                        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                        if ((i102 & 81) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2026847622, i102, -1, "com.truelayer.payments.ui.screens.components.ErrorDialog.<anonymous>.<anonymous> (ErrorDialog.kt:86)");
                                        }
                                        String str6 = str52;
                                        Locale ROOT = Locale.ROOT;
                                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                        String upperCase = str6.toUpperCase(ROOT);
                                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                        TextKt.m6028Text4IGK_g(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer2, 805306368, 494);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    });
                }
                int i92 = (i3 & i6) | 438;
                int i102 = i3 >> 3;
                int i112 = i92 | (i102 & 458752) | (i102 & 3670016);
                String str52 = str3;
                Function0<Unit> function052 = function03;
                ErrorDialog(ComposableLambda3.composableLambda(composerStartRestartGroup, -118426699, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ErrorDialogKt.ErrorDialog.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        if ((i12 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-118426699, i12, -1, "com.truelayer.payments.ui.screens.components.ErrorDialog.<anonymous> (ErrorDialog.kt:69)");
                        }
                        TextKt.m6028Text4IGK_g(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), ComposableLambda3.composableLambda(composerStartRestartGroup, -802657004, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ErrorDialogKt.ErrorDialog.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-802657004, i12, -1, "com.truelayer.payments.ui.screens.components.ErrorDialog.<anonymous> (ErrorDialog.kt:71)");
                            }
                            TextKt.m6028Text4IGK_g(message, ModifiersKt.verticalScroll$default(Modifier.INSTANCE, scrollStateRememberScrollState2, false, null, false, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131068);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), ComposableLambda3.composableLambda(composerStartRestartGroup, -1486887309, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ErrorDialogKt.ErrorDialog.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1486887309, i12, -1, "com.truelayer.payments.ui.screens.components.ErrorDialog.<anonymous> (ErrorDialog.kt:93)");
                            }
                            Function0<Unit> function06 = onDismiss;
                            ButtonColors buttonColorsM5725textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m5725textButtonColorsro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondary(), 0L, 0L, composer2, ButtonDefaults.$stable << 12, 13);
                            final String str6 = dismissButtonText;
                            ButtonKt.TextButton(function06, null, false, null, buttonColorsM5725textButtonColorsro_MJ88, null, null, null, null, ComposableLambda3.composableLambda(composer2, -1400916266, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ErrorDialogKt.ErrorDialog.6.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                    invoke(row5, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 TextButton, Composer composer3, int i13) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i13 & 81) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1400916266, i13, -1, "com.truelayer.payments.ui.screens.components.ErrorDialog.<anonymous>.<anonymous> (ErrorDialog.kt:99)");
                                    }
                                    String str7 = str6;
                                    Locale ROOT = Locale.ROOT;
                                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                    String upperCase = str7.toUpperCase(ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                    TextKt.m6028Text4IGK_g(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 805306368, 494);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composableLambda, onDismiss, z6, z7, composerStartRestartGroup, i112, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                str4 = str52;
                z4 = z6;
                z5 = z7;
                function04 = function052;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        function02 = function0;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i3 & 23967451) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
