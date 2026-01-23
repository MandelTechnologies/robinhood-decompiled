package com.squareup.workflow1.p415ui.backstack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackStackScreen.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\b*\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001a¨\u0006!"}, m3636d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackScreen;", "", "StackedT", "bottom", "", "rest", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "R", "Lkotlin/Function1;", "transform", "map", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/workflow1/ui/backstack/BackStackScreen;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "frames", "Ljava/util/List;", "getFrames", "()Ljava/util/List;", "top", "Ljava/lang/Object;", "getTop", "()Ljava/lang/Object;", "backStack", "getBackStack", "wf1-container-common"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class BackStackScreen<StackedT> {
    private final List<StackedT> backStack;
    private final List<StackedT> frames;
    private final StackedT top;

    public BackStackScreen(StackedT bottom, List<? extends StackedT> rest) {
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(rest, "rest");
        List<StackedT> listPlus = CollectionsKt.plus((Collection) CollectionsKt.listOf(bottom), (Iterable) rest);
        this.frames = listPlus;
        this.top = (StackedT) CollectionsKt.last((List) listPlus);
        this.backStack = listPlus.subList(0, listPlus.size() - 1);
    }

    public final List<StackedT> getFrames() {
        return this.frames;
    }

    public final StackedT getTop() {
        return this.top;
    }

    public final List<StackedT> getBackStack() {
        return this.backStack;
    }

    public final <R> BackStackScreen<R> map(Function1<? super StackedT, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        List<StackedT> list = this.frames;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke((Object) it.next()));
        }
        return BackStackScreen2.toBackStackScreen(arrayList);
    }

    public boolean equals(Object other) {
        BackStackScreen backStackScreen = other instanceof BackStackScreen ? (BackStackScreen) other : null;
        return Intrinsics.areEqual(backStackScreen != null ? backStackScreen.frames : null, this.frames);
    }

    public int hashCode() {
        return this.frames.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) BackStackScreen.class.getSimpleName());
        sb.append('(');
        sb.append(this.frames);
        sb.append(')');
        return sb.toString();
    }
}
