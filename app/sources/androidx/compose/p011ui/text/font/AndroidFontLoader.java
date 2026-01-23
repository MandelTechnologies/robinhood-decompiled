package androidx.compose.p011ui.text.font;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.compose.p011ui.text.font.FontLoadingStrategy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AndroidFontLoader.android.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/Object;", "kotlin.jvm.PlatformType", "awaitLoad", "Landroid/graphics/Typeface;", "font", "Landroidx/compose/ui/text/font/Font;", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidFontLoader implements Font3 {
    private final Object cacheKey;
    private final Context context;

    /* compiled from: AndroidFontLoader.android.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.ui.text.font.AndroidFontLoader", m3645f = "AndroidFontLoader.android.kt", m3646l = {55, 57}, m3647m = "awaitLoad")
    /* renamed from: androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 */
    /* loaded from: classes4.dex */
    static final class C19841 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C19841(Continuation<? super C19841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidFontLoader.this.awaitLoad(null, this);
        }
    }

    public AndroidFontLoader(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override // androidx.compose.p011ui.text.font.Font3
    public Typeface loadBlocking(Font font) throws Resources.NotFoundException {
        Object objM28550constructorimpl;
        Typeface typefaceLoad;
        if (font instanceof AndroidFont) {
            ((AndroidFont) font).getTypefaceLoader();
            throw null;
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
        if (FontLoadingStrategy.m7693equalsimpl0(loadingStrategy, companion.m7697getBlockingPKNRLFQ())) {
            typefaceLoad = AndroidFontLoader_androidKt.load((ResourceFont) font, this.context);
        } else if (FontLoadingStrategy.m7693equalsimpl0(loadingStrategy, companion.m7698getOptionalLocalPKNRLFQ())) {
            try {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(AndroidFontLoader_androidKt.load((ResourceFont) font, this.context));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            typefaceLoad = (Typeface) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
        } else {
            if (FontLoadingStrategy.m7693equalsimpl0(loadingStrategy, companion.m7696getAsyncPKNRLFQ())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            }
            throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m7695toStringimpl(font.getLoadingStrategy())));
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(typefaceLoad, ((ResourceFont) font).getVariationSettings(), this.context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p011ui.text.font.Font3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitLoad(Font font, Continuation<? super Typeface> continuation) throws Resources.NotFoundException {
        C19841 c19841;
        AndroidFontLoader androidFontLoader;
        if (continuation instanceof C19841) {
            c19841 = (C19841) continuation;
            int i = c19841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19841.label = i - Integer.MIN_VALUE;
            } else {
                c19841 = new C19841(continuation);
            }
        }
        Object objLoadAsync = c19841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19841.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoadAsync);
            if (font instanceof AndroidFont) {
                ((AndroidFont) font).getTypefaceLoader();
                c19841.label = 1;
                throw null;
            }
            if (font instanceof ResourceFont) {
                Context context = this.context;
                c19841.L$0 = this;
                c19841.L$1 = font;
                c19841.label = 2;
                objLoadAsync = AndroidFontLoader_androidKt.loadAsync((ResourceFont) font, context, c19841);
                if (objLoadAsync == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidFontLoader = this;
            } else {
                throw new IllegalArgumentException("Unknown font type: " + font);
            }
        } else {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objLoadAsync);
                return objLoadAsync;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            font = (Font) c19841.L$1;
            androidFontLoader = (AndroidFontLoader) c19841.L$0;
            ResultKt.throwOnFailure(objLoadAsync);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings((Typeface) objLoadAsync, ((ResourceFont) font).getVariationSettings(), androidFontLoader.context);
    }

    @Override // androidx.compose.p011ui.text.font.Font3
    public Object getCacheKey() {
        return this.cacheKey;
    }
}
