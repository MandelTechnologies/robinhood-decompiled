package androidx.compose.runtime;

import androidx.collection.ObjectList;
import androidx.collection.ObjectList2;
import androidx.collection.ScatterMap6;
import androidx.compose.runtime.collection.MultiValueMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Recomposer.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0019\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0086\u0002J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005R*\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007R*\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m3636d2 = {"Landroidx/compose/runtime/NestedContentMap;", "", "()V", "containerMap", "Landroidx/compose/runtime/collection/MultiValueMap;", "Landroidx/compose/runtime/MovableContentStateReference;", "Landroidx/compose/runtime/MovableContent;", "Landroidx/collection/MutableScatterMap;", "contentMap", "Landroidx/compose/runtime/NestedMovableContent;", "add", "", "content", "nestedContent", "clear", "contains", "", "key", "removeLast", "usedContainer", "reference", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.NestedContentMap, reason: use source file name */
/* loaded from: classes4.dex */
final class Recomposer2 {
    private final ScatterMap6<Object, Object> contentMap = MultiValueMap.m6403constructorimpl$default(null, 1, null);
    private final ScatterMap6<Object, Object> containerMap = MultiValueMap.m6403constructorimpl$default(null, 1, null);

    public final void add(MovableContent<Object> content, Recomposer4 nestedContent) {
        MultiValueMap.m6399addimpl(this.contentMap, content, nestedContent);
        MultiValueMap.m6399addimpl(this.containerMap, nestedContent.getContainer(), content);
    }

    public final void clear() {
        MultiValueMap.m6401clearimpl(this.contentMap);
        MultiValueMap.m6401clearimpl(this.containerMap);
    }

    public final Recomposer4 removeLast(MovableContent<Object> key) {
        Recomposer4 recomposer4 = (Recomposer4) MultiValueMap.m6411removeLastimpl(this.contentMap, key);
        if (MultiValueMap.m6408isEmptyimpl(this.contentMap)) {
            MultiValueMap.m6401clearimpl(this.containerMap);
        }
        return recomposer4;
    }

    public final boolean contains(MovableContent<Object> key) {
        return MultiValueMap.m6404containsimpl(this.contentMap, key);
    }

    public final void usedContainer(final MovableContentStateReference reference) {
        Object obj = this.containerMap.get(reference);
        if (obj != null) {
            if (obj instanceof ObjectList2) {
                ObjectList objectList = (ObjectList) obj;
                Object[] objArr = objectList.content;
                int i = objectList._size;
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj2 = objArr[i2];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                    MultiValueMap.m6412removeValueIfimpl(this.contentMap, (MovableContent) obj2, new Function1<Recomposer4, Boolean>() { // from class: androidx.compose.runtime.NestedContentMap$usedContainer$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(Recomposer4 recomposer4) {
                            return Boolean.valueOf(Intrinsics.areEqual(recomposer4.getContainer(), reference));
                        }
                    });
                }
                return;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            MultiValueMap.m6412removeValueIfimpl(this.contentMap, (MovableContent) obj, new Function1<Recomposer4, Boolean>() { // from class: androidx.compose.runtime.NestedContentMap$usedContainer$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Recomposer4 recomposer4) {
                    return Boolean.valueOf(Intrinsics.areEqual(recomposer4.getContainer(), reference));
                }
            });
        }
    }
}
