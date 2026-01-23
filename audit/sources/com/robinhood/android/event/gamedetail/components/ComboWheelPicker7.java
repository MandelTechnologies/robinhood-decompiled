package com.robinhood.android.event.gamedetail.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver2;
import androidx.compose.runtime.saveable.Saver5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ComboWheelPicker.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\r\u0010\u000e*\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00118@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010%\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00118@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010$\u001a\u0004\b&\u0010 \"\u0004\b'\u0010\"¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/ComboWheelPickerState;", "", "initialSelectedIndex", "", "<init>", "(I)V", "selectedIndexState", "Landroidx/compose/runtime/MutableState;", "getSelectedIndexState$feature_game_detail_externalDebug", "()Landroidx/compose/runtime/MutableState;", "currentSelectedIndex", "getCurrentSelectedIndex$delegate", "(Lcom/robinhood/android/event/gamedetail/components/ComboWheelPickerState;)Ljava/lang/Object;", "getCurrentSelectedIndex", "()I", "scrollOffset", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "getScrollOffset$feature_game_detail_externalDebug", "()Landroidx/compose/animation/core/Animatable;", "<set-?>", "", "isDragging", "isDragging$feature_game_detail_externalDebug", "()Z", "setDragging$feature_game_detail_externalDebug", "(Z)V", "isDragging$delegate", "Landroidx/compose/runtime/MutableState;", "dragOffset", "getDragOffset$feature_game_detail_externalDebug", "()F", "setDragOffset$feature_game_detail_externalDebug", "(F)V", "dragOffset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "velocity", "getVelocity$feature_game_detail_externalDebug", "setVelocity$feature_game_detail_externalDebug", "velocity$delegate", "Companion", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.components.ComboWheelPickerState, reason: use source file name */
/* loaded from: classes3.dex */
public final class ComboWheelPicker7 {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<ComboWheelPicker7, Integer> Saver = Saver2.Saver(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComboWheelPicker7.Saver$lambda$0((Saver5) obj, (ComboWheelPicker7) obj2);
        }
    }, new Function1() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ComboWheelPicker7.Saver$lambda$1(((Integer) obj).intValue());
        }
    });

    /* renamed from: dragOffset$delegate, reason: from kotlin metadata */
    private final SnapshotFloatState2 dragOffset;

    /* renamed from: isDragging$delegate, reason: from kotlin metadata */
    private final SnapshotState isDragging;
    private final Animatable<Float, AnimationVectors2> scrollOffset;
    private final SnapshotState<Integer> selectedIndexState;

    /* renamed from: velocity$delegate, reason: from kotlin metadata */
    private final SnapshotFloatState2 velocity;

    public ComboWheelPicker7() {
        this(0, 1, null);
    }

    public ComboWheelPicker7(int i) {
        this.selectedIndexState = SnapshotState3.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
        this.scrollOffset = Animatable2.Animatable$default(getCurrentSelectedIndex() * 110.0f, 0.0f, 2, null);
        this.isDragging = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.dragOffset = SnapshotFloatState3.mutableFloatStateOf(0.0f);
        this.velocity = SnapshotFloatState3.mutableFloatStateOf(0.0f);
    }

    public /* synthetic */ ComboWheelPicker7(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final SnapshotState<Integer> getSelectedIndexState$feature_game_detail_externalDebug() {
        return this.selectedIndexState;
    }

    public final int getCurrentSelectedIndex() {
        return this.selectedIndexState.getValue().intValue();
    }

    public final Animatable<Float, AnimationVectors2> getScrollOffset$feature_game_detail_externalDebug() {
        return this.scrollOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging$feature_game_detail_externalDebug() {
        return ((Boolean) this.isDragging.getValue()).booleanValue();
    }

    public final void setDragging$feature_game_detail_externalDebug(boolean z) {
        this.isDragging.setValue(Boolean.valueOf(z));
    }

    public final float getDragOffset$feature_game_detail_externalDebug() {
        return this.dragOffset.getFloatValue();
    }

    public final void setDragOffset$feature_game_detail_externalDebug(float f) {
        this.dragOffset.setFloatValue(f);
    }

    public final float getVelocity$feature_game_detail_externalDebug() {
        return this.velocity.getFloatValue();
    }

    public final void setVelocity$feature_game_detail_externalDebug(float f) {
        this.velocity.setFloatValue(f);
    }

    /* compiled from: ComboWheelPicker.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/ComboWheelPickerState$Companion;", "", "<init>", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/robinhood/android/event/gamedetail/components/ComboWheelPickerState;", "", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.gamedetail.components.ComboWheelPickerState$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<ComboWheelPicker7, Integer> getSaver() {
            return ComboWheelPicker7.Saver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer Saver$lambda$0(Saver5 Saver2, ComboWheelPicker7 it) {
        Intrinsics.checkNotNullParameter(Saver2, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.selectedIndexState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComboWheelPicker7 Saver$lambda$1(int i) {
        return new ComboWheelPicker7(i);
    }
}
