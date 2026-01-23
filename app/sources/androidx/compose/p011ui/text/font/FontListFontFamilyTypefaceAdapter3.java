package androidx.compose.p011ui.text.font;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", m3645f = "FontListFontFamilyTypefaceAdapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1, reason: use source file name */
/* loaded from: classes4.dex */
final class FontListFontFamilyTypefaceAdapter3 extends ContinuationImpl7 implements Function1<Continuation<? super Object>, Object> {
    final /* synthetic */ Font $font;
    int label;
    final /* synthetic */ FontListFontFamilyTypefaceAdapter2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontListFontFamilyTypefaceAdapter3(FontListFontFamilyTypefaceAdapter2 fontListFontFamilyTypefaceAdapter2, Font font, Continuation<? super FontListFontFamilyTypefaceAdapter3> continuation) {
        super(1, continuation);
        this.this$0 = fontListFontFamilyTypefaceAdapter2;
        this.$font = font;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FontListFontFamilyTypefaceAdapter3(this.this$0, this.$font, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
        return invoke2((Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<Object> continuation) {
        return ((FontListFontFamilyTypefaceAdapter3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        FontListFontFamilyTypefaceAdapter2 fontListFontFamilyTypefaceAdapter2 = this.this$0;
        Font font = this.$font;
        this.label = 1;
        Object objLoadWithTimeoutOrNull$ui_text_release = fontListFontFamilyTypefaceAdapter2.loadWithTimeoutOrNull$ui_text_release(font, this);
        return objLoadWithTimeoutOrNull$ui_text_release == coroutine_suspended ? coroutine_suspended : objLoadWithTimeoutOrNull$ui_text_release;
    }
}
