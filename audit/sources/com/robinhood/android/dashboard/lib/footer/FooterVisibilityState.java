package com.robinhood.android.dashboard.lib.footer;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaver;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FooterVisibilityState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/footer/FooterVisibilityState;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "showFooterButton", "", "<init>", "(Z)V", "<set-?>", "getShowFooterButton", "()Z", "setShowFooterButton", "showFooterButton$delegate", "Landroidx/compose/runtime/MutableState;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "Companion", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FooterVisibilityState implements NestedScrollModifier {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<FooterVisibilityState, ?> Saver = ListSaver.listSaver(new Function2() { // from class: com.robinhood.android.dashboard.lib.footer.FooterVisibilityState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return FooterVisibilityState.Saver$lambda$0((Saver5) obj, (FooterVisibilityState) obj2);
        }
    }, new Function1() { // from class: com.robinhood.android.dashboard.lib.footer.FooterVisibilityState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return FooterVisibilityState.Saver$lambda$1((List) obj);
        }
    });

    /* renamed from: showFooterButton$delegate, reason: from kotlin metadata */
    private final SnapshotState showFooterButton;

    public FooterVisibilityState() {
        this(false, 1, null);
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPostFling-RZ2iAVY */
    public /* bridge */ /* synthetic */ Object mo5023onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        return super.mo5023onPostFlingRZ2iAVY(j, j2, continuation);
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPreFling-QWom1Mo */
    public /* bridge */ /* synthetic */ Object mo5609onPreFlingQWom1Mo(long j, Continuation continuation) {
        return super.mo5609onPreFlingQWom1Mo(j, continuation);
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPreScroll-OzD1aCk */
    public /* bridge */ /* synthetic */ long mo5298onPreScrollOzD1aCk(long j, int i) {
        return super.mo5298onPreScrollOzD1aCk(j, i);
    }

    public FooterVisibilityState(boolean z) {
        this.showFooterButton = SnapshotStateKt.mutableStateOf(Boolean.valueOf(z), SnapshotStateKt.structuralEqualityPolicy());
    }

    public /* synthetic */ FooterVisibilityState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowFooterButton() {
        return ((Boolean) this.showFooterButton.getValue()).booleanValue();
    }

    public final void setShowFooterButton(boolean z) {
        this.showFooterButton.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo5024onPostScrollDzOQY0M(long consumed, long available, int source) {
        int i = (int) (consumed & 4294967295L);
        if (Float.intBitsToFloat(i) != 0.0f) {
            setShowFooterButton(Float.intBitsToFloat(i) > 0.0f);
        }
        return Offset.INSTANCE.m6553getZeroF1C5BW0();
    }

    /* compiled from: FooterVisibilityState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/footer/FooterVisibilityState$Companion;", "", "<init>", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/robinhood/android/dashboard/lib/footer/FooterVisibilityState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<FooterVisibilityState, ?> getSaver() {
            return FooterVisibilityState.Saver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Saver$lambda$0(Saver5 listSaver, FooterVisibilityState it) {
        Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.listOf(Boolean.valueOf(it.getShowFooterButton()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FooterVisibilityState Saver$lambda$1(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return new FooterVisibilityState(((Boolean) obj).booleanValue());
    }
}
