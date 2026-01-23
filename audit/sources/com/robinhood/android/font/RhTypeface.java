package com.robinhood.android.font;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RhTypeface.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0086\u0002J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\u00182\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0086\u0002J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\u00192\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0086\u0002J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u000e\b\u0004\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cH\u0082\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/font/RhTypeface;", "", "fontRes", "", "<init>", "(Ljava/lang/String;II)V", "getFontRes", "()I", "REGULAR", "MEDIUM", "MEDIUM_CONDENSED", "BOLD", "MONOSPACED", "DISPLAY_MEDIUM", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "provideDelegate", "Lkotlin/Lazy;", "thisRef", "Landroid/app/Activity;", "property", "Lkotlin/reflect/KProperty;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", "lazyDelegate", "getContext", "Lkotlin/Function0;", "lib-fonts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RhTypeface {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RhTypeface[] $VALUES;
    private final int fontRes;
    public static final RhTypeface REGULAR = new RhTypeface("REGULAR", 0, C16915R.font.capsule_sans_text_book);
    public static final RhTypeface MEDIUM = new RhTypeface("MEDIUM", 1, C16915R.font.capsule_sans_medium);
    public static final RhTypeface MEDIUM_CONDENSED = new RhTypeface("MEDIUM_CONDENSED", 2, C16915R.font.capsule_sans_medium);
    public static final RhTypeface BOLD = new RhTypeface("BOLD", 3, C16915R.font.capsule_sans_text_bold);
    public static final RhTypeface MONOSPACED = new RhTypeface("MONOSPACED", 4, C16915R.font.capsule_sans_text_mono);
    public static final RhTypeface DISPLAY_MEDIUM = new RhTypeface("DISPLAY_MEDIUM", 5, C16915R.font.capsule_sans_display_medium);

    private static final /* synthetic */ RhTypeface[] $values() {
        return new RhTypeface[]{REGULAR, MEDIUM, MEDIUM_CONDENSED, BOLD, MONOSPACED, DISPLAY_MEDIUM};
    }

    public static EnumEntries<RhTypeface> getEntries() {
        return $ENTRIES;
    }

    private RhTypeface(String str, int i, int i2) {
        this.fontRes = i2;
    }

    public final int getFontRes() {
        return this.fontRes;
    }

    static {
        RhTypeface[] rhTypefaceArr$values = $values();
        $VALUES = rhTypefaceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rhTypefaceArr$values);
    }

    public final Typeface load(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Typeface font = ContextsUiExtensions.getFont(context, this.fontRes);
        Intrinsics.checkNotNull(font);
        return font;
    }

    private final Lazy<Typeface> lazyDelegate(final Function0<? extends Context> getContext) {
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<Typeface>() { // from class: com.robinhood.android.font.RhTypeface.lazyDelegate.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Typeface invoke() {
                return RhTypeface.this.load(getContext.invoke());
            }
        });
    }

    public final Lazy<Typeface> provideDelegate(final Activity thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<Typeface>() { // from class: com.robinhood.android.font.RhTypeface$provideDelegate$$inlined$lazyDelegate$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Typeface invoke() {
                return this.this$0.load(thisRef);
            }
        });
    }

    public final Lazy<Typeface> provideDelegate(final View thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<Typeface>() { // from class: com.robinhood.android.font.RhTypeface$provideDelegate$$inlined$lazyDelegate$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Typeface invoke() {
                return this.this$0.load(thisRef.getContext());
            }
        });
    }

    public final Lazy<Typeface> provideDelegate(final Fragment thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<Typeface>() { // from class: com.robinhood.android.font.RhTypeface$provideDelegate$$inlined$lazyDelegate$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Typeface invoke() {
                return this.this$0.load(thisRef.requireContext());
            }
        });
    }

    public static RhTypeface valueOf(String str) {
        return (RhTypeface) Enum.valueOf(RhTypeface.class, str);
    }

    public static RhTypeface[] values() {
        return (RhTypeface[]) $VALUES.clone();
    }
}
