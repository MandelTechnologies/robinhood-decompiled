package io.bitdrift.capture.replay.internal;

import android.view.View;
import io.bitdrift.capture.replay.ReplayType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: ScannableView.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/ScannableView;", "", "()V", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "displayName", "", "getDisplayName", "()Ljava/lang/String;", "AndroidView", "ComposeView", "IgnoredComposeView", "Lio/bitdrift/capture/replay/internal/ScannableView$AndroidView;", "Lio/bitdrift/capture/replay/internal/ScannableView$ComposeView;", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public abstract class ScannableView {
    public /* synthetic */ ScannableView(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Sequence<ScannableView> getChildren();

    public abstract String getDisplayName();

    private ScannableView() {
    }

    /* compiled from: ScannableView.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\fH\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/ScannableView$AndroidView;", "Lio/bitdrift/capture/replay/internal/ScannableView;", "view", "Landroid/view/View;", "skipReplayComposeViews", "", "(Landroid/view/View;Z)V", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "displayName", "", "getDisplayName", "()Ljava/lang/String;", "getView", "()Landroid/view/View;", "toString", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class AndroidView extends ScannableView {
        private final Sequence<ScannableView> children;
        private final View view;

        public final View getView() {
            return this.view;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidView(View view, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.children = ScannableView2.scannableChildren(view, z);
        }

        @Override // io.bitdrift.capture.replay.internal.ScannableView
        public String getDisplayName() {
            String simpleName = this.view.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return simpleName;
        }

        @Override // io.bitdrift.capture.replay.internal.ScannableView
        public Sequence<ScannableView> getChildren() {
            return this.children;
        }

        public String toString() {
            return AndroidView.class.getSimpleName() + '(' + getDisplayName() + ')';
        }
    }

    /* compiled from: ScannableView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/ScannableView$ComposeView;", "Lio/bitdrift/capture/replay/internal/ScannableView;", "replayRect", "Lio/bitdrift/capture/replay/internal/ReplayRect;", "displayName", "", "children", "Lkotlin/sequences/Sequence;", "(Lio/bitdrift/capture/replay/internal/ReplayRect;Ljava/lang/String;Lkotlin/sequences/Sequence;)V", "getChildren", "()Lkotlin/sequences/Sequence;", "getDisplayName", "()Ljava/lang/String;", "getReplayRect", "()Lio/bitdrift/capture/replay/internal/ReplayRect;", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static class ComposeView extends ScannableView {
        private final Sequence<ScannableView> children;
        private final String displayName;
        private final ReplayRect replayRect;

        public final ReplayRect getReplayRect() {
            return this.replayRect;
        }

        @Override // io.bitdrift.capture.replay.internal.ScannableView
        public String getDisplayName() {
            return this.displayName;
        }

        @Override // io.bitdrift.capture.replay.internal.ScannableView
        public Sequence<ScannableView> getChildren() {
            return this.children;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ComposeView(ReplayRect replayRect, String displayName, Sequence<? extends ScannableView> children) {
            super(null);
            Intrinsics.checkNotNullParameter(replayRect, "replayRect");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(children, "children");
            this.replayRect = replayRect;
            this.displayName = displayName;
            this.children = children;
        }
    }

    /* compiled from: ScannableView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/ScannableView$IgnoredComposeView;", "Lio/bitdrift/capture/replay/internal/ScannableView$ComposeView;", "()V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class IgnoredComposeView extends ComposeView {
        public static final IgnoredComposeView INSTANCE = new IgnoredComposeView();

        private IgnoredComposeView() {
            super(new ReplayRect(ReplayType.Ignore.INSTANCE, 0, 0, 0, 0), "Ignored Compose View", SequencesKt.emptySequence());
        }
    }
}
