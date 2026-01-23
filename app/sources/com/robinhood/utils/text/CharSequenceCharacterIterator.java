package com.robinhood.utils.text;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.text.CharacterIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CharSequenceCharacterIterator.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\t\u0010\u001b\u001a\u00020\u0016H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006'"}, m3636d2 = {"Lcom/robinhood/utils/text/CharSequenceCharacterIterator;", "Ljava/text/CharacterIterator;", "text", "", "beginIndex", "", "endIndex", "position", "<init>", "(Ljava/lang/CharSequence;III)V", "value", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "lastIndex", "getLastIndex", "()I", "replaceText", "", "validate", "first", "", "last", "setIndex", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "current", "next", "previous", "getBeginIndex", "getEndIndex", "getIndex", "equals", "", "other", "", "hashCode", "clone", "", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CharSequenceCharacterIterator implements CharacterIterator {
    private int beginIndex;
    private int endIndex;
    private int position;
    private CharSequence text;

    public CharSequenceCharacterIterator() {
        this(null, 0, 0, 0, 15, null);
    }

    public CharSequenceCharacterIterator(CharSequence text, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.beginIndex = i;
        this.endIndex = i2;
        this.position = i3;
        this.text = text;
        validate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CharSequenceCharacterIterator(CharSequence charSequence, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        charSequence = (i4 & 1) != 0 ? "" : charSequence;
        i = (i4 & 2) != 0 ? 0 : i;
        this(charSequence, i, (i4 & 4) != 0 ? charSequence.length() : i2, (i4 & 8) != 0 ? i : i3);
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final void setText(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.text = value;
        this.beginIndex = 0;
        this.endIndex = value.length();
        this.position = 0;
    }

    public final int getLastIndex() {
        return this.endIndex - 1;
    }

    public static /* synthetic */ void replaceText$default(CharSequenceCharacterIterator charSequenceCharacterIterator, CharSequence charSequence, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = charSequence.length();
        }
        if ((i4 & 8) != 0) {
            i3 = i;
        }
        charSequenceCharacterIterator.replaceText(charSequence, i, i2, i3);
    }

    public final void replaceText(CharSequence text, int beginIndex, int endIndex, int position) {
        Intrinsics.checkNotNullParameter(text, "text");
        setText(text);
        this.beginIndex = beginIndex;
        this.endIndex = endIndex;
        this.position = position;
        validate();
    }

    private final void validate() {
        int i = this.endIndex;
        int i2 = this.beginIndex;
        if (i2 < 0 || i2 > i || i > this.text.length()) {
            throw new IllegalArgumentException(("Invalid substring range: begin=" + this.beginIndex + ", end=" + this.endIndex + ", length=" + this.text.length()).toString());
        }
        int i3 = this.beginIndex;
        int i4 = this.endIndex;
        int i5 = this.position;
        if (i3 > i5 || i5 > i4) {
            throw new IllegalArgumentException(("Invalid position " + i5 + ": begin=" + i3 + ", end=" + i4 + ", length=" + this.text.length()).toString());
        }
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.position = this.beginIndex;
        return current();
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int lastIndex = this.endIndex;
        if (lastIndex != this.beginIndex) {
            lastIndex = getLastIndex();
        }
        this.position = lastIndex;
        return current();
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int index) {
        int i = this.beginIndex;
        if (index > this.endIndex || i > index) {
            throw new IllegalArgumentException(("Invalid index: " + index).toString());
        }
        this.position = index;
        return current();
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i = this.beginIndex;
        int i2 = this.endIndex;
        int i3 = this.position;
        if (i > i3 || i3 >= i2) {
            return (char) 65535;
        }
        return this.text.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        if (this.position < getLastIndex()) {
            int i = this.position + 1;
            this.position = i;
            return this.text.charAt(i);
        }
        this.position = this.endIndex;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i = this.position;
        if (i <= this.beginIndex) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.position = i2;
        return this.text.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.beginIndex;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.endIndex;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.position;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharSequenceCharacterIterator)) {
            return false;
        }
        CharSequenceCharacterIterator charSequenceCharacterIterator = (CharSequenceCharacterIterator) other;
        return hashCode() == charSequenceCharacterIterator.hashCode() && Intrinsics.areEqual(this.text, charSequenceCharacterIterator.text) && this.position == charSequenceCharacterIterator.position && this.beginIndex == charSequenceCharacterIterator.beginIndex && this.endIndex == charSequenceCharacterIterator.endIndex;
    }

    public int hashCode() {
        return ((this.text.hashCode() ^ this.position) ^ this.beginIndex) ^ this.endIndex;
    }

    @Override // java.text.CharacterIterator
    public Void clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
