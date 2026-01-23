package com.robinhood.utils.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMarkers;

/* compiled from: Ring.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\b\u0010\f\u001a\u00020\rH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/collections/Ring;", "E", "", "maxCapacity", "", "getMaxCapacity", "()I", "pushLast", "", "element", "(Ljava/lang/Object;)Z", "pushFirst", "clear", "", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface Ring<E> extends List<E>, KMarkers {
    void clear();

    int getMaxCapacity();

    boolean pushFirst(E element);

    boolean pushLast(E element);
}
