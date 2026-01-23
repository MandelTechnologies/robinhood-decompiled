package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ClickableText.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001av\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m3636d2 = {"ClickableText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "onClick", "ClickableText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ClickableTextKt {
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    @Deprecated
    /* renamed from: ClickableText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5339ClickableText4YKlhWE(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, boolean z, int i, int i2, Function1<? super TextLayoutResult, Unit> function1, final Function1<? super Integer, Unit> function12, Composer composer, final int i3, final int i4) {
        AnnotatedString annotatedString2;
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        int i8;
        int iM7958getClipgIe3tQ8;
        int i9;
        int i10;
        Composer composer2;
        final boolean z2;
        final int i11;
        final TextStyle textStyle3;
        final Function1<? super TextLayoutResult, Unit> function13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-246609449);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
            annotatedString2 = annotatedString;
        } else {
            annotatedString2 = annotatedString;
            if ((i3 & 6) == 0) {
                i5 = (composerStartRestartGroup.changed(annotatedString2) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
        }
        int i14 = i4 & 2;
        if (i14 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    textStyle2 = textStyle;
                    i5 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i5 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 != 0) {
                        if ((i3 & 24576) == 0) {
                            iM7958getClipgIe3tQ8 = i;
                            i5 |= composerStartRestartGroup.changed(iM7958getClipgIe3tQ8) ? 16384 : 8192;
                        }
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= 196608;
                        } else if ((i3 & 196608) == 0) {
                            i5 |= composerStartRestartGroup.changed(i2) ? 131072 : 65536;
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                        }
                        if ((i4 & 128) != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
                        }
                        if (composerStartRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            TextStyle textStyle4 = i6 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                            boolean z3 = i7 != 0 ? true : z;
                            if (i8 != 0) {
                                iM7958getClipgIe3tQ8 = TextOverflow.INSTANCE.m7958getClipgIe3tQ8();
                            }
                            if (i9 != 0) {
                                i13 = Integer.MAX_VALUE;
                                i12 = i10;
                            } else {
                                i12 = i10;
                                i13 = i2;
                            }
                            final Function1<? super TextLayoutResult, Unit> function14 = i12 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextLayoutResult textLayoutResult) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            } : function1;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                            }
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            boolean z4 = (29360128 & i5) == 8388608;
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z4 || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1
                                    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                        final SnapshotState<TextLayoutResult> snapshotState2 = snapshotState;
                                        final Function1<Integer, Unit> function15 = function12;
                                        Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, null, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                                m5340invokek4lQ0M(offset.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                            public final void m5340invokek4lQ0M(long j) {
                                                TextLayoutResult value = snapshotState2.getValue();
                                                if (value != null) {
                                                    function15.invoke(Integer.valueOf(value.m7620getOffsetForPositionk4lQ0M(j)));
                                                }
                                            }
                                        }, continuation, 7, null);
                                        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            Modifier modifierThen = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion2, function12, (PointerInputEventHandler) objRememberedValue2));
                            boolean z5 = (i5 & 3670016) == 1048576;
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z5 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextLayoutResult textLayoutResult) {
                                        snapshotState.setValue(textLayoutResult);
                                        function14.invoke(textLayoutResult);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composer2 = composerStartRestartGroup;
                            BasicTextKt.m5332BasicTextCL7eQgs(annotatedString2, modifierThen, textStyle4, (Function1) objRememberedValue3, iM7958getClipgIe3tQ8, z3, i13, 0, null, null, null, composer2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function13 = function14;
                            textStyle3 = textStyle4;
                            z2 = z3;
                            i11 = i13;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            z2 = z;
                            i11 = i2;
                            textStyle3 = textStyle2;
                            function13 = function1;
                        }
                        final Modifier modifier3 = modifier2;
                        final int i15 = iM7958getClipgIe3tQ8;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
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

                                public final void invoke(Composer composer3, int i16) {
                                    ClickableTextKt.m5339ClickableText4YKlhWE(annotatedString, modifier3, textStyle3, z2, i15, i11, function13, function12, composer3, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    iM7958getClipgIe3tQ8 = i;
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if (composerStartRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                    }
                    final Modifier modifier32 = modifier2;
                    final int i152 = iM7958getClipgIe3tQ8;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                }
                iM7958getClipgIe3tQ8 = i;
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if (composerStartRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                }
                final Modifier modifier322 = modifier2;
                final int i1522 = iM7958getClipgIe3tQ8;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            iM7958getClipgIe3tQ8 = i;
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if (composerStartRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
            }
            final Modifier modifier3222 = modifier2;
            final int i15222 = iM7958getClipgIe3tQ8;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        iM7958getClipgIe3tQ8 = i;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
        }
        final Modifier modifier32222 = modifier2;
        final int i152222 = iM7958getClipgIe3tQ8;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
