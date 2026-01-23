package com.robinhood.android.p273ui.transfers.ekiben.p274uk;

import android.graphics.Typeface;
import android.text.TextPaint;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TextPaintRegistry.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006J*\u0010\r\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u000e0\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/ui/transfers/ekiben/uk/TextPaintRegistry;", "", "defaultTextPaint", "Landroid/text/TextPaint;", "currencySymbolSet", "", "", "<init>", "(Landroid/text/TextPaint;Ljava/util/Set;)V", "map", "", "getTextPaint", "char", "textPaintMaxBy", "R", "", "selector", "Lkotlin/Function1;", "updateTextSize", "", "textSize", "", "updateTypeface", "typeface", "Landroid/graphics/Typeface;", "updateColor", ResourceTypes.COLOR, "", "lib-uk-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TextPaintRegistry {
    public static final int $stable = 8;
    private final Set<Character> currencySymbolSet;
    private final TextPaint defaultTextPaint;
    private final Map<Character, TextPaint> map;

    public TextPaintRegistry(TextPaint defaultTextPaint, Set<Character> currencySymbolSet) {
        Intrinsics.checkNotNullParameter(defaultTextPaint, "defaultTextPaint");
        Intrinsics.checkNotNullParameter(currencySymbolSet, "currencySymbolSet");
        this.defaultTextPaint = defaultTextPaint;
        this.currencySymbolSet = currencySymbolSet;
        this.map = new LinkedHashMap();
        TextPaint textPaint = new TextPaint(defaultTextPaint);
        textPaint.setTextSize(textPaint.getTextSize() / 3);
        for (Character ch : currencySymbolSet) {
            ch.charValue();
            this.map.put(ch, textPaint);
        }
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
        for (Character ch : this.currencySymbolSet) {
            ch.charValue();
            TextPaint textPaint = this.map.get(ch);
            if (textPaint != null) {
                textPaint.setTextSize(textSize / 3);
            }
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
