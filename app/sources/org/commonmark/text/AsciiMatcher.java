package org.commonmark.text;

import java.util.BitSet;

/* loaded from: classes23.dex */
public class AsciiMatcher implements CharMatcher {
    private final BitSet set;

    private AsciiMatcher(Builder builder) {
        this.set = builder.set;
    }

    @Override // org.commonmark.text.CharMatcher
    public boolean matches(char c) {
        return this.set.get(c);
    }

    public Builder newBuilder() {
        return new Builder((BitSet) this.set.clone());
    }

    public static Builder builder() {
        return new Builder(new BitSet());
    }

    public static class Builder {
        private final BitSet set;

        private Builder(BitSet bitSet) {
            this.set = bitSet;
        }

        /* renamed from: c */
        public Builder m3989c(char c) {
            if (c > 127) {
                throw new IllegalArgumentException("Can only match ASCII characters");
            }
            this.set.set(c);
            return this;
        }

        public Builder range(char c, char c2) {
            while (c <= c2) {
                m3989c(c);
                c = (char) (c + 1);
            }
            return this;
        }

        public AsciiMatcher build() {
            return new AsciiMatcher(this);
        }
    }
}
