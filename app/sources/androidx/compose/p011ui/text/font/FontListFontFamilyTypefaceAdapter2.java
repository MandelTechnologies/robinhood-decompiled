package androidx.compose.p011ui.text.font;

import androidx.compose.p011ui.text.font.TypefaceResult;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.Yield;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR+\u0010$\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010&\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, m3636d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "", "Landroidx/compose/ui/text/font/Font;", "fontList", "initialType", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "onCompletion", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/font/PlatformFontLoader;)V", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull$ui_text_release", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull", "Ljava/util/List;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "cacheable", "Z", "getCacheable$ui_text_release", "()Z", "setCacheable$ui_text_release", "(Z)V", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader, reason: use source file name */
/* loaded from: classes4.dex */
public final class FontListFontFamilyTypefaceAdapter2 implements SnapshotState4<Object> {
    private final FontListFontFamilyTypefaceAdapter6 asyncTypefaceCache;
    private boolean cacheable = true;
    private final List<Font> fontList;
    private final Function1<TypefaceResult.Immutable, Unit> onCompletion;
    private final Font3 platformFontLoader;
    private final TypefaceRequest typefaceRequest;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final SnapshotState value;

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.ui.text.font.AsyncFontListLoader", m3645f = "FontListFontFamilyTypefaceAdapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m3647m = AnalyticsStrings.NOTIF_STACK_EVENT_LOAD)
    /* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$load$1 */
    static final class C19851 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C19851(Continuation<? super C19851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FontListFontFamilyTypefaceAdapter2.this.load(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamilyTypefaceAdapter2(List<? extends Font> list, Object obj, TypefaceRequest typefaceRequest, FontListFontFamilyTypefaceAdapter6 fontListFontFamilyTypefaceAdapter6, Function1<? super TypefaceResult.Immutable, Unit> function1, Font3 font3) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = fontListFontFamilyTypefaceAdapter6;
        this.onCompletion = function1;
        this.platformFontLoader = font3;
        this.value = SnapshotState3.mutableStateOf$default(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.value.setValue(obj);
    }

    @Override // androidx.compose.runtime.SnapshotState4
    public Object getValue() {
        return this.value.getValue();
    }

    /* renamed from: getCacheable$ui_text_release, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0063, blocks: (B:35:0x00b4, B:38:0x00e8, B:20:0x005a), top: B:56:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0063, blocks: (B:35:0x00b4, B:38:0x00e8, B:20:0x005a), top: B:56:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008d -> B:45:0x0105). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fb -> B:42:0x00fc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object load(Continuation<? super Unit> continuation) throws Throwable {
        C19851 c19851;
        FontListFontFamilyTypefaceAdapter2 fontListFontFamilyTypefaceAdapter2;
        List<Font> list;
        int size;
        C19851 c198512;
        int i;
        FontListFontFamilyTypefaceAdapter2 fontListFontFamilyTypefaceAdapter22;
        FontListFontFamilyTypefaceAdapter2 fontListFontFamilyTypefaceAdapter23;
        Font font;
        List<Font> list2;
        int i2;
        if (continuation instanceof C19851) {
            c19851 = (C19851) continuation;
            int i3 = c19851.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c19851.label = i3 - Integer.MIN_VALUE;
            } else {
                c19851 = new C19851(continuation);
            }
        }
        Object obj = c19851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c19851.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                list = this.fontList;
                size = list.size();
                c198512 = c19851;
                i = 0;
                fontListFontFamilyTypefaceAdapter22 = this;
                if (i < size) {
                }
            } catch (Throwable th) {
                th = th;
                fontListFontFamilyTypefaceAdapter2 = this;
            }
        } else if (i4 == 1) {
            size = c19851.I$1;
            i2 = c19851.I$0;
            Font font2 = (Font) c19851.L$2;
            List<Font> list3 = (List) c19851.L$1;
            fontListFontFamilyTypefaceAdapter23 = (FontListFontFamilyTypefaceAdapter2) c19851.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                font = font2;
                list2 = list3;
                if (obj == null) {
                }
            } catch (Throwable th2) {
                th = th2;
                fontListFontFamilyTypefaceAdapter2 = fontListFontFamilyTypefaceAdapter23;
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = c19851.I$1;
            i2 = c19851.I$0;
            list2 = (List) c19851.L$1;
            fontListFontFamilyTypefaceAdapter2 = (FontListFontFamilyTypefaceAdapter2) c19851.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                c198512 = c19851;
                i = i2;
                list = list2;
                fontListFontFamilyTypefaceAdapter22 = fontListFontFamilyTypefaceAdapter2;
                i++;
                if (i < size) {
                    try {
                        Font font3 = list.get(i);
                        if (FontLoadingStrategy.m7693equalsimpl0(font3.getLoadingStrategy(), FontLoadingStrategy.INSTANCE.m7696getAsyncPKNRLFQ())) {
                            FontListFontFamilyTypefaceAdapter6 fontListFontFamilyTypefaceAdapter6 = fontListFontFamilyTypefaceAdapter22.asyncTypefaceCache;
                            Font3 font32 = fontListFontFamilyTypefaceAdapter22.platformFontLoader;
                            FontListFontFamilyTypefaceAdapter3 fontListFontFamilyTypefaceAdapter3 = new FontListFontFamilyTypefaceAdapter3(fontListFontFamilyTypefaceAdapter22, font3, null);
                            c198512.L$0 = fontListFontFamilyTypefaceAdapter22;
                            c198512.L$1 = list;
                            c198512.L$2 = font3;
                            c198512.I$0 = i;
                            c198512.I$1 = size;
                            c198512.label = 1;
                            Object objRunCached = fontListFontFamilyTypefaceAdapter6.runCached(font3, font32, false, fontListFontFamilyTypefaceAdapter3, c198512);
                            if (objRunCached != coroutine_suspended) {
                                fontListFontFamilyTypefaceAdapter23 = fontListFontFamilyTypefaceAdapter22;
                                font = font3;
                                c19851 = c198512;
                                list2 = list;
                                obj = objRunCached;
                                i2 = i;
                                if (obj == null) {
                                    fontListFontFamilyTypefaceAdapter23.setValue(FontSynthesis_androidKt.m7722synthesizeTypefaceFxwP2eA(fontListFontFamilyTypefaceAdapter23.typefaceRequest.getFontSynthesis(), obj, font, fontListFontFamilyTypefaceAdapter23.typefaceRequest.getFontWeight(), fontListFontFamilyTypefaceAdapter23.typefaceRequest.getFontStyle()));
                                    Unit unit = Unit.INSTANCE;
                                    boolean zIsActive = JobKt.isActive(c19851.get$context());
                                    fontListFontFamilyTypefaceAdapter23.cacheable = false;
                                    fontListFontFamilyTypefaceAdapter23.onCompletion.invoke(new TypefaceResult.Immutable(fontListFontFamilyTypefaceAdapter23.getValue(), zIsActive));
                                    return unit;
                                }
                                c19851.L$0 = fontListFontFamilyTypefaceAdapter23;
                                c19851.L$1 = list2;
                                c19851.L$2 = null;
                                c19851.I$0 = i2;
                                c19851.I$1 = size;
                                c19851.label = 2;
                                if (Yield.yield(c19851) != coroutine_suspended) {
                                    fontListFontFamilyTypefaceAdapter2 = fontListFontFamilyTypefaceAdapter23;
                                    c198512 = c19851;
                                    i = i2;
                                    list = list2;
                                    fontListFontFamilyTypefaceAdapter22 = fontListFontFamilyTypefaceAdapter2;
                                }
                            }
                            return coroutine_suspended;
                        }
                        i++;
                        if (i < size) {
                            boolean zIsActive2 = JobKt.isActive(c198512.get$context());
                            fontListFontFamilyTypefaceAdapter22.cacheable = false;
                            fontListFontFamilyTypefaceAdapter22.onCompletion.invoke(new TypefaceResult.Immutable(fontListFontFamilyTypefaceAdapter22.getValue(), zIsActive2));
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fontListFontFamilyTypefaceAdapter2 = fontListFontFamilyTypefaceAdapter22;
                        c19851 = c198512;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        boolean zIsActive3 = JobKt.isActive(c19851.get$context());
        fontListFontFamilyTypefaceAdapter2.cacheable = false;
        fontListFontFamilyTypefaceAdapter2.onCompletion.invoke(new TypefaceResult.Immutable(fontListFontFamilyTypefaceAdapter2.getValue(), zIsActive3));
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadWithTimeoutOrNull$ui_text_release(Font font, Continuation<Object> continuation) {
        FontListFontFamilyTypefaceAdapter4 fontListFontFamilyTypefaceAdapter4;
        if (continuation instanceof FontListFontFamilyTypefaceAdapter4) {
            fontListFontFamilyTypefaceAdapter4 = (FontListFontFamilyTypefaceAdapter4) continuation;
            int i = fontListFontFamilyTypefaceAdapter4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fontListFontFamilyTypefaceAdapter4.label = i - Integer.MIN_VALUE;
            } else {
                fontListFontFamilyTypefaceAdapter4 = new FontListFontFamilyTypefaceAdapter4(this, continuation);
            }
        }
        Object obj = fontListFontFamilyTypefaceAdapter4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = fontListFontFamilyTypefaceAdapter4.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            FontListFontFamilyTypefaceAdapter5 fontListFontFamilyTypefaceAdapter5 = new FontListFontFamilyTypefaceAdapter5(this, font, null);
            fontListFontFamilyTypefaceAdapter4.L$0 = font;
            fontListFontFamilyTypefaceAdapter4.label = 1;
            Object objWithTimeoutOrNull = Timeout6.withTimeoutOrNull(15000L, fontListFontFamilyTypefaceAdapter5, fontListFontFamilyTypefaceAdapter4);
            return objWithTimeoutOrNull == coroutine_suspended ? coroutine_suspended : objWithTimeoutOrNull;
        } catch (CancellationException e) {
            if (!JobKt.isActive(fontListFontFamilyTypefaceAdapter4.get$context())) {
                throw e;
            }
            return null;
        } catch (Exception e2) {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fontListFontFamilyTypefaceAdapter4.get$context().get(CoroutineExceptionHandler.INSTANCE);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(fontListFontFamilyTypefaceAdapter4.get$context(), new IllegalStateException("Unable to load font " + font, e2));
            }
            return null;
        }
    }
}
