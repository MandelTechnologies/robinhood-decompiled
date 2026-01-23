package androidx.compose.p011ui.text.font;

import androidx.compose.p011ui.text.font.FontListFontFamilyTypefaceAdapter6;
import androidx.compose.p011ui.text.font.FontLoadingStrategy;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\fH\u0002¨\u0006\r"}, m3636d2 = {"firstImmediatelyAvailable", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/font/Font;", "", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "createDefaultTypeface", "Lkotlin/Function1;", "ui-text_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapterKt, reason: use source file name */
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapter7 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Tuples2<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, FontListFontFamilyTypefaceAdapter6 fontListFontFamilyTypefaceAdapter6, Font3 font3, Function1<? super TypefaceRequest, ? extends Object> function1) {
        Object objInvoke;
        Object objInvoke2;
        Object objM28550constructorimpl;
        Object result;
        int size = list.size();
        List listMutableListOf = null;
        for (int i = 0; i < size; i++) {
            Font font = list.get(i);
            int loadingStrategy = font.getLoadingStrategy();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
            if (FontLoadingStrategy.m7693equalsimpl0(loadingStrategy, companion.m7697getBlockingPKNRLFQ())) {
                synchronized (fontListFontFamilyTypefaceAdapter6.cacheLock) {
                    try {
                        FontListFontFamilyTypefaceAdapter6.Key key = new FontListFontFamilyTypefaceAdapter6.Key(font, font3.getCacheKey());
                        FontListFontFamilyTypefaceAdapter6.AsyncTypefaceResult asyncTypefaceResult = (FontListFontFamilyTypefaceAdapter6.AsyncTypefaceResult) fontListFontFamilyTypefaceAdapter6.resultCache.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (FontListFontFamilyTypefaceAdapter6.AsyncTypefaceResult) fontListFontFamilyTypefaceAdapter6.permanentCache.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            objInvoke2 = asyncTypefaceResult.getResult();
                        } else {
                            Unit unit = Unit.INSTANCE;
                            try {
                                objInvoke = font3.loadBlocking(font);
                            } catch (Exception unused) {
                                objInvoke = function1.invoke(typefaceRequest);
                            }
                            Object obj = objInvoke;
                            FontListFontFamilyTypefaceAdapter6.put$default(fontListFontFamilyTypefaceAdapter6, font, font3, obj, false, 8, null);
                            objInvoke2 = obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (objInvoke2 == null) {
                    objInvoke2 = function1.invoke(typefaceRequest);
                }
                return Tuples4.m3642to(listMutableListOf, FontSynthesis_androidKt.m7722synthesizeTypefaceFxwP2eA(typefaceRequest.getFontSynthesis(), objInvoke2, font, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
            }
            if (FontLoadingStrategy.m7693equalsimpl0(loadingStrategy, companion.m7698getOptionalLocalPKNRLFQ())) {
                synchronized (fontListFontFamilyTypefaceAdapter6.cacheLock) {
                    try {
                        FontListFontFamilyTypefaceAdapter6.Key key2 = new FontListFontFamilyTypefaceAdapter6.Key(font, font3.getCacheKey());
                        FontListFontFamilyTypefaceAdapter6.AsyncTypefaceResult asyncTypefaceResult2 = (FontListFontFamilyTypefaceAdapter6.AsyncTypefaceResult) fontListFontFamilyTypefaceAdapter6.resultCache.get(key2);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (FontListFontFamilyTypefaceAdapter6.AsyncTypefaceResult) fontListFontFamilyTypefaceAdapter6.permanentCache.get(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            result = asyncTypefaceResult2.getResult();
                        } else {
                            Unit unit2 = Unit.INSTANCE;
                            try {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM28550constructorimpl = Result.m28550constructorimpl(font3.loadBlocking(font));
                            } catch (Throwable th2) {
                                Result.Companion companion3 = Result.INSTANCE;
                                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th2));
                            }
                            Object obj2 = Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl;
                            FontListFontFamilyTypefaceAdapter6.put$default(fontListFontFamilyTypefaceAdapter6, font, font3, obj2, false, 8, null);
                            result = obj2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (result != null) {
                    return Tuples4.m3642to(listMutableListOf, FontSynthesis_androidKt.m7722synthesizeTypefaceFxwP2eA(typefaceRequest.getFontSynthesis(), result, font, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                }
            } else {
                if (!FontLoadingStrategy.m7693equalsimpl0(loadingStrategy, companion.m7696getAsyncPKNRLFQ())) {
                    throw new IllegalStateException("Unknown font type " + font);
                }
                FontListFontFamilyTypefaceAdapter6.AsyncTypefaceResult asyncTypefaceResultM7679get1ASDuI8 = fontListFontFamilyTypefaceAdapter6.m7679get1ASDuI8(font, font3);
                if (asyncTypefaceResultM7679get1ASDuI8 != null) {
                    if (!FontListFontFamilyTypefaceAdapter6.AsyncTypefaceResult.m7684isPermanentFailureimpl(asyncTypefaceResultM7679get1ASDuI8.getResult()) && asyncTypefaceResultM7679get1ASDuI8.getResult() != null) {
                        return Tuples4.m3642to(listMutableListOf, FontSynthesis_androidKt.m7722synthesizeTypefaceFxwP2eA(typefaceRequest.getFontSynthesis(), asyncTypefaceResultM7679get1ASDuI8.getResult(), font, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                    }
                } else if (listMutableListOf == null) {
                    listMutableListOf = CollectionsKt.mutableListOf(font);
                } else {
                    listMutableListOf.add(font);
                }
            }
        }
        return Tuples4.m3642to(listMutableListOf, function1.invoke(typefaceRequest));
    }
}
