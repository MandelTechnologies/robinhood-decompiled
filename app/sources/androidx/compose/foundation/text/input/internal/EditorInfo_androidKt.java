package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.ImeOptions;
import androidx.compose.p011ui.text.input.KeyboardCapitalization;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EditorInfo.android.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a@\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, m3636d2 = {"hasFlag", "", "bits", "", "flag", "update", "", "Landroid/view/inputmethod/EditorInfo;", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "contentMimeTypes", "", "", "update-pLxbY9I", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/input/ImeOptions;[Ljava/lang/String;)V", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class EditorInfo_androidKt {
    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m5453updatepLxbY9I$default(EditorInfo editorInfo, CharSequence charSequence, long j, ImeOptions imeOptions, String[] strArr, int i, Object obj) {
        if ((i & 8) != 0) {
            strArr = null;
        }
        m5452updatepLxbY9I(editorInfo, charSequence, j, imeOptions, strArr);
    }

    /* renamed from: update-pLxbY9I, reason: not valid java name */
    public static final void m5452updatepLxbY9I(EditorInfo editorInfo, CharSequence charSequence, long j, ImeOptions imeOptions, String[] strArr) {
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i = 3;
        int i2 = 6;
        if (ImeAction.m7742equalsimpl0(imeAction, companion.m7746getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i2 = 0;
            }
        } else if (ImeAction.m7742equalsimpl0(imeAction, companion.m7750getNoneeUduSuo())) {
            i2 = 1;
        } else if (ImeAction.m7742equalsimpl0(imeAction, companion.m7748getGoeUduSuo())) {
            i2 = 2;
        } else if (ImeAction.m7742equalsimpl0(imeAction, companion.m7749getNexteUduSuo())) {
            i2 = 5;
        } else if (ImeAction.m7742equalsimpl0(imeAction, companion.m7751getPreviouseUduSuo())) {
            i2 = 7;
        } else if (ImeAction.m7742equalsimpl0(imeAction, companion.m7752getSearcheUduSuo())) {
            i2 = 3;
        } else if (ImeAction.m7742equalsimpl0(imeAction, companion.m7753getSendeUduSuo())) {
            i2 = 4;
        } else if (!ImeAction.m7742equalsimpl0(imeAction, companion.m7747getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i2;
        imeOptions.getPlatformImeOptions();
        LocaleListHelper.INSTANCE.setHintLocales(editorInfo, imeOptions.getHintLocales());
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m7774equalsimpl0(keyboardType, companion2.m7785getTextPjHm6EE())) {
            i = 1;
        } else if (KeyboardType.m7774equalsimpl0(keyboardType, companion2.m7778getAsciiPjHm6EE())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i = 1;
        } else if (KeyboardType.m7774equalsimpl0(keyboardType, companion2.m7781getNumberPjHm6EE())) {
            i = 2;
        } else if (!KeyboardType.m7774equalsimpl0(keyboardType, companion2.m7784getPhonePjHm6EE())) {
            if (KeyboardType.m7774equalsimpl0(keyboardType, companion2.m7787getUriPjHm6EE())) {
                i = 17;
            } else if (KeyboardType.m7774equalsimpl0(keyboardType, companion2.m7780getEmailPjHm6EE())) {
                i = 33;
            } else if (KeyboardType.m7774equalsimpl0(keyboardType, companion2.m7783getPasswordPjHm6EE())) {
                i = EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE;
            } else if (KeyboardType.m7774equalsimpl0(keyboardType, companion2.m7782getNumberPasswordPjHm6EE())) {
                i = 18;
            } else {
                if (!KeyboardType.m7774equalsimpl0(keyboardType, companion2.m7779getDecimalPjHm6EE())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i = 8194;
            }
        }
        editorInfo.inputType = i;
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m7742equalsimpl0(imeOptions.getImeAction(), companion.m7746getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m7762equalsimpl0(capitalization, companion3.m7766getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m7762equalsimpl0(capitalization, companion3.m7770getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m7762equalsimpl0(capitalization, companion3.m7768getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m7646getStartimpl(j);
        editorInfo.initialSelEnd = TextRange.m7641getEndimpl(j);
        EditorInfoCompat.setInitialSurroundingText(editorInfo, charSequence);
        if (strArr != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (StylusHandwriting_androidKt.isStylusHandwritingSupported() && !KeyboardType.m7774equalsimpl0(imeOptions.getKeyboardType(), companion2.m7783getPasswordPjHm6EE()) && !KeyboardType.m7774equalsimpl0(imeOptions.getKeyboardType(), companion2.m7782getNumberPasswordPjHm6EE())) {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, true);
            EditorInfoApi34.INSTANCE.setHandwritingGestures(editorInfo);
        } else {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, false);
        }
    }
}
