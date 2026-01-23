package androidx.compose.p011ui.draganddrop;

import kotlin.Metadata;

/* compiled from: DragAndDropManager.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m3636d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropManager;", "", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "target", "", "registerTargetInterest", "(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V", "", "isInterestedTarget", "(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)Z", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public interface DragAndDropManager {
    boolean isInterestedTarget(DragAndDrop target);

    void registerTargetInterest(DragAndDrop target);
}
