package com.robinhood.shared.crypto.transfer.send.memo;

import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BookCoverTextInput.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"BookCoverTextInput", "", "value", "", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.memo.BookCoverTextInputKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class BookCoverTextInput {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BookCoverTextInput$lambda$0(String str, Function1 function1, Modifier modifier, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, int i, int i2, Composer composer, int i3) {
        BookCoverTextInput(str, function1, modifier, keyboardOptions, keyboardActions, visualTransformation, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BookCoverTextInput(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        KeyboardOptions keyboardOptions2;
        int i5;
        KeyboardActions keyboardActions2;
        int i6;
        VisualTransformation visualTransformation2;
        Composer composer2;
        final Modifier modifier3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final VisualTransformation visualTransformation3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1646876135);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    keyboardOptions2 = keyboardOptions;
                    i3 |= composerStartRestartGroup.changed(keyboardOptions2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        keyboardActions2 = keyboardActions;
                        i3 |= composerStartRestartGroup.changed(keyboardActions2) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            visualTransformation2 = visualTransformation;
                            i3 |= composerStartRestartGroup.changed(visualTransformation2) ? 131072 : 65536;
                        }
                        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            KeyboardOptions keyboardOptions4 = i4 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions2;
                            KeyboardActions keyboardActions4 = i5 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                            VisualTransformation none = i6 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1646876135, i3, -1, "com.robinhood.shared.crypto.transfer.send.memo.BookCoverTextInput (BookCoverTextInput.kt:19)");
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            int i9 = i3 << 9;
                            composer2 = composerStartRestartGroup;
                            Modifier modifier4 = modifier2;
                            KeyboardActions keyboardActions5 = keyboardActions4;
                            BasicTextFieldKt.BasicTextField(value, onValueChange, modifier4, false, false, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i8).getBookCoverCapsuleSmall(), bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), keyboardOptions4, keyboardActions5, false, 3, 0, none, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) new SolidColor(bentoTheme.getColors(composerStartRestartGroup, i8).m21368getAccent0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer2, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (3670016 & i9) | (i9 & 29360128), (i3 >> 12) & 112, 46104);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            keyboardOptions3 = keyboardOptions4;
                            keyboardActions3 = keyboardActions5;
                            visualTransformation3 = none;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                            keyboardOptions3 = keyboardOptions2;
                            keyboardActions3 = keyboardActions2;
                            visualTransformation3 = visualTransformation2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.memo.BookCoverTextInputKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BookCoverTextInput.BookCoverTextInput$lambda$0(value, onValueChange, modifier3, keyboardOptions3, keyboardActions3, visualTransformation3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    visualTransformation2 = visualTransformation;
                    if ((74899 & i3) != 74898) {
                        if (i7 != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i82 = BentoTheme.$stable;
                        int i92 = i3 << 9;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier42 = modifier2;
                        KeyboardActions keyboardActions52 = keyboardActions4;
                        BasicTextFieldKt.BasicTextField(value, onValueChange, modifier42, false, false, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composerStartRestartGroup, i82).getBookCoverCapsuleSmall(), bentoTheme2.getColors(composerStartRestartGroup, i82).m21425getFg0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), keyboardOptions4, keyboardActions52, false, 3, 0, none, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) new SolidColor(bentoTheme2.getColors(composerStartRestartGroup, i82).m21368getAccent0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer2, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (3670016 & i92) | (i92 & 29360128), (i3 >> 12) & 112, 46104);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        keyboardOptions3 = keyboardOptions4;
                        keyboardActions3 = keyboardActions52;
                        visualTransformation3 = none;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                keyboardActions2 = keyboardActions;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                visualTransformation2 = visualTransformation;
                if ((74899 & i3) != 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            keyboardOptions2 = keyboardOptions;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            keyboardActions2 = keyboardActions;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            visualTransformation2 = visualTransformation;
            if ((74899 & i3) != 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        keyboardOptions2 = keyboardOptions;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        keyboardActions2 = keyboardActions;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        visualTransformation2 = visualTransformation;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
