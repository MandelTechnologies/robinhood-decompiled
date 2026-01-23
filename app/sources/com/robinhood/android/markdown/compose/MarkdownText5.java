package com.robinhood.android.markdown.compose;

import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.runtime.SnapshotState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: MarkdownText.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.markdown.compose.MarkdownTextKt$MarkdownAnnotatedText$1$1, reason: use source file name */
/* loaded from: classes17.dex */
final class MarkdownText5 implements PointerInputEventHandler {
    final /* synthetic */ SnapshotState<TextLayoutResult> $layoutResult$delegate;
    final /* synthetic */ Function0<Unit> $onTextClick;
    final /* synthetic */ UriHandler $uriHandler;

    MarkdownText5(SnapshotState<TextLayoutResult> snapshotState, Function0<Unit> function0, UriHandler uriHandler) {
        this.$layoutResult$delegate = snapshotState;
        this.$onTextClick = function0;
        this.$uriHandler = uriHandler;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final SnapshotState<TextLayoutResult> snapshotState = this.$layoutResult$delegate;
        final Function0<Unit> function0 = this.$onTextClick;
        final UriHandler uriHandler = this.$uriHandler;
        Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.robinhood.android.markdown.compose.MarkdownTextKt$MarkdownAnnotatedText$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarkdownText5.invoke$lambda$2(snapshotState, function0, uriHandler, (Offset) obj);
            }
        }, continuation, 7, null);
        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(SnapshotState snapshotState, Function0 function0, UriHandler uriHandler, Offset offset) {
        TextLayoutResult textLayoutResultMarkdownAnnotatedText$lambda$9 = MarkdownText4.MarkdownAnnotatedText$lambda$9(snapshotState);
        if (textLayoutResultMarkdownAnnotatedText$lambda$9 != null) {
            int iM7620getOffsetForPositionk4lQ0M = textLayoutResultMarkdownAnnotatedText$lambda$9.m7620getOffsetForPositionk4lQ0M(offset.getPackedValue());
            AnnotatedString text = textLayoutResultMarkdownAnnotatedText$lambda$9.getLayoutInput().getText();
            AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull((List) text.getStringAnnotations(iM7620getOffsetForPositionk4lQ0M, RangesKt.coerceAtMost(iM7620getOffsetForPositionk4lQ0M, StringsKt.getLastIndex(text))));
            if (range != null) {
                if (Intrinsics.areEqual(range.getTag(), "url")) {
                    uriHandler.openUri((String) range.getItem());
                }
            } else if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
