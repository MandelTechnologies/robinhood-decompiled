package io.bitdrift.capture.replay.compose;

import androidx.compose.p011ui.semantics.SemanticsPropertyKey;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CaptureModifier.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lio/bitdrift/capture/replay/compose/CaptureModifier;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "CaptureIgnore", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getCaptureIgnore$platform_jvm_replay_lib_kt", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class CaptureModifier {
    public static final CaptureModifier INSTANCE = new CaptureModifier();
    private static final SemanticsPropertyKey<Boolean> CaptureIgnore = new SemanticsPropertyKey<>("CaptureIgnoreModifier", new Function2<Boolean, Boolean, Boolean>() { // from class: io.bitdrift.capture.replay.compose.CaptureModifier$CaptureIgnore$1
        public final Boolean invoke(Boolean bool, boolean z) {
            return bool;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return invoke(bool, bool2.booleanValue());
        }
    });
    public static final int $stable = SemanticsPropertyKey.$stable;

    private CaptureModifier() {
    }

    public final SemanticsPropertyKey<Boolean> getCaptureIgnore$platform_jvm_replay_lib_kt() {
        return CaptureIgnore;
    }
}
