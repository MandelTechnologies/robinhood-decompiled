package io.noties.markwon;

/* loaded from: classes14.dex */
public interface RenderProps {
    <T> T get(Prop<T> prop);

    <T> T get(Prop<T> prop, T t);

    <T> void set(Prop<T> prop, T t);
}
