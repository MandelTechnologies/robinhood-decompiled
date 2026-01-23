package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: InputMaskedTextComponent.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000 \f2\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar;", "", "<init>", "()V", "match", "", "char", "", "AnyNumber", "AnyLetter", "AnyNumberOrLetter", "Literal", "Companion", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar$AnyLetter;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar$AnyNumber;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar$AnyNumberOrLetter;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar$Literal;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.MaskChar, reason: use source file name */
/* loaded from: classes18.dex */
abstract class InputMaskedTextComponent3 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ InputMaskedTextComponent3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: InputMaskedTextComponent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar$AnyNumber;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.MaskChar$AnyNumber */
    public static final /* data */ class AnyNumber extends InputMaskedTextComponent3 {
        public static final AnyNumber INSTANCE = new AnyNumber();

        public boolean equals(Object other) {
            return this == other || (other instanceof AnyNumber);
        }

        public int hashCode() {
            return 495461622;
        }

        public String toString() {
            return "AnyNumber";
        }

        private AnyNumber() {
            super(null);
        }
    }

    private InputMaskedTextComponent3() {
    }

    /* compiled from: InputMaskedTextComponent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar$AnyLetter;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.MaskChar$AnyLetter */
    public static final /* data */ class AnyLetter extends InputMaskedTextComponent3 {
        public static final AnyLetter INSTANCE = new AnyLetter();

        public boolean equals(Object other) {
            return this == other || (other instanceof AnyLetter);
        }

        public int hashCode() {
            return 423652819;
        }

        public String toString() {
            return "AnyLetter";
        }

        private AnyLetter() {
            super(null);
        }
    }

    /* compiled from: InputMaskedTextComponent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar$AnyNumberOrLetter;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.MaskChar$AnyNumberOrLetter */
    public static final /* data */ class AnyNumberOrLetter extends InputMaskedTextComponent3 {
        public static final AnyNumberOrLetter INSTANCE = new AnyNumberOrLetter();

        public boolean equals(Object other) {
            return this == other || (other instanceof AnyNumberOrLetter);
        }

        public int hashCode() {
            return 1398807295;
        }

        public String toString() {
            return "AnyNumberOrLetter";
        }

        private AnyNumberOrLetter() {
            super(null);
        }
    }

    /* compiled from: InputMaskedTextComponent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar$Literal;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar;", "", "char", "<init>", "(C)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "C", "getChar", "()C", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.MaskChar$Literal, reason: from toString */
    public static final /* data */ class Literal extends InputMaskedTextComponent3 {
        private final char char;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Literal) && this.char == ((Literal) other).char;
        }

        public int hashCode() {
            return Character.hashCode(this.char);
        }

        public String toString() {
            return "Literal(char=" + this.char + ")";
        }

        public Literal(char c) {
            super(null);
            this.char = c;
        }

        public final char getChar() {
            return this.char;
        }
    }

    /* compiled from: InputMaskedTextComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar$Companion;", "", "<init>", "()V", "fromChar", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskChar;", "char", "", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.MaskChar$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InputMaskedTextComponent3 fromChar(char c) {
            if (c == '#') {
                return AnyNumber.INSTANCE;
            }
            if (c == '*') {
                return AnyNumberOrLetter.INSTANCE;
            }
            if (c == '@') {
                return AnyLetter.INSTANCE;
            }
            return new Literal(c);
        }
    }

    public final boolean match(char c) {
        if (this instanceof AnyNumber) {
            return Character.isDigit(c);
        }
        if (this instanceof AnyLetter) {
            return Character.isLetter(c);
        }
        if (this instanceof AnyNumberOrLetter) {
            return Character.isDigit(c) || Character.isLetter(c);
        }
        if (this instanceof Literal) {
            return c == ((Literal) this).getChar();
        }
        throw new NoWhenBranchMatchedException();
    }
}
