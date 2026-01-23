package com.robinhood.android.charts.span;

import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.android.charts.span.SpanSelector5;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.utils.Either;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SpanSelector.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0016\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\u000fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/charts/span/SpanSelectorTrailingButton;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/charts/span/TrailingButtonData;", "onClick", "Lkotlin/Function0;", "", "<init>", "(Lcom/robinhood/android/charts/span/TrailingButtonData;Lkotlin/jvm/functions/Function0;)V", "icon", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/compose/bento/component/BentoIcons;", "Lcom/robinhood/android/charts/span/SpanSelectorTrailingButton$DrawableIcon;", "contentDescription", "", "(Lcom/robinhood/utils/Either;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getData", "()Lcom/robinhood/android/charts/span/TrailingButtonData;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "DrawableIcon", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class SpanSelectorTrailingButton {
    public static final int $stable = 8;
    private final SpanSelector5 data;
    private final Function0<Unit> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpanSelectorTrailingButton copy$default(SpanSelectorTrailingButton spanSelectorTrailingButton, SpanSelector5 spanSelector5, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            spanSelector5 = spanSelectorTrailingButton.data;
        }
        if ((i & 2) != 0) {
            function0 = spanSelectorTrailingButton.onClick;
        }
        return spanSelectorTrailingButton.copy(spanSelector5, function0);
    }

    /* renamed from: component1, reason: from getter */
    public final SpanSelector5 getData() {
        return this.data;
    }

    public final Function0<Unit> component2() {
        return this.onClick;
    }

    public final SpanSelectorTrailingButton copy(SpanSelector5 data, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new SpanSelectorTrailingButton(data, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanSelectorTrailingButton)) {
            return false;
        }
        SpanSelectorTrailingButton spanSelectorTrailingButton = (SpanSelectorTrailingButton) other;
        return Intrinsics.areEqual(this.data, spanSelectorTrailingButton.data) && Intrinsics.areEqual(this.onClick, spanSelectorTrailingButton.onClick);
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "SpanSelectorTrailingButton(data=" + this.data + ", onClick=" + this.onClick + ")";
    }

    public SpanSelectorTrailingButton(Either<? extends BentoIcon4, DrawableIcon> icon, String contentDescription, Function0<Unit> onClick) {
        SpanSelector5 drawable;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        if (!(icon instanceof Either.Left)) {
            if (!(icon instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            DrawableIcon drawableIcon = (DrawableIcon) ((Either.Right) icon).getValue();
            drawable = new SpanSelector5.Drawable(drawableIcon.getResourceId(), drawableIcon.m12151getSizeD9Ej5fM(), contentDescription, null);
        } else {
            drawable = new SpanSelector5.BentoIcon((BentoIcon4) ((Either.Left) icon).getValue(), contentDescription);
        }
        this(drawable, onClick);
    }

    public SpanSelectorTrailingButton(SpanSelector5 data, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.data = data;
        this.onClick = onClick;
    }

    public final SpanSelector5 getData() {
        return this.data;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    /* compiled from: SpanSelector.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/charts/span/SpanSelectorTrailingButton$DrawableIcon;", "", "resourceId", "", "size", "Landroidx/compose/ui/unit/Dp;", "<init>", "(IFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getResourceId", "()I", "getSize-D9Ej5fM", "()F", "F", "component1", "component2", "component2-D9Ej5fM", "copy", "copy-3ABfNKs", "(IF)Lcom/robinhood/android/charts/span/SpanSelectorTrailingButton$DrawableIcon;", "equals", "", "other", "hashCode", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DrawableIcon {
        public static final int $stable = 0;
        private final int resourceId;
        private final float size;

        public /* synthetic */ DrawableIcon(int i, float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, f);
        }

        /* renamed from: copy-3ABfNKs$default, reason: not valid java name */
        public static /* synthetic */ DrawableIcon m12148copy3ABfNKs$default(DrawableIcon drawableIcon, int i, float f, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = drawableIcon.resourceId;
            }
            if ((i2 & 2) != 0) {
                f = drawableIcon.size;
            }
            return drawableIcon.m12150copy3ABfNKs(i, f);
        }

        /* renamed from: component1, reason: from getter */
        public final int getResourceId() {
            return this.resourceId;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSize() {
            return this.size;
        }

        /* renamed from: copy-3ABfNKs, reason: not valid java name */
        public final DrawableIcon m12150copy3ABfNKs(int resourceId, float size) {
            return new DrawableIcon(resourceId, size, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrawableIcon)) {
                return false;
            }
            DrawableIcon drawableIcon = (DrawableIcon) other;
            return this.resourceId == drawableIcon.resourceId && C2002Dp.m7997equalsimpl0(this.size, drawableIcon.size);
        }

        public int hashCode() {
            return (Integer.hashCode(this.resourceId) * 31) + C2002Dp.m7998hashCodeimpl(this.size);
        }

        public String toString() {
            return "DrawableIcon(resourceId=" + this.resourceId + ", size=" + C2002Dp.m7999toStringimpl(this.size) + ")";
        }

        private DrawableIcon(int i, float f) {
            this.resourceId = i;
            this.size = f;
        }

        public final int getResourceId() {
            return this.resourceId;
        }

        /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
        public final float m12151getSizeD9Ej5fM() {
            return this.size;
        }
    }
}
