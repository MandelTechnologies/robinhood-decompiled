package androidx.constraintlayout.compose;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConstraintLayoutBaseScope.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, m3636d2 = {"Landroidx/constraintlayout/compose/ChainParams;", "", "Landroidx/compose/ui/unit/Dp;", "startMargin", "topMargin", "endMargin", "bottomMargin", "startGoneMargin", "topGoneMargin", "endGoneMargin", "bottomGoneMargin", "", "weight", "<init>", "(FFFFFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "getStartMargin-D9Ej5fM", "()F", "getTopMargin-D9Ej5fM", "getEndMargin-D9Ej5fM", "getBottomMargin-D9Ej5fM", "getStartGoneMargin-D9Ej5fM", "getTopGoneMargin-D9Ej5fM", "getEndGoneMargin-D9Ej5fM", "getBottomGoneMargin-D9Ej5fM", "getWeight", "Companion", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.constraintlayout.compose.ChainParams, reason: use source file name */
/* loaded from: classes4.dex */
public final class ConstraintLayoutBaseScope2 {
    private static final ConstraintLayoutBaseScope2 Default;
    private final float bottomGoneMargin;
    private final float bottomMargin;
    private final float endGoneMargin;
    private final float endMargin;
    private final float startGoneMargin;
    private final float startMargin;
    private final float topGoneMargin;
    private final float topMargin;
    private final float weight;

    public /* synthetic */ ConstraintLayoutBaseScope2(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9);
    }

    private ConstraintLayoutBaseScope2(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.startMargin = f;
        this.topMargin = f2;
        this.endMargin = f3;
        this.bottomMargin = f4;
        this.startGoneMargin = f5;
        this.topGoneMargin = f6;
        this.endGoneMargin = f7;
        this.bottomGoneMargin = f8;
        this.weight = f9;
    }

    /* renamed from: getStartMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStartMargin() {
        return this.startMargin;
    }

    /* renamed from: getTopMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopMargin() {
        return this.topMargin;
    }

    /* renamed from: getEndMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEndMargin() {
        return this.endMargin;
    }

    /* renamed from: getBottomMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomMargin() {
        return this.bottomMargin;
    }

    /* renamed from: getStartGoneMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStartGoneMargin() {
        return this.startGoneMargin;
    }

    /* renamed from: getTopGoneMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopGoneMargin() {
        return this.topGoneMargin;
    }

    /* renamed from: getEndGoneMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEndGoneMargin() {
        return this.endGoneMargin;
    }

    /* renamed from: getBottomGoneMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomGoneMargin() {
        return this.bottomGoneMargin;
    }

    public final float getWeight() {
        return this.weight;
    }

    static {
        float f = 0;
        Default = new ConstraintLayoutBaseScope2(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), Float.NaN, null);
    }
}
