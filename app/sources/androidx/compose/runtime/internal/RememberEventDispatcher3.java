package androidx.compose.runtime.internal;

import androidx.collection.IntList3;
import com.singular.sdk.internal.Constants;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RememberEventDispatcher.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a(\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00072\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\b"}, m3636d2 = {"swap", "", "Landroidx/collection/MutableIntList;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "", "b", "T", "", "runtime_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.runtime.internal.RememberEventDispatcherKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class RememberEventDispatcher3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void swap(List<T> list, int i, int i2) {
        T t = list.get(i);
        list.set(i, list.get(i2));
        list.set(i2, t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(IntList3 intList3, int i, int i2) {
        int i3 = intList3.get(i);
        intList3.set(i, intList3.get(i2));
        intList3.set(i2, i3);
    }
}
