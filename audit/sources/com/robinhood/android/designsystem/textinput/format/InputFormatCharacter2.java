package com.robinhood.android.designsystem.textinput.format;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.CharsKt;

/* compiled from: InputFormatCharacter.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.designsystem.textinput.format.InputFormatCharacter$Placeholder$isValidReplacement$isValid$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class InputFormatCharacter2 extends FunctionReferenceImpl implements Function1<Character, Boolean> {
    public static final InputFormatCharacter2 INSTANCE = new InputFormatCharacter2();

    InputFormatCharacter2() {
        super(1, CharsKt.class, "isLetterOrDigit", "isLetterOrDigit(C)Z", 1);
    }

    public final Boolean invoke(char c) {
        return Boolean.valueOf(Character.isLetterOrDigit(c));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Character ch) {
        return invoke(ch.charValue());
    }
}
