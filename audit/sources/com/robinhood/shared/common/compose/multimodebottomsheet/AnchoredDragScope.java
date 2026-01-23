package com.robinhood.shared.common.compose.multimodebottomsheet;

import kotlin.Metadata;

/* compiled from: MultiModeAnchoredDraggable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/common/compose/multimodebottomsheet/AnchoredDragScope;", "", "dragTo", "", "newOffset", "", "lastKnownVelocity", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface AnchoredDragScope {
    void dragTo(float newOffset, float lastKnownVelocity);

    /* compiled from: MultiModeAnchoredDraggable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void dragTo$default(AnchoredDragScope anchoredDragScope, float f, float f2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
            }
            if ((i & 2) != 0) {
                f2 = 0.0f;
            }
            anchoredDragScope.dragTo(f, f2);
        }
    }
}
