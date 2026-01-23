package com.robinhood.android.tickerinputview;

import android.graphics.Typeface;
import android.text.TextPaint;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TextPaintRegistry.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bJ*\u0010\u000b\u001a\u00020\u0003\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\f0\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/tickerinputview/TextPaintRegistry;", "", "defaultTextPaint", "Landroid/text/TextPaint;", "<init>", "(Landroid/text/TextPaint;)V", "map", "", "", "getTextPaint", "char", "textPaintMaxBy", "R", "", "selector", "Lkotlin/Function1;", "updateTextSize", "", "textSize", "", "updateTypeface", "typeface", "Landroid/graphics/Typeface;", "updateColor", ResourceTypes.COLOR, "", "lib-ticker-input-view_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TextPaintRegistry {
    public static final int $stable = 8;
    private final TextPaint defaultTextPaint;
    private final Map<Character, TextPaint> map;

    public TextPaintRegistry(TextPaint defaultTextPaint) {
        Intrinsics.checkNotNullParameter(defaultTextPaint, "defaultTextPaint");
        this.defaultTextPaint = defaultTextPaint;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.map = linkedHashMap;
        TextPaint textPaint = new TextPaint(defaultTextPaint);
        textPaint.setTextSize(textPaint.getTextSize() / 3);
        linkedHashMap.put(Character.valueOf(TickerInputView.CURRENCY_SYMBOL), textPaint);
        linkedHashMap.put(Character.valueOf(TickerInputView.PERCENT_SYMBOL), textPaint);
    }

    public final TextPaint getTextPaint(char c) {
        TextPaint textPaint = this.map.get(Character.valueOf(c));
        return textPaint == null ? this.defaultTextPaint : textPaint;
    }

    public final <R extends Comparable<? super R>> TextPaint textPaintMaxBy(Function1<? super TextPaint, ? extends R> selector) {
        Object obj;
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator it = CollectionsKt.plus((Collection<? extends TextPaint>) this.map.values(), this.defaultTextPaint).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke((TextPaint) next);
                do {
                    Object next2 = it.next();
                    R rInvoke2 = selector.invoke((TextPaint) next2);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        next = next2;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Intrinsics.checkNotNull(obj);
        return (TextPaint) obj;
    }

    public final void updateTextSize(float textSize) {
        this.defaultTextPaint.setTextSize(textSize);
        TextPaint textPaint = this.map.get(Character.valueOf(TickerInputView.CURRENCY_SYMBOL));
        if (textPaint != null) {
            textPaint.setTextSize(textSize / 3);
        }
        TextPaint textPaint2 = this.map.get(Character.valueOf(TickerInputView.PERCENT_SYMBOL));
        if (textPaint2 != null) {
            textPaint2.setTextSize(textSize / 3);
        }
    }

    public final void updateTypeface(Typeface typeface) {
        this.defaultTextPaint.setTypeface(typeface);
        Iterator<T> it = this.map.values().iterator();
        while (it.hasNext()) {
            ((TextPaint) it.next()).setTypeface(typeface);
        }
    }

    public final void updateColor(int color) {
        this.defaultTextPaint.setColor(color);
        Iterator<T> it = this.map.values().iterator();
        while (it.hasNext()) {
            ((TextPaint) it.next()).setColor(color);
        }
    }
}
