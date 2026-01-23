package androidx.compose.p011ui.text.font;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.ui.text.font.AsyncFontListLoader", m3645f = "FontListFontFamilyTypefaceAdapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE}, m3647m = "loadWithTimeoutOrNull$ui_text_release")
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1, reason: use source file name */
/* loaded from: classes4.dex */
final class FontListFontFamilyTypefaceAdapter4 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FontListFontFamilyTypefaceAdapter2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontListFontFamilyTypefaceAdapter4(FontListFontFamilyTypefaceAdapter2 fontListFontFamilyTypefaceAdapter2, Continuation<? super FontListFontFamilyTypefaceAdapter4> continuation) {
        super(continuation);
        this.this$0 = fontListFontFamilyTypefaceAdapter2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadWithTimeoutOrNull$ui_text_release(null, this);
    }
}
