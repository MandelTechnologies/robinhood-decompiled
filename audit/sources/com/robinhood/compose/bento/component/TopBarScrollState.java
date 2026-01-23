package com.robinhood.compose.bento.component;

import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver2;
import androidx.compose.runtime.saveable.Saver5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TopBarScrollState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/TopBarScrollState;", "", "initial", "", "<init>", "(F)V", "<set-?>", "value", "getValue", "()F", "setValue", "value$delegate", "Landroidx/compose/runtime/MutableFloatState;", "opacity", "getOpacity", "showDivider", "", "getShowDivider", "()Z", "Companion", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class TopBarScrollState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<TopBarScrollState, Float> Saver = Saver2.Saver(new Function2() { // from class: com.robinhood.compose.bento.component.TopBarScrollState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return TopBarScrollState.Saver$lambda$0((Saver5) obj, (TopBarScrollState) obj2);
        }
    }, TopBarScrollState2.INSTANCE);

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final SnapshotFloatState2 value;

    public TopBarScrollState() {
        this(0.0f, 1, null);
    }

    public TopBarScrollState(float f) {
        if (0.0f > f || f > 1.0f) {
            throw new IllegalStateException("Check failed.");
        }
        this.value = SnapshotFloatState3.mutableFloatStateOf(f);
    }

    public /* synthetic */ TopBarScrollState(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f);
    }

    public final float getValue() {
        return this.value.getFloatValue();
    }

    public final void setValue(float f) {
        this.value.setFloatValue(f);
    }

    public final float getOpacity() {
        return getValue();
    }

    public final boolean getShowDivider() {
        return getValue() > 0.0f;
    }

    /* compiled from: TopBarScrollState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/TopBarScrollState$Companion;", "", "<init>", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<TopBarScrollState, Float> getSaver() {
            return TopBarScrollState.Saver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float Saver$lambda$0(Saver5 Saver2, TopBarScrollState it) {
        Intrinsics.checkNotNullParameter(Saver2, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        return Float.valueOf(it.getValue());
    }
}
