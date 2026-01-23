package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes21.dex */
class SynchronizedCollection<E> implements Collection<E>, Serializable {
    private final Collection<E> collection;
    final Object lock;

    SynchronizedCollection(Collection<E> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.collection = collection;
        this.lock = this;
    }

    protected Collection<E> decorated() {
        return this.collection;
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        boolean zAdd;
        synchronized (this.lock) {
            zAdd = decorated().add(e);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean zAddAll;
        synchronized (this.lock) {
            zAddAll = decorated().addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.lock) {
            decorated().clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.lock) {
            zContains = decorated().contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        boolean zContainsAll;
        synchronized (this.lock) {
            zContainsAll = decorated().containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.lock) {
            zIsEmpty = decorated().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return decorated().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.lock) {
            zRemove = decorated().remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll;
        synchronized (this.lock) {
            zRemoveAll = decorated().removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll;
        synchronized (this.lock) {
            zRetainAll = decorated().retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.lock) {
            size = decorated().size();
        }
        return size;
    }

    public String toString() {
        String string2;
        synchronized (this.lock) {
            string2 = decorated().toString();
        }
        return string2;
    }
}
