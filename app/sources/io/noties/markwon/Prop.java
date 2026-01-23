package io.noties.markwon;

/* loaded from: classes14.dex */
public class Prop<T> {
    private final String name;

    /* renamed from: of */
    public static <T> Prop<T> m3342of(Class<T> cls, String str) {
        return new Prop<>(str);
    }

    /* renamed from: of */
    public static <T> Prop<T> m3343of(String str) {
        return new Prop<>(str);
    }

    Prop(String str) {
        this.name = str;
    }

    public T get(RenderProps renderProps) {
        return (T) renderProps.get(this);
    }

    public T get(RenderProps renderProps, T t) {
        return (T) renderProps.get(this, t);
    }

    public T require(RenderProps renderProps) {
        T t = get(renderProps);
        if (t != null) {
            return t;
        }
        throw new NullPointerException(this.name);
    }

    public void set(RenderProps renderProps, T t) {
        renderProps.set(this, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.name.equals(((Prop) obj).name);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return "Prop{name='" + this.name + "'}";
    }
}
