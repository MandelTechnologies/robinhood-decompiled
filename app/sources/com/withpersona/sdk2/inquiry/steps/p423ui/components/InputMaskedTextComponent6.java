package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputMaskedTextComponent3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputMaskedTextComponent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/SecureTransformationMethod;", "Landroid/text/method/PasswordTransformationMethod;", "", "mask", "<init>", "(Ljava/lang/String;)V", "", "source", "Landroid/view/View;", "view", "getTransformation", "(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;", "Ljava/lang/String;", "getMask", "()Ljava/lang/String;", "SecureCharSequence", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.SecureTransformationMethod, reason: use source file name */
/* loaded from: classes18.dex */
final class InputMaskedTextComponent6 extends PasswordTransformationMethod {
    private final String mask;

    public InputMaskedTextComponent6(String mask) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.mask = mask;
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence source, View view) {
        if (source == null) {
            return "";
        }
        return new SecureCharSequence(this.mask, source);
    }

    /* compiled from: InputMaskedTextComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/SecureTransformationMethod$SecureCharSequence;", "", "", "mask", "source", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "Ljava/lang/String;", "getMask", "()Ljava/lang/String;", "Ljava/lang/CharSequence;", "getSource", "()Ljava/lang/CharSequence;", "getLength", "()I", "length", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.SecureTransformationMethod$SecureCharSequence */
    private static final class SecureCharSequence implements CharSequence {
        private final String mask;
        private final CharSequence source;

        public SecureCharSequence(String mask, CharSequence source) {
            Intrinsics.checkNotNullParameter(mask, "mask");
            Intrinsics.checkNotNullParameter(source, "source");
            this.mask = mask;
            this.source = source;
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i) {
            return get(i);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return getLength();
        }

        public int getLength() {
            return this.source.length();
        }

        public char get(int index) {
            if (index < this.mask.length()) {
                InputMaskedTextComponent3 inputMaskedTextComponent3FromChar = InputMaskedTextComponent3.INSTANCE.fromChar(this.mask.charAt(index));
                if (inputMaskedTextComponent3FromChar instanceof InputMaskedTextComponent3.Literal) {
                    return ((InputMaskedTextComponent3.Literal) inputMaskedTextComponent3FromChar).getChar();
                }
            }
            return (char) 8226;
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int startIndex, int endIndex) {
            return this.source.subSequence(startIndex, endIndex);
        }
    }
}
