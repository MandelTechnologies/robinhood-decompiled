package com.robinhood.android.designsystem.style;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScarletOverlays.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0007j\u0002\b\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/designsystem/style/CreditCardSystemOverlay;", "Lcom/robinhood/scarlet/ScarletOverlay;", "", "overlayAttributeId", "", "<init>", "(Ljava/lang/String;II)V", "DAY", "NIGHT", "styleReference", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getStyleReference", "()Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "priority", "getPriority", "()I", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CreditCardSystemOverlay implements ScarletOverlay {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CreditCardSystemOverlay[] $VALUES;
    public static final CreditCardSystemOverlay DAY = new CreditCardSystemOverlay("DAY", 0, C20690R.attr.dayTheme);
    public static final CreditCardSystemOverlay NIGHT = new CreditCardSystemOverlay("NIGHT", 1, C20690R.attr.nightTheme);
    private final DirectResourceReference<StyleResource> styleReference;

    private static final /* synthetic */ CreditCardSystemOverlay[] $values() {
        return new CreditCardSystemOverlay[]{DAY, NIGHT};
    }

    public static EnumEntries<CreditCardSystemOverlay> getEntries() {
        return $ENTRIES;
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public int getPriority() {
        return 123;
    }

    private CreditCardSystemOverlay(String str, int i, int i2) {
        this.styleReference = new DirectResourceReference<>(ResourceType.STYLE.INSTANCE, i2);
    }

    static {
        CreditCardSystemOverlay[] creditCardSystemOverlayArr$values = $values();
        $VALUES = creditCardSystemOverlayArr$values;
        $ENTRIES = EnumEntries2.enumEntries(creditCardSystemOverlayArr$values);
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public DirectResourceReference<StyleResource> getStyleReference() {
        return this.styleReference;
    }

    public static CreditCardSystemOverlay valueOf(String str) {
        return (CreditCardSystemOverlay) Enum.valueOf(CreditCardSystemOverlay.class, str);
    }

    public static CreditCardSystemOverlay[] values() {
        return (CreditCardSystemOverlay[]) $VALUES.clone();
    }
}
