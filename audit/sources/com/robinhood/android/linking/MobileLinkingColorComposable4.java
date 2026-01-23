package com.robinhood.android.linking;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileLinkingColorComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/linking/MobileLinkingColorComposableType;", "", "totalSize", "Landroidx/compose/ui/unit/Dp;", "gradientRadius", "<init>", "(Ljava/lang/String;IFF)V", "getTotalSize-D9Ej5fM", "()F", "F", "getGradientRadius-D9Ej5fM", "SMALL", "LARGE", "lib-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.linking.MobileLinkingColorComposableType, reason: use source file name */
/* loaded from: classes8.dex */
public final class MobileLinkingColorComposable4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MobileLinkingColorComposable4[] $VALUES;
    private final float gradientRadius;
    private final float totalSize;
    public static final MobileLinkingColorComposable4 SMALL = new MobileLinkingColorComposable4("SMALL", 0, C2002Dp.m7995constructorimpl(12), C2002Dp.m7995constructorimpl(2));
    public static final MobileLinkingColorComposable4 LARGE = new MobileLinkingColorComposable4("LARGE", 1, C2002Dp.m7995constructorimpl(24), C2002Dp.m7995constructorimpl(6));

    private static final /* synthetic */ MobileLinkingColorComposable4[] $values() {
        return new MobileLinkingColorComposable4[]{SMALL, LARGE};
    }

    public static EnumEntries<MobileLinkingColorComposable4> getEntries() {
        return $ENTRIES;
    }

    private MobileLinkingColorComposable4(String str, int i, float f, float f2) {
        this.totalSize = f;
        this.gradientRadius = f2;
    }

    /* renamed from: getTotalSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTotalSize() {
        return this.totalSize;
    }

    /* renamed from: getGradientRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getGradientRadius() {
        return this.gradientRadius;
    }

    static {
        MobileLinkingColorComposable4[] mobileLinkingColorComposable4Arr$values = $values();
        $VALUES = mobileLinkingColorComposable4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(mobileLinkingColorComposable4Arr$values);
    }

    public static MobileLinkingColorComposable4 valueOf(String str) {
        return (MobileLinkingColorComposable4) Enum.valueOf(MobileLinkingColorComposable4.class, str);
    }

    public static MobileLinkingColorComposable4[] values() {
        return (MobileLinkingColorComposable4[]) $VALUES.clone();
    }
}
