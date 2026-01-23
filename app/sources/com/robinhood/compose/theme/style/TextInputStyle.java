package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextInputStyle.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u000b\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\""}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextInputStyle;", "", "standard", "Lcom/robinhood/compose/theme/style/TextInputStyle$Style;", "hero", "textArea", "<init>", "(Lcom/robinhood/compose/theme/style/TextInputStyle$Style;Lcom/robinhood/compose/theme/style/TextInputStyle$Style;Lcom/robinhood/compose/theme/style/TextInputStyle$Style;)V", "getStandard", "()Lcom/robinhood/compose/theme/style/TextInputStyle$Style;", "getHero", "getTextArea", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InputState", "BorderSize", "Sizing", "HorizontalPadding", "Spacing", "Typography", "BorderColor", "PlaceholderColor", "StateColor", "Colors", "Style", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class TextInputStyle {
    public static final int $stable = 0;
    private final Style hero;
    private final Style standard;
    private final Style textArea;

    public static /* synthetic */ TextInputStyle copy$default(TextInputStyle textInputStyle, Style style, Style style2, Style style3, int i, Object obj) {
        if ((i & 1) != 0) {
            style = textInputStyle.standard;
        }
        if ((i & 2) != 0) {
            style2 = textInputStyle.hero;
        }
        if ((i & 4) != 0) {
            style3 = textInputStyle.textArea;
        }
        return textInputStyle.copy(style, style2, style3);
    }

    /* renamed from: component1, reason: from getter */
    public final Style getStandard() {
        return this.standard;
    }

    /* renamed from: component2, reason: from getter */
    public final Style getHero() {
        return this.hero;
    }

    /* renamed from: component3, reason: from getter */
    public final Style getTextArea() {
        return this.textArea;
    }

    public final TextInputStyle copy(Style standard, Style hero, Style textArea) {
        Intrinsics.checkNotNullParameter(standard, "standard");
        Intrinsics.checkNotNullParameter(hero, "hero");
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        return new TextInputStyle(standard, hero, textArea);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInputStyle)) {
            return false;
        }
        TextInputStyle textInputStyle = (TextInputStyle) other;
        return Intrinsics.areEqual(this.standard, textInputStyle.standard) && Intrinsics.areEqual(this.hero, textInputStyle.hero) && Intrinsics.areEqual(this.textArea, textInputStyle.textArea);
    }

    public int hashCode() {
        return (((this.standard.hashCode() * 31) + this.hero.hashCode()) * 31) + this.textArea.hashCode();
    }

    public String toString() {
        return "TextInputStyle(standard=" + this.standard + ", hero=" + this.hero + ", textArea=" + this.textArea + ")";
    }

    public TextInputStyle(Style standard, Style hero, Style textArea) {
        Intrinsics.checkNotNullParameter(standard, "standard");
        Intrinsics.checkNotNullParameter(hero, "hero");
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        this.standard = standard;
        this.hero = hero;
        this.textArea = textArea;
    }

    public final Style getStandard() {
        return this.standard;
    }

    public final Style getHero() {
        return this.hero;
    }

    public final Style getTextArea() {
        return this.textArea;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInputStyle.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextInputStyle$InputState;", "", "<init>", "(Ljava/lang/String;I)V", "Enabled", "Focused", "Success", "Error", "Disabled", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InputState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InputState[] $VALUES;
        public static final InputState Enabled = new InputState("Enabled", 0);
        public static final InputState Focused = new InputState("Focused", 1);
        public static final InputState Success = new InputState("Success", 2);
        public static final InputState Error = new InputState("Error", 3);
        public static final InputState Disabled = new InputState("Disabled", 4);

        private static final /* synthetic */ InputState[] $values() {
            return new InputState[]{Enabled, Focused, Success, Error, Disabled};
        }

        public static EnumEntries<InputState> getEntries() {
            return $ENTRIES;
        }

        private InputState(String str, int i) {
        }

        static {
            InputState[] inputStateArr$values = $values();
            $VALUES = inputStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(inputStateArr$values);
        }

        public static InputState valueOf(String str) {
            return (InputState) Enum.valueOf(InputState.class, str);
        }

        public static InputState[] values() {
            return (InputState[]) $VALUES.clone();
        }
    }

    /* compiled from: TextInputStyle.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\bJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextInputStyle$BorderSize;", "", "size", "Landroidx/compose/ui/unit/Dp;", "focusedSize", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSize-D9Ej5fM", "()F", "F", "getFocusedSize-D9Ej5fM", "get", "Landroidx/compose/runtime/State;", "focused", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-YgX7TsA", "(FF)Lcom/robinhood/compose/theme/style/TextInputStyle$BorderSize;", "equals", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BorderSize {
        public static final int $stable = 0;
        private final float focusedSize;
        private final float size;

        public /* synthetic */ BorderSize(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2);
        }

        /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
        public static /* synthetic */ BorderSize m21982copyYgX7TsA$default(BorderSize borderSize, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = borderSize.size;
            }
            if ((i & 2) != 0) {
                f2 = borderSize.focusedSize;
            }
            return borderSize.m21985copyYgX7TsA(f, f2);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSize() {
            return this.size;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getFocusedSize() {
            return this.focusedSize;
        }

        /* renamed from: copy-YgX7TsA, reason: not valid java name */
        public final BorderSize m21985copyYgX7TsA(float size, float focusedSize) {
            return new BorderSize(size, focusedSize, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BorderSize)) {
                return false;
            }
            BorderSize borderSize = (BorderSize) other;
            return C2002Dp.m7997equalsimpl0(this.size, borderSize.size) && C2002Dp.m7997equalsimpl0(this.focusedSize, borderSize.focusedSize);
        }

        public int hashCode() {
            return (C2002Dp.m7998hashCodeimpl(this.size) * 31) + C2002Dp.m7998hashCodeimpl(this.focusedSize);
        }

        public String toString() {
            return "BorderSize(size=" + C2002Dp.m7999toStringimpl(this.size) + ", focusedSize=" + C2002Dp.m7999toStringimpl(this.focusedSize) + ")";
        }

        private BorderSize(float f, float f2) {
            this.size = f;
            this.focusedSize = f2;
        }

        /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
        public final float m21987getSizeD9Ej5fM() {
            return this.size;
        }

        /* renamed from: getFocusedSize-D9Ej5fM, reason: not valid java name */
        public final float m21986getFocusedSizeD9Ej5fM() {
            return this.focusedSize;
        }

        public final SnapshotState4<C2002Dp> get(boolean z, Composer composer, int i) {
            composer.startReplaceGroup(-1724387969);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1724387969, i, -1, "com.robinhood.compose.theme.style.TextInputStyle.BorderSize.get (TextInputStyle.kt:33)");
            }
            SnapshotState4<C2002Dp> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(C2002Dp.m7993boximpl(z ? this.focusedSize : this.size), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }
    }

    /* compiled from: TextInputStyle.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextInputStyle$Sizing;", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "borderSize", "Lcom/robinhood/compose/theme/style/TextInputStyle$BorderSize;", "minHeight", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Landroidx/compose/ui/graphics/Shape;Lcom/robinhood/compose/theme/style/TextInputStyle$BorderSize;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "getBorderSize", "()Lcom/robinhood/compose/theme/style/TextInputStyle$BorderSize;", "getMinHeight-D9Ej5fM", "()F", "F", "component1", "component2", "component3", "component3-D9Ej5fM", "copy", "copy-wH6b6FI", "(Landroidx/compose/ui/graphics/Shape;Lcom/robinhood/compose/theme/style/TextInputStyle$BorderSize;F)Lcom/robinhood/compose/theme/style/TextInputStyle$Sizing;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Sizing {
        public static final int $stable = 0;
        private final BorderSize borderSize;
        private final float minHeight;
        private final Shape shape;

        public /* synthetic */ Sizing(Shape shape, BorderSize borderSize, float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(shape, borderSize, f);
        }

        /* renamed from: copy-wH6b6FI$default, reason: not valid java name */
        public static /* synthetic */ Sizing m22008copywH6b6FI$default(Sizing sizing, Shape shape, BorderSize borderSize, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                shape = sizing.shape;
            }
            if ((i & 2) != 0) {
                borderSize = sizing.borderSize;
            }
            if ((i & 4) != 0) {
                f = sizing.minHeight;
            }
            return sizing.m22010copywH6b6FI(shape, borderSize, f);
        }

        /* renamed from: component1, reason: from getter */
        public final Shape getShape() {
            return this.shape;
        }

        /* renamed from: component2, reason: from getter */
        public final BorderSize getBorderSize() {
            return this.borderSize;
        }

        /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
        public final float getMinHeight() {
            return this.minHeight;
        }

        /* renamed from: copy-wH6b6FI, reason: not valid java name */
        public final Sizing m22010copywH6b6FI(Shape shape, BorderSize borderSize, float minHeight) {
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(borderSize, "borderSize");
            return new Sizing(shape, borderSize, minHeight, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sizing)) {
                return false;
            }
            Sizing sizing = (Sizing) other;
            return Intrinsics.areEqual(this.shape, sizing.shape) && Intrinsics.areEqual(this.borderSize, sizing.borderSize) && C2002Dp.m7997equalsimpl0(this.minHeight, sizing.minHeight);
        }

        public int hashCode() {
            return (((this.shape.hashCode() * 31) + this.borderSize.hashCode()) * 31) + C2002Dp.m7998hashCodeimpl(this.minHeight);
        }

        public String toString() {
            return "Sizing(shape=" + this.shape + ", borderSize=" + this.borderSize + ", minHeight=" + C2002Dp.m7999toStringimpl(this.minHeight) + ")";
        }

        private Sizing(Shape shape, BorderSize borderSize, float f) {
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(borderSize, "borderSize");
            this.shape = shape;
            this.borderSize = borderSize;
            this.minHeight = f;
        }

        public final Shape getShape() {
            return this.shape;
        }

        public final BorderSize getBorderSize() {
            return this.borderSize;
        }

        /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
        public final float m22011getMinHeightD9Ej5fM() {
            return this.minHeight;
        }
    }

    /* compiled from: TextInputStyle.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\bJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextInputStyle$HorizontalPadding;", "", "padding", "Landroidx/compose/ui/unit/Dp;", "paddingWithIcon", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPadding-D9Ej5fM", "()F", "F", "getPaddingWithIcon-D9Ej5fM", "get", "Landroidx/compose/runtime/State;", "hasIcon", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-YgX7TsA", "(FF)Lcom/robinhood/compose/theme/style/TextInputStyle$HorizontalPadding;", "equals", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HorizontalPadding {
        public static final int $stable = 0;
        private final float padding;
        private final float paddingWithIcon;

        public /* synthetic */ HorizontalPadding(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2);
        }

        /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
        public static /* synthetic */ HorizontalPadding m21994copyYgX7TsA$default(HorizontalPadding horizontalPadding, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = horizontalPadding.padding;
            }
            if ((i & 2) != 0) {
                f2 = horizontalPadding.paddingWithIcon;
            }
            return horizontalPadding.m21997copyYgX7TsA(f, f2);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getPadding() {
            return this.padding;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getPaddingWithIcon() {
            return this.paddingWithIcon;
        }

        /* renamed from: copy-YgX7TsA, reason: not valid java name */
        public final HorizontalPadding m21997copyYgX7TsA(float padding, float paddingWithIcon) {
            return new HorizontalPadding(padding, paddingWithIcon, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HorizontalPadding)) {
                return false;
            }
            HorizontalPadding horizontalPadding = (HorizontalPadding) other;
            return C2002Dp.m7997equalsimpl0(this.padding, horizontalPadding.padding) && C2002Dp.m7997equalsimpl0(this.paddingWithIcon, horizontalPadding.paddingWithIcon);
        }

        public int hashCode() {
            return (C2002Dp.m7998hashCodeimpl(this.padding) * 31) + C2002Dp.m7998hashCodeimpl(this.paddingWithIcon);
        }

        public String toString() {
            return "HorizontalPadding(padding=" + C2002Dp.m7999toStringimpl(this.padding) + ", paddingWithIcon=" + C2002Dp.m7999toStringimpl(this.paddingWithIcon) + ")";
        }

        private HorizontalPadding(float f, float f2) {
            this.padding = f;
            this.paddingWithIcon = f2;
        }

        /* renamed from: getPadding-D9Ej5fM, reason: not valid java name */
        public final float m21998getPaddingD9Ej5fM() {
            return this.padding;
        }

        /* renamed from: getPaddingWithIcon-D9Ej5fM, reason: not valid java name */
        public final float m21999getPaddingWithIconD9Ej5fM() {
            return this.paddingWithIcon;
        }

        public final SnapshotState4<C2002Dp> get(boolean z, Composer composer, int i) {
            composer.startReplaceGroup(1489003543);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1489003543, i, -1, "com.robinhood.compose.theme.style.TextInputStyle.HorizontalPadding.get (TextInputStyle.kt:52)");
            }
            SnapshotState4<C2002Dp> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(C2002Dp.m7993boximpl(z ? this.paddingWithIcon : this.padding), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }
    }

    /* compiled from: TextInputStyle.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u000eJB\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0007\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000e¨\u0006&"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextInputStyle$Spacing;", "", "containerHorizontalPadding", "Lcom/robinhood/compose/theme/style/TextInputStyle$HorizontalPadding;", "containerVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "containerIconSpacing", "messageIconSpacing", "verticalSpacing", "<init>", "(Lcom/robinhood/compose/theme/style/TextInputStyle$HorizontalPadding;FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContainerHorizontalPadding", "()Lcom/robinhood/compose/theme/style/TextInputStyle$HorizontalPadding;", "getContainerVerticalPadding-D9Ej5fM", "()F", "F", "getContainerIconSpacing-D9Ej5fM", "getMessageIconSpacing-D9Ej5fM", "getVerticalSpacing-D9Ej5fM", "component1", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component4-D9Ej5fM", "component5", "component5-D9Ej5fM", "copy", "copy-qDBjuR0", "(Lcom/robinhood/compose/theme/style/TextInputStyle$HorizontalPadding;FFFF)Lcom/robinhood/compose/theme/style/TextInputStyle$Spacing;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Spacing {
        public static final int $stable = 0;
        private final HorizontalPadding containerHorizontalPadding;
        private final float containerIconSpacing;
        private final float containerVerticalPadding;
        private final float messageIconSpacing;
        private final float verticalSpacing;

        public /* synthetic */ Spacing(HorizontalPadding horizontalPadding, float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
            this(horizontalPadding, f, f2, f3, f4);
        }

        /* renamed from: copy-qDBjuR0$default, reason: not valid java name */
        public static /* synthetic */ Spacing m22012copyqDBjuR0$default(Spacing spacing, HorizontalPadding horizontalPadding, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                horizontalPadding = spacing.containerHorizontalPadding;
            }
            if ((i & 2) != 0) {
                f = spacing.containerVerticalPadding;
            }
            if ((i & 4) != 0) {
                f2 = spacing.containerIconSpacing;
            }
            if ((i & 8) != 0) {
                f3 = spacing.messageIconSpacing;
            }
            if ((i & 16) != 0) {
                f4 = spacing.verticalSpacing;
            }
            float f5 = f4;
            float f6 = f2;
            return spacing.m22017copyqDBjuR0(horizontalPadding, f, f6, f3, f5);
        }

        /* renamed from: component1, reason: from getter */
        public final HorizontalPadding getContainerHorizontalPadding() {
            return this.containerHorizontalPadding;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getContainerVerticalPadding() {
            return this.containerVerticalPadding;
        }

        /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
        public final float getContainerIconSpacing() {
            return this.containerIconSpacing;
        }

        /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
        public final float getMessageIconSpacing() {
            return this.messageIconSpacing;
        }

        /* renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
        public final float getVerticalSpacing() {
            return this.verticalSpacing;
        }

        /* renamed from: copy-qDBjuR0, reason: not valid java name */
        public final Spacing m22017copyqDBjuR0(HorizontalPadding containerHorizontalPadding, float containerVerticalPadding, float containerIconSpacing, float messageIconSpacing, float verticalSpacing) {
            Intrinsics.checkNotNullParameter(containerHorizontalPadding, "containerHorizontalPadding");
            return new Spacing(containerHorizontalPadding, containerVerticalPadding, containerIconSpacing, messageIconSpacing, verticalSpacing, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacing)) {
                return false;
            }
            Spacing spacing = (Spacing) other;
            return Intrinsics.areEqual(this.containerHorizontalPadding, spacing.containerHorizontalPadding) && C2002Dp.m7997equalsimpl0(this.containerVerticalPadding, spacing.containerVerticalPadding) && C2002Dp.m7997equalsimpl0(this.containerIconSpacing, spacing.containerIconSpacing) && C2002Dp.m7997equalsimpl0(this.messageIconSpacing, spacing.messageIconSpacing) && C2002Dp.m7997equalsimpl0(this.verticalSpacing, spacing.verticalSpacing);
        }

        public int hashCode() {
            return (((((((this.containerHorizontalPadding.hashCode() * 31) + C2002Dp.m7998hashCodeimpl(this.containerVerticalPadding)) * 31) + C2002Dp.m7998hashCodeimpl(this.containerIconSpacing)) * 31) + C2002Dp.m7998hashCodeimpl(this.messageIconSpacing)) * 31) + C2002Dp.m7998hashCodeimpl(this.verticalSpacing);
        }

        public String toString() {
            return "Spacing(containerHorizontalPadding=" + this.containerHorizontalPadding + ", containerVerticalPadding=" + C2002Dp.m7999toStringimpl(this.containerVerticalPadding) + ", containerIconSpacing=" + C2002Dp.m7999toStringimpl(this.containerIconSpacing) + ", messageIconSpacing=" + C2002Dp.m7999toStringimpl(this.messageIconSpacing) + ", verticalSpacing=" + C2002Dp.m7999toStringimpl(this.verticalSpacing) + ")";
        }

        private Spacing(HorizontalPadding containerHorizontalPadding, float f, float f2, float f3, float f4) {
            Intrinsics.checkNotNullParameter(containerHorizontalPadding, "containerHorizontalPadding");
            this.containerHorizontalPadding = containerHorizontalPadding;
            this.containerVerticalPadding = f;
            this.containerIconSpacing = f2;
            this.messageIconSpacing = f3;
            this.verticalSpacing = f4;
        }

        public final HorizontalPadding getContainerHorizontalPadding() {
            return this.containerHorizontalPadding;
        }

        /* renamed from: getContainerVerticalPadding-D9Ej5fM, reason: not valid java name */
        public final float m22019getContainerVerticalPaddingD9Ej5fM() {
            return this.containerVerticalPadding;
        }

        /* renamed from: getContainerIconSpacing-D9Ej5fM, reason: not valid java name */
        public final float m22018getContainerIconSpacingD9Ej5fM() {
            return this.containerIconSpacing;
        }

        /* renamed from: getMessageIconSpacing-D9Ej5fM, reason: not valid java name */
        public final float m22020getMessageIconSpacingD9Ej5fM() {
            return this.messageIconSpacing;
        }

        /* renamed from: getVerticalSpacing-D9Ej5fM, reason: not valid java name */
        public final float m22021getVerticalSpacingD9Ej5fM() {
            return this.verticalSpacing;
        }
    }

    /* compiled from: TextInputStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextInputStyle$Typography;", "", "labelTextStyle", "Landroidx/compose/ui/text/TextStyle;", "valueTextStyle", "messageTextStyle", "characterLimitTextStyle", "hintTextStyle", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getLabelTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "getValueTextStyle", "getMessageTextStyle", "getCharacterLimitTextStyle", "getHintTextStyle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Typography {
        public static final int $stable = 0;
        private final androidx.compose.p011ui.text.TextStyle characterLimitTextStyle;
        private final androidx.compose.p011ui.text.TextStyle hintTextStyle;
        private final androidx.compose.p011ui.text.TextStyle labelTextStyle;
        private final androidx.compose.p011ui.text.TextStyle messageTextStyle;
        private final androidx.compose.p011ui.text.TextStyle valueTextStyle;

        public static /* synthetic */ Typography copy$default(Typography typography, androidx.compose.p011ui.text.TextStyle textStyle, androidx.compose.p011ui.text.TextStyle textStyle2, androidx.compose.p011ui.text.TextStyle textStyle3, androidx.compose.p011ui.text.TextStyle textStyle4, androidx.compose.p011ui.text.TextStyle textStyle5, int i, Object obj) {
            if ((i & 1) != 0) {
                textStyle = typography.labelTextStyle;
            }
            if ((i & 2) != 0) {
                textStyle2 = typography.valueTextStyle;
            }
            if ((i & 4) != 0) {
                textStyle3 = typography.messageTextStyle;
            }
            if ((i & 8) != 0) {
                textStyle4 = typography.characterLimitTextStyle;
            }
            if ((i & 16) != 0) {
                textStyle5 = typography.hintTextStyle;
            }
            androidx.compose.p011ui.text.TextStyle textStyle6 = textStyle5;
            androidx.compose.p011ui.text.TextStyle textStyle7 = textStyle3;
            return typography.copy(textStyle, textStyle2, textStyle7, textStyle4, textStyle6);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getLabelTextStyle() {
            return this.labelTextStyle;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getValueTextStyle() {
            return this.valueTextStyle;
        }

        /* renamed from: component3, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getMessageTextStyle() {
            return this.messageTextStyle;
        }

        /* renamed from: component4, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getCharacterLimitTextStyle() {
            return this.characterLimitTextStyle;
        }

        /* renamed from: component5, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getHintTextStyle() {
            return this.hintTextStyle;
        }

        public final Typography copy(androidx.compose.p011ui.text.TextStyle labelTextStyle, androidx.compose.p011ui.text.TextStyle valueTextStyle, androidx.compose.p011ui.text.TextStyle messageTextStyle, androidx.compose.p011ui.text.TextStyle characterLimitTextStyle, androidx.compose.p011ui.text.TextStyle hintTextStyle) {
            Intrinsics.checkNotNullParameter(labelTextStyle, "labelTextStyle");
            Intrinsics.checkNotNullParameter(valueTextStyle, "valueTextStyle");
            Intrinsics.checkNotNullParameter(messageTextStyle, "messageTextStyle");
            Intrinsics.checkNotNullParameter(characterLimitTextStyle, "characterLimitTextStyle");
            Intrinsics.checkNotNullParameter(hintTextStyle, "hintTextStyle");
            return new Typography(labelTextStyle, valueTextStyle, messageTextStyle, characterLimitTextStyle, hintTextStyle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Typography)) {
                return false;
            }
            Typography typography = (Typography) other;
            return Intrinsics.areEqual(this.labelTextStyle, typography.labelTextStyle) && Intrinsics.areEqual(this.valueTextStyle, typography.valueTextStyle) && Intrinsics.areEqual(this.messageTextStyle, typography.messageTextStyle) && Intrinsics.areEqual(this.characterLimitTextStyle, typography.characterLimitTextStyle) && Intrinsics.areEqual(this.hintTextStyle, typography.hintTextStyle);
        }

        public int hashCode() {
            return (((((((this.labelTextStyle.hashCode() * 31) + this.valueTextStyle.hashCode()) * 31) + this.messageTextStyle.hashCode()) * 31) + this.characterLimitTextStyle.hashCode()) * 31) + this.hintTextStyle.hashCode();
        }

        public String toString() {
            return "Typography(labelTextStyle=" + this.labelTextStyle + ", valueTextStyle=" + this.valueTextStyle + ", messageTextStyle=" + this.messageTextStyle + ", characterLimitTextStyle=" + this.characterLimitTextStyle + ", hintTextStyle=" + this.hintTextStyle + ")";
        }

        public Typography(androidx.compose.p011ui.text.TextStyle labelTextStyle, androidx.compose.p011ui.text.TextStyle valueTextStyle, androidx.compose.p011ui.text.TextStyle messageTextStyle, androidx.compose.p011ui.text.TextStyle characterLimitTextStyle, androidx.compose.p011ui.text.TextStyle hintTextStyle) {
            Intrinsics.checkNotNullParameter(labelTextStyle, "labelTextStyle");
            Intrinsics.checkNotNullParameter(valueTextStyle, "valueTextStyle");
            Intrinsics.checkNotNullParameter(messageTextStyle, "messageTextStyle");
            Intrinsics.checkNotNullParameter(characterLimitTextStyle, "characterLimitTextStyle");
            Intrinsics.checkNotNullParameter(hintTextStyle, "hintTextStyle");
            this.labelTextStyle = labelTextStyle;
            this.valueTextStyle = valueTextStyle;
            this.messageTextStyle = messageTextStyle;
            this.characterLimitTextStyle = characterLimitTextStyle;
            this.hintTextStyle = hintTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getLabelTextStyle() {
            return this.labelTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getValueTextStyle() {
            return this.valueTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getMessageTextStyle() {
            return this.messageTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getCharacterLimitTextStyle() {
            return this.characterLimitTextStyle;
        }

        public final androidx.compose.p011ui.text.TextStyle getHintTextStyle() {
            return this.hintTextStyle;
        }
    }

    /* compiled from: TextInputStyle.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000bJ\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u000bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u000bJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u000bJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006*"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextInputStyle$BorderColor;", "", "enabledColor", "Landroidx/compose/ui/graphics/Color;", "focusedColor", "successColor", "errorColor", "disabledColor", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnabledColor-0d7_KjU", "()J", "J", "getFocusedColor-0d7_KjU", "getSuccessColor-0d7_KjU", "getErrorColor-0d7_KjU", "getDisabledColor-0d7_KjU", "get", "Landroidx/compose/runtime/State;", "inputState", "Lcom/robinhood/compose/theme/style/TextInputStyle$InputState;", "(Lcom/robinhood/compose/theme/style/TextInputStyle$InputState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "copy", "copy-t635Npw", "(JJJJJ)Lcom/robinhood/compose/theme/style/TextInputStyle$BorderColor;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BorderColor {
        public static final int $stable = 0;
        private final long disabledColor;
        private final long enabledColor;
        private final long errorColor;
        private final long focusedColor;
        private final long successColor;

        /* compiled from: TextInputStyle.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InputState.values().length];
                try {
                    iArr[InputState.Enabled.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InputState.Focused.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InputState.Success.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InputState.Error.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[InputState.Disabled.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ BorderColor(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, j4, j5);
        }

        /* renamed from: copy-t635Npw$default, reason: not valid java name */
        public static /* synthetic */ BorderColor m21970copyt635Npw$default(BorderColor borderColor, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
            if ((i & 1) != 0) {
                j = borderColor.enabledColor;
            }
            long j6 = j;
            if ((i & 2) != 0) {
                j2 = borderColor.focusedColor;
            }
            return borderColor.m21976copyt635Npw(j6, j2, (i & 4) != 0 ? borderColor.successColor : j3, (i & 8) != 0 ? borderColor.errorColor : j4, (i & 16) != 0 ? borderColor.disabledColor : j5);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getEnabledColor() {
            return this.enabledColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getFocusedColor() {
            return this.focusedColor;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getSuccessColor() {
            return this.successColor;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getErrorColor() {
            return this.errorColor;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getDisabledColor() {
            return this.disabledColor;
        }

        /* renamed from: copy-t635Npw, reason: not valid java name */
        public final BorderColor m21976copyt635Npw(long enabledColor, long focusedColor, long successColor, long errorColor, long disabledColor) {
            return new BorderColor(enabledColor, focusedColor, successColor, errorColor, disabledColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BorderColor)) {
                return false;
            }
            BorderColor borderColor = (BorderColor) other;
            return Color.m6707equalsimpl0(this.enabledColor, borderColor.enabledColor) && Color.m6707equalsimpl0(this.focusedColor, borderColor.focusedColor) && Color.m6707equalsimpl0(this.successColor, borderColor.successColor) && Color.m6707equalsimpl0(this.errorColor, borderColor.errorColor) && Color.m6707equalsimpl0(this.disabledColor, borderColor.disabledColor);
        }

        public int hashCode() {
            return (((((((Color.m6713hashCodeimpl(this.enabledColor) * 31) + Color.m6713hashCodeimpl(this.focusedColor)) * 31) + Color.m6713hashCodeimpl(this.successColor)) * 31) + Color.m6713hashCodeimpl(this.errorColor)) * 31) + Color.m6713hashCodeimpl(this.disabledColor);
        }

        public String toString() {
            return "BorderColor(enabledColor=" + Color.m6714toStringimpl(this.enabledColor) + ", focusedColor=" + Color.m6714toStringimpl(this.focusedColor) + ", successColor=" + Color.m6714toStringimpl(this.successColor) + ", errorColor=" + Color.m6714toStringimpl(this.errorColor) + ", disabledColor=" + Color.m6714toStringimpl(this.disabledColor) + ")";
        }

        private BorderColor(long j, long j2, long j3, long j4, long j5) {
            this.enabledColor = j;
            this.focusedColor = j2;
            this.successColor = j3;
            this.errorColor = j4;
            this.disabledColor = j5;
        }

        /* renamed from: getEnabledColor-0d7_KjU, reason: not valid java name */
        public final long m21978getEnabledColor0d7_KjU() {
            return this.enabledColor;
        }

        /* renamed from: getFocusedColor-0d7_KjU, reason: not valid java name */
        public final long m21980getFocusedColor0d7_KjU() {
            return this.focusedColor;
        }

        /* renamed from: getSuccessColor-0d7_KjU, reason: not valid java name */
        public final long m21981getSuccessColor0d7_KjU() {
            return this.successColor;
        }

        /* renamed from: getErrorColor-0d7_KjU, reason: not valid java name */
        public final long m21979getErrorColor0d7_KjU() {
            return this.errorColor;
        }

        /* renamed from: getDisabledColor-0d7_KjU, reason: not valid java name */
        public final long m21977getDisabledColor0d7_KjU() {
            return this.disabledColor;
        }

        public final SnapshotState4<Color> get(InputState inputState, Composer composer, int i) {
            long j;
            Intrinsics.checkNotNullParameter(inputState, "inputState");
            composer.startReplaceGroup(1798616160);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1798616160, i, -1, "com.robinhood.compose.theme.style.TextInputStyle.BorderColor.get (TextInputStyle.kt:82)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[inputState.ordinal()];
            if (i2 == 1) {
                j = this.enabledColor;
            } else if (i2 == 2) {
                j = this.focusedColor;
            } else if (i2 == 3) {
                j = this.successColor;
            } else if (i2 == 4) {
                j = this.errorColor;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.disabledColor;
            }
            SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(j), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }
    }

    /* compiled from: TextInputStyle.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\tJ.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\""}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextInputStyle$PlaceholderColor;", "", "enabledColor", "Landroidx/compose/ui/graphics/Color;", "focusedColor", "disabledColor", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnabledColor-0d7_KjU", "()J", "J", "getFocusedColor-0d7_KjU", "getDisabledColor-0d7_KjU", "get", "Landroidx/compose/runtime/State;", "inputState", "Lcom/robinhood/compose/theme/style/TextInputStyle$InputState;", "(Lcom/robinhood/compose/theme/style/TextInputStyle$InputState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-ysEtTa8", "(JJJ)Lcom/robinhood/compose/theme/style/TextInputStyle$PlaceholderColor;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PlaceholderColor {
        public static final int $stable = 0;
        private final long disabledColor;
        private final long enabledColor;
        private final long focusedColor;

        /* compiled from: TextInputStyle.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InputState.values().length];
                try {
                    iArr[InputState.Enabled.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InputState.Focused.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InputState.Disabled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ PlaceholderColor(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3);
        }

        /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
        public static /* synthetic */ PlaceholderColor m22000copyysEtTa8$default(PlaceholderColor placeholderColor, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = placeholderColor.enabledColor;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = placeholderColor.focusedColor;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = placeholderColor.disabledColor;
            }
            return placeholderColor.m22004copyysEtTa8(j4, j5, j3);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getEnabledColor() {
            return this.enabledColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getFocusedColor() {
            return this.focusedColor;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getDisabledColor() {
            return this.disabledColor;
        }

        /* renamed from: copy-ysEtTa8, reason: not valid java name */
        public final PlaceholderColor m22004copyysEtTa8(long enabledColor, long focusedColor, long disabledColor) {
            return new PlaceholderColor(enabledColor, focusedColor, disabledColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlaceholderColor)) {
                return false;
            }
            PlaceholderColor placeholderColor = (PlaceholderColor) other;
            return Color.m6707equalsimpl0(this.enabledColor, placeholderColor.enabledColor) && Color.m6707equalsimpl0(this.focusedColor, placeholderColor.focusedColor) && Color.m6707equalsimpl0(this.disabledColor, placeholderColor.disabledColor);
        }

        public int hashCode() {
            return (((Color.m6713hashCodeimpl(this.enabledColor) * 31) + Color.m6713hashCodeimpl(this.focusedColor)) * 31) + Color.m6713hashCodeimpl(this.disabledColor);
        }

        public String toString() {
            return "PlaceholderColor(enabledColor=" + Color.m6714toStringimpl(this.enabledColor) + ", focusedColor=" + Color.m6714toStringimpl(this.focusedColor) + ", disabledColor=" + Color.m6714toStringimpl(this.disabledColor) + ")";
        }

        private PlaceholderColor(long j, long j2, long j3) {
            this.enabledColor = j;
            this.focusedColor = j2;
            this.disabledColor = j3;
        }

        /* renamed from: getEnabledColor-0d7_KjU, reason: not valid java name */
        public final long m22006getEnabledColor0d7_KjU() {
            return this.enabledColor;
        }

        /* renamed from: getFocusedColor-0d7_KjU, reason: not valid java name */
        public final long m22007getFocusedColor0d7_KjU() {
            return this.focusedColor;
        }

        /* renamed from: getDisabledColor-0d7_KjU, reason: not valid java name */
        public final long m22005getDisabledColor0d7_KjU() {
            return this.disabledColor;
        }

        public final SnapshotState4<Color> get(InputState inputState, Composer composer, int i) {
            long j;
            Intrinsics.checkNotNullParameter(inputState, "inputState");
            composer.startReplaceGroup(920491011);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(920491011, i, -1, "com.robinhood.compose.theme.style.TextInputStyle.PlaceholderColor.get (TextInputStyle.kt:102)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[inputState.ordinal()];
            if (i2 == 1) {
                j = this.enabledColor;
            } else if (i2 == 2) {
                j = this.focusedColor;
            } else if (i2 == 3) {
                j = this.disabledColor;
            } else {
                j = this.enabledColor;
            }
            SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(j), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }
    }

    /* compiled from: TextInputStyle.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\bJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextInputStyle$StateColor;", "", "enabledColor", "Landroidx/compose/ui/graphics/Color;", "disabledColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnabledColor-0d7_KjU", "()J", "J", "getDisabledColor-0d7_KjU", "get", "Landroidx/compose/runtime/State;", "inputState", "Lcom/robinhood/compose/theme/style/TextInputStyle$InputState;", "(Lcom/robinhood/compose/theme/style/TextInputStyle$InputState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Lcom/robinhood/compose/theme/style/TextInputStyle$StateColor;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StateColor {
        public static final int $stable = 0;
        private final long disabledColor;
        private final long enabledColor;

        /* compiled from: TextInputStyle.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InputState.values().length];
                try {
                    iArr[InputState.Disabled.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ StateColor(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2);
        }

        /* renamed from: copy--OWjLjI$default, reason: not valid java name */
        public static /* synthetic */ StateColor m22022copyOWjLjI$default(StateColor stateColor, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = stateColor.enabledColor;
            }
            if ((i & 2) != 0) {
                j2 = stateColor.disabledColor;
            }
            return stateColor.m22025copyOWjLjI(j, j2);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getEnabledColor() {
            return this.enabledColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getDisabledColor() {
            return this.disabledColor;
        }

        /* renamed from: copy--OWjLjI, reason: not valid java name */
        public final StateColor m22025copyOWjLjI(long enabledColor, long disabledColor) {
            return new StateColor(enabledColor, disabledColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateColor)) {
                return false;
            }
            StateColor stateColor = (StateColor) other;
            return Color.m6707equalsimpl0(this.enabledColor, stateColor.enabledColor) && Color.m6707equalsimpl0(this.disabledColor, stateColor.disabledColor);
        }

        public int hashCode() {
            return (Color.m6713hashCodeimpl(this.enabledColor) * 31) + Color.m6713hashCodeimpl(this.disabledColor);
        }

        public String toString() {
            return "StateColor(enabledColor=" + Color.m6714toStringimpl(this.enabledColor) + ", disabledColor=" + Color.m6714toStringimpl(this.disabledColor) + ")";
        }

        private StateColor(long j, long j2) {
            this.enabledColor = j;
            this.disabledColor = j2;
        }

        /* renamed from: getEnabledColor-0d7_KjU, reason: not valid java name */
        public final long m22027getEnabledColor0d7_KjU() {
            return this.enabledColor;
        }

        /* renamed from: getDisabledColor-0d7_KjU, reason: not valid java name */
        public final long m22026getDisabledColor0d7_KjU() {
            return this.disabledColor;
        }

        public final SnapshotState4<Color> get(InputState inputState, Composer composer, int i) {
            long j;
            Intrinsics.checkNotNullParameter(inputState, "inputState");
            composer.startReplaceGroup(558753509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(558753509, i, -1, "com.robinhood.compose.theme.style.TextInputStyle.StateColor.get (TextInputStyle.kt:120)");
            }
            if (WhenMappings.$EnumSwitchMapping$0[inputState.ordinal()] == 1) {
                j = this.disabledColor;
            } else {
                j = this.enabledColor;
            }
            SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(j), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }
    }

    /* compiled from: TextInputStyle.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ`\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u00020\f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u00020\f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001a¨\u00061"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextInputStyle$Colors;", "", "labelColor", "Lcom/robinhood/compose/theme/style/TextInputStyle$StateColor;", "borderColor", "Lcom/robinhood/compose/theme/style/TextInputStyle$BorderColor;", "placeholderColor", "Lcom/robinhood/compose/theme/style/TextInputStyle$PlaceholderColor;", "valueColor", "hintColor", "characterLimitColor", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "cursorColor", "<init>", "(Lcom/robinhood/compose/theme/style/TextInputStyle$StateColor;Lcom/robinhood/compose/theme/style/TextInputStyle$BorderColor;Lcom/robinhood/compose/theme/style/TextInputStyle$PlaceholderColor;Lcom/robinhood/compose/theme/style/TextInputStyle$StateColor;Lcom/robinhood/compose/theme/style/TextInputStyle$StateColor;Lcom/robinhood/compose/theme/style/TextInputStyle$StateColor;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLabelColor", "()Lcom/robinhood/compose/theme/style/TextInputStyle$StateColor;", "getBorderColor", "()Lcom/robinhood/compose/theme/style/TextInputStyle$BorderColor;", "getPlaceholderColor", "()Lcom/robinhood/compose/theme/style/TextInputStyle$PlaceholderColor;", "getValueColor", "getHintColor", "getCharacterLimitColor", "getBackgroundColor-0d7_KjU", "()J", "J", "getCursorColor-0d7_KjU", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component7-0d7_KjU", "component8", "component8-0d7_KjU", "copy", "copy-56GKwuk", "(Lcom/robinhood/compose/theme/style/TextInputStyle$StateColor;Lcom/robinhood/compose/theme/style/TextInputStyle$BorderColor;Lcom/robinhood/compose/theme/style/TextInputStyle$PlaceholderColor;Lcom/robinhood/compose/theme/style/TextInputStyle$StateColor;Lcom/robinhood/compose/theme/style/TextInputStyle$StateColor;Lcom/robinhood/compose/theme/style/TextInputStyle$StateColor;JJ)Lcom/robinhood/compose/theme/style/TextInputStyle$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final BorderColor borderColor;
        private final StateColor characterLimitColor;
        private final long cursorColor;
        private final StateColor hintColor;
        private final StateColor labelColor;
        private final PlaceholderColor placeholderColor;
        private final StateColor valueColor;

        public /* synthetic */ Colors(StateColor stateColor, BorderColor borderColor, PlaceholderColor placeholderColor, StateColor stateColor2, StateColor stateColor3, StateColor stateColor4, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stateColor, borderColor, placeholderColor, stateColor2, stateColor3, stateColor4, j, j2);
        }

        /* renamed from: copy-56GKwuk$default, reason: not valid java name */
        public static /* synthetic */ Colors m21988copy56GKwuk$default(Colors colors, StateColor stateColor, BorderColor borderColor, PlaceholderColor placeholderColor, StateColor stateColor2, StateColor stateColor3, StateColor stateColor4, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                stateColor = colors.labelColor;
            }
            if ((i & 2) != 0) {
                borderColor = colors.borderColor;
            }
            if ((i & 4) != 0) {
                placeholderColor = colors.placeholderColor;
            }
            if ((i & 8) != 0) {
                stateColor2 = colors.valueColor;
            }
            if ((i & 16) != 0) {
                stateColor3 = colors.hintColor;
            }
            if ((i & 32) != 0) {
                stateColor4 = colors.characterLimitColor;
            }
            if ((i & 64) != 0) {
                j = colors.backgroundColor;
            }
            if ((i & 128) != 0) {
                j2 = colors.cursorColor;
            }
            long j3 = j2;
            long j4 = j;
            StateColor stateColor5 = stateColor3;
            StateColor stateColor6 = stateColor4;
            return colors.m21991copy56GKwuk(stateColor, borderColor, placeholderColor, stateColor2, stateColor5, stateColor6, j4, j3);
        }

        /* renamed from: component1, reason: from getter */
        public final StateColor getLabelColor() {
            return this.labelColor;
        }

        /* renamed from: component2, reason: from getter */
        public final BorderColor getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component3, reason: from getter */
        public final PlaceholderColor getPlaceholderColor() {
            return this.placeholderColor;
        }

        /* renamed from: component4, reason: from getter */
        public final StateColor getValueColor() {
            return this.valueColor;
        }

        /* renamed from: component5, reason: from getter */
        public final StateColor getHintColor() {
            return this.hintColor;
        }

        /* renamed from: component6, reason: from getter */
        public final StateColor getCharacterLimitColor() {
            return this.characterLimitColor;
        }

        /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
        public final long getCursorColor() {
            return this.cursorColor;
        }

        /* renamed from: copy-56GKwuk, reason: not valid java name */
        public final Colors m21991copy56GKwuk(StateColor labelColor, BorderColor borderColor, PlaceholderColor placeholderColor, StateColor valueColor, StateColor hintColor, StateColor characterLimitColor, long backgroundColor, long cursorColor) {
            Intrinsics.checkNotNullParameter(labelColor, "labelColor");
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            Intrinsics.checkNotNullParameter(placeholderColor, "placeholderColor");
            Intrinsics.checkNotNullParameter(valueColor, "valueColor");
            Intrinsics.checkNotNullParameter(hintColor, "hintColor");
            Intrinsics.checkNotNullParameter(characterLimitColor, "characterLimitColor");
            return new Colors(labelColor, borderColor, placeholderColor, valueColor, hintColor, characterLimitColor, backgroundColor, cursorColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Intrinsics.areEqual(this.labelColor, colors.labelColor) && Intrinsics.areEqual(this.borderColor, colors.borderColor) && Intrinsics.areEqual(this.placeholderColor, colors.placeholderColor) && Intrinsics.areEqual(this.valueColor, colors.valueColor) && Intrinsics.areEqual(this.hintColor, colors.hintColor) && Intrinsics.areEqual(this.characterLimitColor, colors.characterLimitColor) && Color.m6707equalsimpl0(this.backgroundColor, colors.backgroundColor) && Color.m6707equalsimpl0(this.cursorColor, colors.cursorColor);
        }

        public int hashCode() {
            return (((((((((((((this.labelColor.hashCode() * 31) + this.borderColor.hashCode()) * 31) + this.placeholderColor.hashCode()) * 31) + this.valueColor.hashCode()) * 31) + this.hintColor.hashCode()) * 31) + this.characterLimitColor.hashCode()) * 31) + Color.m6713hashCodeimpl(this.backgroundColor)) * 31) + Color.m6713hashCodeimpl(this.cursorColor);
        }

        public String toString() {
            return "Colors(labelColor=" + this.labelColor + ", borderColor=" + this.borderColor + ", placeholderColor=" + this.placeholderColor + ", valueColor=" + this.valueColor + ", hintColor=" + this.hintColor + ", characterLimitColor=" + this.characterLimitColor + ", backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ", cursorColor=" + Color.m6714toStringimpl(this.cursorColor) + ")";
        }

        private Colors(StateColor labelColor, BorderColor borderColor, PlaceholderColor placeholderColor, StateColor valueColor, StateColor hintColor, StateColor characterLimitColor, long j, long j2) {
            Intrinsics.checkNotNullParameter(labelColor, "labelColor");
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            Intrinsics.checkNotNullParameter(placeholderColor, "placeholderColor");
            Intrinsics.checkNotNullParameter(valueColor, "valueColor");
            Intrinsics.checkNotNullParameter(hintColor, "hintColor");
            Intrinsics.checkNotNullParameter(characterLimitColor, "characterLimitColor");
            this.labelColor = labelColor;
            this.borderColor = borderColor;
            this.placeholderColor = placeholderColor;
            this.valueColor = valueColor;
            this.hintColor = hintColor;
            this.characterLimitColor = characterLimitColor;
            this.backgroundColor = j;
            this.cursorColor = j2;
        }

        public final StateColor getLabelColor() {
            return this.labelColor;
        }

        public final BorderColor getBorderColor() {
            return this.borderColor;
        }

        public final PlaceholderColor getPlaceholderColor() {
            return this.placeholderColor;
        }

        public final StateColor getValueColor() {
            return this.valueColor;
        }

        public final StateColor getHintColor() {
            return this.hintColor;
        }

        public final StateColor getCharacterLimitColor() {
            return this.characterLimitColor;
        }

        /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m21992getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        /* renamed from: getCursorColor-0d7_KjU, reason: not valid java name */
        public final long m21993getCursorColor0d7_KjU() {
            return this.cursorColor;
        }
    }

    /* compiled from: TextInputStyle.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextInputStyle$Style;", "", "sizing", "Lcom/robinhood/compose/theme/style/TextInputStyle$Sizing;", "spacing", "Lcom/robinhood/compose/theme/style/TextInputStyle$Spacing;", "typography", "Lcom/robinhood/compose/theme/style/TextInputStyle$Typography;", "colors", "Lcom/robinhood/compose/theme/style/TextInputStyle$Colors;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "<init>", "(Lcom/robinhood/compose/theme/style/TextInputStyle$Sizing;Lcom/robinhood/compose/theme/style/TextInputStyle$Spacing;Lcom/robinhood/compose/theme/style/TextInputStyle$Typography;Lcom/robinhood/compose/theme/style/TextInputStyle$Colors;Landroidx/compose/ui/Alignment$Horizontal;)V", "getSizing", "()Lcom/robinhood/compose/theme/style/TextInputStyle$Sizing;", "getSpacing", "()Lcom/robinhood/compose/theme/style/TextInputStyle$Spacing;", "getTypography", "()Lcom/robinhood/compose/theme/style/TextInputStyle$Typography;", "getColors", "()Lcom/robinhood/compose/theme/style/TextInputStyle$Colors;", "getHorizontalAlignment", "()Landroidx/compose/ui/Alignment$Horizontal;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Style {
        public static final int $stable = 0;
        private final Colors colors;
        private final Alignment.Horizontal horizontalAlignment;
        private final Sizing sizing;
        private final Spacing spacing;
        private final Typography typography;

        public static /* synthetic */ Style copy$default(Style style, Sizing sizing, Spacing spacing, Typography typography, Colors colors, Alignment.Horizontal horizontal, int i, Object obj) {
            if ((i & 1) != 0) {
                sizing = style.sizing;
            }
            if ((i & 2) != 0) {
                spacing = style.spacing;
            }
            if ((i & 4) != 0) {
                typography = style.typography;
            }
            if ((i & 8) != 0) {
                colors = style.colors;
            }
            if ((i & 16) != 0) {
                horizontal = style.horizontalAlignment;
            }
            Alignment.Horizontal horizontal2 = horizontal;
            Typography typography2 = typography;
            return style.copy(sizing, spacing, typography2, colors, horizontal2);
        }

        /* renamed from: component1, reason: from getter */
        public final Sizing getSizing() {
            return this.sizing;
        }

        /* renamed from: component2, reason: from getter */
        public final Spacing getSpacing() {
            return this.spacing;
        }

        /* renamed from: component3, reason: from getter */
        public final Typography getTypography() {
            return this.typography;
        }

        /* renamed from: component4, reason: from getter */
        public final Colors getColors() {
            return this.colors;
        }

        /* renamed from: component5, reason: from getter */
        public final Alignment.Horizontal getHorizontalAlignment() {
            return this.horizontalAlignment;
        }

        public final Style copy(Sizing sizing, Spacing spacing, Typography typography, Colors colors, Alignment.Horizontal horizontalAlignment) {
            Intrinsics.checkNotNullParameter(sizing, "sizing");
            Intrinsics.checkNotNullParameter(spacing, "spacing");
            Intrinsics.checkNotNullParameter(typography, "typography");
            Intrinsics.checkNotNullParameter(colors, "colors");
            Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
            return new Style(sizing, spacing, typography, colors, horizontalAlignment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Style)) {
                return false;
            }
            Style style = (Style) other;
            return Intrinsics.areEqual(this.sizing, style.sizing) && Intrinsics.areEqual(this.spacing, style.spacing) && Intrinsics.areEqual(this.typography, style.typography) && Intrinsics.areEqual(this.colors, style.colors) && Intrinsics.areEqual(this.horizontalAlignment, style.horizontalAlignment);
        }

        public int hashCode() {
            return (((((((this.sizing.hashCode() * 31) + this.spacing.hashCode()) * 31) + this.typography.hashCode()) * 31) + this.colors.hashCode()) * 31) + this.horizontalAlignment.hashCode();
        }

        public String toString() {
            return "Style(sizing=" + this.sizing + ", spacing=" + this.spacing + ", typography=" + this.typography + ", colors=" + this.colors + ", horizontalAlignment=" + this.horizontalAlignment + ")";
        }

        public Style(Sizing sizing, Spacing spacing, Typography typography, Colors colors, Alignment.Horizontal horizontalAlignment) {
            Intrinsics.checkNotNullParameter(sizing, "sizing");
            Intrinsics.checkNotNullParameter(spacing, "spacing");
            Intrinsics.checkNotNullParameter(typography, "typography");
            Intrinsics.checkNotNullParameter(colors, "colors");
            Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
            this.sizing = sizing;
            this.spacing = spacing;
            this.typography = typography;
            this.colors = colors;
            this.horizontalAlignment = horizontalAlignment;
        }

        public final Sizing getSizing() {
            return this.sizing;
        }

        public final Spacing getSpacing() {
            return this.spacing;
        }

        public final Typography getTypography() {
            return this.typography;
        }

        public final Colors getColors() {
            return this.colors;
        }

        public final Alignment.Horizontal getHorizontalAlignment() {
            return this.horizontalAlignment;
        }
    }
}
