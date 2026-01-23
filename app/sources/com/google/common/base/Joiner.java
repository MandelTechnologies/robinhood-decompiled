package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes27.dex */
public class Joiner {
    private final String separator;

    /* renamed from: on */
    public static Joiner m995on(String separator) {
        return new Joiner(separator);
    }

    /* renamed from: on */
    public static Joiner m994on(char separator) {
        return new Joiner(String.valueOf(separator));
    }

    private Joiner(String separator) {
        this.separator = (String) Preconditions.checkNotNull(separator);
    }

    public <A extends Appendable> A appendTo(A appendable, Iterator<? extends Object> parts) throws IOException {
        Preconditions.checkNotNull(appendable);
        if (parts.hasNext()) {
            appendable.append(toString(parts.next()));
            while (parts.hasNext()) {
                appendable.append(this.separator);
                appendable.append(toString(parts.next()));
            }
        }
        return appendable;
    }

    public final StringBuilder appendTo(StringBuilder builder, Iterable<? extends Object> parts) {
        return appendTo(builder, parts.iterator());
    }

    public final StringBuilder appendTo(StringBuilder builder, Iterator<? extends Object> parts) {
        try {
            appendTo((Joiner) builder, parts);
            return builder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String join(Iterable<? extends Object> parts) {
        return join(parts.iterator());
    }

    public final String join(Iterator<? extends Object> parts) {
        return appendTo(new StringBuilder(), parts).toString();
    }

    CharSequence toString(Object part) {
        java.util.Objects.requireNonNull(part);
        return part instanceof CharSequence ? (CharSequence) part : part.toString();
    }
}
