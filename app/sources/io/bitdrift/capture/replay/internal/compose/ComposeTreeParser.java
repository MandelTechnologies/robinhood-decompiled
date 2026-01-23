package io.bitdrift.capture.replay.internal.compose;

import android.view.View;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.platform.AndroidComposeView;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsActions;
import androidx.compose.p011ui.semantics.SemanticsConfiguration;
import androidx.compose.p011ui.semantics.SemanticsConfiguration2;
import androidx.compose.p011ui.semantics.SemanticsNode;
import androidx.compose.p011ui.semantics.SemanticsProperties;
import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.p011ui.unit.IntSize2;
import io.bitdrift.capture.replay.ReplayType;
import io.bitdrift.capture.replay.SessionReplayController;
import io.bitdrift.capture.replay.compose.CaptureModifier;
import io.bitdrift.capture.replay.internal.ReplayRect;
import io.bitdrift.capture.replay.internal.ScannableView;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* compiled from: ComposeTreeParser.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0010J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0002J\f\u0010\u0014\u001a\u00020\u000e*\u00020\nH\u0002R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\t*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/compose/ComposeTreeParser;", "", "()V", "mightBeComposeView", "", "Landroid/view/View;", "getMightBeComposeView$platform_jvm_replay_lib_kt", "(Landroid/view/View;)Z", "unclippedGlobalBounds", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/semantics/SemanticsNode;", "getUnclippedGlobalBounds", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/geometry/Rect;", "parse", "Lio/bitdrift/capture/replay/internal/ScannableView;", "androidComposeView", "parse$platform_jvm_replay_lib_kt", "toReplayType", "Lio/bitdrift/capture/replay/ReplayType;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "toScannableView", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ComposeTreeParser {
    public static final ComposeTreeParser INSTANCE = new ComposeTreeParser();

    private ComposeTreeParser() {
    }

    public final boolean getMightBeComposeView$platform_jvm_replay_lib_kt(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view instanceof AndroidComposeView;
    }

    public final ScannableView parse$platform_jvm_replay_lib_kt(View androidComposeView) {
        Intrinsics.checkNotNullParameter(androidComposeView, "androidComposeView");
        if (!(androidComposeView instanceof AndroidComposeView)) {
            SessionReplayController.C45498L.INSTANCE.m3327e(null, "View passed to ComposeTreeParser.parse() is not an AndroidComposeView. view=" + androidComposeView.getClass().getName());
            return ScannableView.IgnoredComposeView.INSTANCE;
        }
        SemanticsNode unmergedRootSemanticsNode = ((AndroidComposeView) androidComposeView).getSemanticsOwner().getUnmergedRootSemanticsNode();
        SessionReplayController.C45498L.INSTANCE.m3326d("Found Compose SemanticsNode root. Parsing Compose tree.");
        return toScannableView(unmergedRootSemanticsNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScannableView toScannableView(SemanticsNode semanticsNode) {
        ReplayType replayType;
        boolean z = (semanticsNode.getLayoutNode().isPlaced() && semanticsNode.getLayoutNode().isAttached()) ? false : true;
        Boolean bool = (Boolean) SemanticsConfiguration2.getOrNull(semanticsNode.getUnmergedConfig(), CaptureModifier.INSTANCE.getCaptureIgnore$platform_jvm_replay_lib_kt());
        boolean z2 = (semanticsNode.isTransparent$ui_release() || semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) ? false : true;
        if (z) {
            return ScannableView.IgnoredComposeView.INSTANCE;
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                return ScannableView.IgnoredComposeView.INSTANCE;
            }
            replayType = ReplayType.Ignore.INSTANCE;
        } else if (!z2) {
            replayType = ReplayType.TransparentView.INSTANCE;
        } else {
            replayType = toReplayType(semanticsNode.getUnmergedConfig());
        }
        ReplayType replayType2 = replayType;
        View interopView = semanticsNode.getLayoutNode().getInteropView();
        if (Intrinsics.areEqual(replayType2, ReplayType.View.INSTANCE) && interopView != null) {
            return new ScannableView.AndroidView(interopView, false);
        }
        return new ScannableView.ComposeView(new ReplayRect(replayType2, (int) getUnclippedGlobalBounds(semanticsNode).getLeft(), (int) getUnclippedGlobalBounds(semanticsNode).getTop(), (int) getUnclippedGlobalBounds(semanticsNode).getWidth(), (int) getUnclippedGlobalBounds(semanticsNode).getHeight()), "ComposeView", SequencesKt.map(CollectionsKt.asSequence(semanticsNode.getChildren()), new Function1<SemanticsNode, ScannableView>() { // from class: io.bitdrift.capture.replay.internal.compose.ComposeTreeParser.toScannableView.1
            @Override // kotlin.jvm.functions.Function1
            public final ScannableView invoke(SemanticsNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ComposeTreeParser.INSTANCE.toScannableView(it);
            }
        }));
    }

    private final ReplayType toReplayType(SemanticsConfiguration semanticsConfiguration) {
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Role role = (Role) SemanticsConfiguration2.getOrNull(semanticsConfiguration, semanticsProperties.getRole());
        if (semanticsConfiguration.contains(semanticsProperties.getText())) {
            return ReplayType.Label.INSTANCE;
        }
        if (semanticsConfiguration.contains(SemanticsActions.INSTANCE.getSetText())) {
            return ReplayType.TextInput.INSTANCE;
        }
        Role.Companion companion = Role.INSTANCE;
        if (role == null ? false : Role.m7475equalsimpl0(role.getValue(), companion.m7479getButtono7Vup1c())) {
            return ReplayType.Button.INSTANCE;
        }
        if (role == null ? false : Role.m7475equalsimpl0(role.getValue(), companion.m7483getImageo7Vup1c())) {
            return ReplayType.Image.INSTANCE;
        }
        if (role != null ? Role.m7475equalsimpl0(role.getValue(), companion.m7481getCheckboxo7Vup1c()) : false) {
            if (SemanticsConfiguration2.getOrNull(semanticsConfiguration, semanticsProperties.getToggleableState()) == ToggleableState.f174On) {
                return ReplayType.SwitchOn.INSTANCE;
            }
            return ReplayType.SwitchOff.INSTANCE;
        }
        return ReplayType.View.INSTANCE;
    }

    private final Rect getUnclippedGlobalBounds(SemanticsNode semanticsNode) {
        return Rect2.m6565Recttz77jQw(semanticsNode.m7490getPositionInWindowF1C5BW0(), IntSize2.m8067toSizeozmzZPI(semanticsNode.m7491getSizeYbymL2g()));
    }
}
