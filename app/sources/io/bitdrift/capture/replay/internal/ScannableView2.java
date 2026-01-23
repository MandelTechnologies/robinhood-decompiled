package io.bitdrift.capture.replay.internal;

import android.view.View;
import android.view.ViewGroup;
import io.bitdrift.capture.replay.internal.ScannableView;
import io.bitdrift.capture.replay.internal.compose.ComposeTreeParser;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceBuilder2;
import kotlin.sequences.SequencesKt;

/* compiled from: ScannableView.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, m3636d2 = {"scannableChildren", "Lkotlin/sequences/Sequence;", "Lio/bitdrift/capture/replay/internal/ScannableView;", "Landroid/view/View;", "skipReplayComposeViews", "", "platform_jvm_replay-lib_kt"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.replay.internal.ScannableViewKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ScannableView2 {

    /* compiled from: ScannableView.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lio/bitdrift/capture/replay/internal/ScannableView;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.bitdrift.capture.replay.internal.ScannableViewKt$scannableChildren$1", m3645f = "ScannableView.kt", m3646l = {65, 77}, m3647m = "invokeSuspend")
    /* renamed from: io.bitdrift.capture.replay.internal.ScannableViewKt$scannableChildren$1 */
    static final class C455011 extends ContinuationImpl5 implements Function2<SequenceBuilder2<? super ScannableView>, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $skipReplayComposeViews;
        final /* synthetic */ View $this_scannableChildren;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C455011(View view, boolean z, Continuation<? super C455011> continuation) {
            super(2, continuation);
            this.$this_scannableChildren = view;
            this.$skipReplayComposeViews = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C455011 c455011 = new C455011(this.$this_scannableChildren, this.$skipReplayComposeViews, continuation);
            c455011.L$0 = obj;
            return c455011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceBuilder2<? super ScannableView> sequenceBuilder2, Continuation<? super Unit> continuation) {
            return ((C455011) create(sequenceBuilder2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        
            if (r9.yield(r1, r8) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
        
            if (r5.yield(r6, r8) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0068 -> B:31:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007e -> B:31:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int childCount;
            int i;
            SequenceBuilder2 sequenceBuilder2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceBuilder2 sequenceBuilder22 = (SequenceBuilder2) this.L$0;
                ComposeTreeParser composeTreeParser = ComposeTreeParser.INSTANCE;
                if (composeTreeParser.getMightBeComposeView$platform_jvm_replay_lib_kt(this.$this_scannableChildren) && !this.$skipReplayComposeViews) {
                    ScannableView scannableView = composeTreeParser.parse$platform_jvm_replay_lib_kt(this.$this_scannableChildren);
                    this.label = 1;
                } else {
                    View view = this.$this_scannableChildren;
                    if (!(view instanceof ViewGroup)) {
                        return Unit.INSTANCE;
                    }
                    childCount = ((ViewGroup) view).getChildCount();
                    i = 0;
                    sequenceBuilder2 = sequenceBuilder22;
                    if (i < childCount) {
                    }
                }
            } else if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                childCount = this.I$1;
                i = this.I$0;
                sequenceBuilder2 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
                i++;
                if (i < childCount) {
                    View childAt = ((ViewGroup) this.$this_scannableChildren).getChildAt(i);
                    if (childAt != null) {
                        ScannableView.AndroidView androidView = new ScannableView.AndroidView(childAt, this.$skipReplayComposeViews);
                        this.L$0 = sequenceBuilder2;
                        this.I$0 = i;
                        this.I$1 = childCount;
                        this.label = 2;
                    }
                    i++;
                    if (i < childCount) {
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence<ScannableView> scannableChildren(View view, boolean z) {
        return SequencesKt.sequence(new C455011(view, z, null));
    }
}
