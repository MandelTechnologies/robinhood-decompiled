package com.robinhood.android.designsystem.style;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScarletOverlays.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0007j\u0002\b\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "Lcom/robinhood/scarlet/ScarletOverlay;", "", "overlayAttributeId", "", "<init>", "(Ljava/lang/String;II)V", "DAY", "NIGHT", "styleReference", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getStyleReference", "()Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "priority", "getPriority", "()I", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DayNightOverlay implements ScarletOverlay {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DayNightOverlay[] $VALUES;
    public static final DayNightOverlay DAY = new DayNightOverlay("DAY", 0, C20690R.attr.dayTheme);
    public static final DayNightOverlay NIGHT = new DayNightOverlay("NIGHT", 1, C20690R.attr.nightTheme);
    private final ThemedResourceReference<StyleResource> styleReference;

    private static final /* synthetic */ DayNightOverlay[] $values() {
        return new DayNightOverlay[]{DAY, NIGHT};
    }

    public static EnumEntries<DayNightOverlay> getEntries() {
        return $ENTRIES;
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public int getPriority() {
        return 200;
    }

    private DayNightOverlay(String str, int i, int i2) {
        this.styleReference = new ThemedResourceReference<>(ResourceType.STYLE.INSTANCE, i2);
    }

    static {
        DayNightOverlay[] dayNightOverlayArr$values = $values();
        $VALUES = dayNightOverlayArr$values;
        $ENTRIES = EnumEntries2.enumEntries(dayNightOverlayArr$values);
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public ThemedResourceReference<StyleResource> getStyleReference() {
        return this.styleReference;
    }

    public static DayNightOverlay valueOf(String str) {
        return (DayNightOverlay) Enum.valueOf(DayNightOverlay.class, str);
    }

    public static DayNightOverlay[] values() {
        return (DayNightOverlay[]) $VALUES.clone();
    }
}
