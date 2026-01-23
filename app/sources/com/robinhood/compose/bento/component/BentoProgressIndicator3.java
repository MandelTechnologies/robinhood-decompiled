package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BentoProgressIndicator.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/CircularProgressIndicatorSize;", "", "size", "Landroidx/compose/ui/unit/Dp;", "strokeWidth", "<init>", "(Ljava/lang/String;IFF)V", "getSize-D9Ej5fM", "()F", "F", "getStrokeWidth-D9Ej5fM", "XL", "L", "M", "S", "XS", "XXS", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.CircularProgressIndicatorSize, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoProgressIndicator3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BentoProgressIndicator3[] $VALUES;
    private final float size;
    private final float strokeWidth;

    /* renamed from: XL */
    public static final BentoProgressIndicator3 f5152XL = new BentoProgressIndicator3("XL", 0, C2002Dp.m7995constructorimpl(80), C2002Dp.m7995constructorimpl(5));

    /* renamed from: L */
    public static final BentoProgressIndicator3 f5149L = new BentoProgressIndicator3("L", 1, C2002Dp.m7995constructorimpl(64), C2002Dp.m7995constructorimpl((float) 4.5d));

    /* renamed from: M */
    public static final BentoProgressIndicator3 f5150M = new BentoProgressIndicator3("M", 2, C2002Dp.m7995constructorimpl(48), C2002Dp.m7995constructorimpl((float) 3.5d));

    /* renamed from: S */
    public static final BentoProgressIndicator3 f5151S = new BentoProgressIndicator3("S", 3, C2002Dp.m7995constructorimpl(24), C2002Dp.m7995constructorimpl((float) 2.5d));

    /* renamed from: XS */
    public static final BentoProgressIndicator3 f5153XS = new BentoProgressIndicator3("XS", 4, C2002Dp.m7995constructorimpl(16), C2002Dp.m7995constructorimpl(2));
    public static final BentoProgressIndicator3 XXS = new BentoProgressIndicator3("XXS", 5, C2002Dp.m7995constructorimpl(12), C2002Dp.m7995constructorimpl((float) 1.5d));

    private static final /* synthetic */ BentoProgressIndicator3[] $values() {
        return new BentoProgressIndicator3[]{f5152XL, f5149L, f5150M, f5151S, f5153XS, XXS};
    }

    public static EnumEntries<BentoProgressIndicator3> getEntries() {
        return $ENTRIES;
    }

    private BentoProgressIndicator3(String str, int i, float f, float f2) {
        this.size = f;
        this.strokeWidth = f2;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSize() {
        return this.size;
    }

    /* renamed from: getStrokeWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    static {
        BentoProgressIndicator3[] bentoProgressIndicator3Arr$values = $values();
        $VALUES = bentoProgressIndicator3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(bentoProgressIndicator3Arr$values);
    }

    public static BentoProgressIndicator3 valueOf(String str) {
        return (BentoProgressIndicator3) Enum.valueOf(BentoProgressIndicator3.class, str);
    }

    public static BentoProgressIndicator3[] values() {
        return (BentoProgressIndicator3[]) $VALUES.clone();
    }
}
